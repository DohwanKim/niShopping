import axios from 'axios';
import AuthService from './AuthService';
import { userType } from '../types/user';

let userData: userType = {
  id: 0,
  userId: '',
  name: '',
  nickName: '',
  userImage: '',
  gender: 0,
  address: '',
  birthDate: '',
  phoneNumber: '',
  phoneNumberVerified: 0,
  email: '',
  emailVerify: 0,
  isFirstLogin: 0,
  registerDate: '',
  lastLoggedIn: '',
};

export default {
  updateUserInfo(updateUserData: userType) {
    userData = updateUserData;
    /*
    TODO: userType 타입의 데이터를 어떻게 보낼지 의논 필요. 우선 주석.
    1. 단순 axios 이용. 데이터를 필요한 것만 때내서 보내는 방법.
    return axios({
       method: 'GET',
       url: `${baseUrl}/userinfo/info/updateinfo`,
       userData,
    });
    2. apiService가 TypeScript가 되면 유저 타입 자체를 보내며, 필요한 데이터를 솎아내는 작업은 apiService에서 작업.
    return defaultGet('/userinfo/info/updateInfo', UserData: userType);
    */
  },

  getUserInfo(): userType {
    new AuthService().getUser().then((res) => {
      if (res) {
        userData.email = res.profile.email;
        userData.name = res.profile.name;
        userData.nickName = res.profile.nickname;
        userData.userImage = res.profile.picture;
        userData.address = res.profile.address;
        userData.phoneNumber = res.profile.phoneNumber;
      } else {
        userData.email = '불러오기 실패';
      }
    });
    return userData;
  },

  checkFirstLogin() {
    new AuthService().getUser().then((res) => {
      /* TODO : 첫로그인 여부 확인을 가진 DB나 AuthService 필요.
      --이하 예제 코드--
      checkLogin = res.profile.isFirstLogin;
      if(checkLogin === 0){
        return false
      } else {
        return ture;
      }
      */
    });
  },
  //TODO: 더 필요한 유저 서비스 말해주세용.
};
