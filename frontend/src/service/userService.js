import axios from 'axios';

const baseUrl = 'http://localhost:8080';

export default {
  updateUserInfo(userInfo) {
    console.log(userInfo);
    return axios({
      method: 'GET',
      url: `${baseUrl}/userinfo/info/updateinfo`,
      userInfo,
    });
  },

  checkFirstLogin() {
    //여기서 할지 vue자체에서 할지 고민 중
    //어차피 AuthService에서 Verify체크하고 boolean 리턴 하는 짧은 문장.
    //의견 필요.
  },

};
