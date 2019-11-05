import { UserManager, WebStorageStateStore } from 'oidc-client';
import {
  authConfig,
  clientConfig,
  clientUrl,
  otherConfig
} from '../config/authConfig';

var uManager = new UserManager({
  userStore: new WebStorageStateStore(),
  ...authConfig,
  ...clientConfig,
  ...clientUrl,
  ...otherConfig
});

uManager.events.addUserLoaded(function (user) {  
  console.log('New User Loaded：', arguments);
  console.log('Acess_token: ', user.access_token)
});

uManager.events.addAccessTokenExpiring(function () {
  console.log('AccessToken Expiring：', arguments);
});

uManager.events.addAccessTokenExpired(function () {
  console.log('AccessToken Expired：', arguments);  
  alert('Session expired. Going out!');
  uManager.signoutRedirect().then(function (resp) {
    console.log('signed out', resp);
  }).catch(function (err) {
    console.log(err)
  })
});

uManager.events.addSilentRenewError(function () {
  console.error('Silent Renew Error：', arguments);
});

uManager.events.addUserSignedOut(function () {
  alert('Going out!');
  console.log('UserSignedOut：', arguments);  
  uManager.signoutRedirect().then(function (resp) {
    console.log('signed out', resp);
  }).catch(function (err) {
    console.log('signed out', err)
  })
});

class AuthService {
  signIn() {
    return uManager.signinRedirect();
  }

  getUser() {
    return uManager.getUser();
  }

  renewToken() {
    return uManager.signinSilent();
  }

  async signOut () {    
    return await uManager.signoutPopup().then(function (resp) {
      console.log('signed out', resp);
    }).catch(function (err) {
      console.log(err)
    }) 
  }

  async siginCallback() {
    return await uManager.signinCallback()
      .then(user=>{ console.log("success", user) })
      .catch((err)=>{ alert("something error",err) })
  }

  async signOutCallback() {
    return await uManager.signoutRedirectCallback()
      .then(user=>{ console.log("success", user) })
      .catch((err)=>{ alert("something error",err )})
  }
}

export default AuthService;
