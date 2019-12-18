import AuthService from './AuthService';
import { userType } from '../types/user';
import { defaultGet } from './apiService';

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

let firstLoginVerify: boolean;

export default {
  async updateUserInfo(updateUserData: userType) {
    console.log(updateUserData);
    return defaultGet('/userinfo/info/updateInfo', updateUserData);
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
        // userData.isFirstLogin = res.profile.isfirstLogin;
      } else {
        userData.email = '불러오기 실패';
      }
    });
    return userData;
  },

  checkFirstLogin(): boolean {
    new AuthService().getUser().then((res) => {
      if (res) {
        firstLoginVerify = res.profile.isfirstLogin === 0;
      }
    });
    return firstLoginVerify;
  },
};
