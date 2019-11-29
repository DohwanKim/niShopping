import Vue from 'vue';
import Vuex from 'vuex';
import { userType } from '../types/user';
import { stateType } from '../types/state';

Vue.use(Vuex);

const state: stateType = {
  user: {
    id: 0,
    userId: 'test',
    name: 'test',
    nickName: 'test',
    userImage: 'test',
    gender: 1,
    address: 'test',
    birthDate: 'test',
    phoneNumber: 'test',
    phoneNumberVerified: 1,
    email: 'test',
    emailVerify: 1,
    registerDate: 'test',
    lastLoggedIn: 'test',
  },
};

export default new Vuex.Store({
  state,
  mutations: {
    userInfoChange(state: stateType, userInfo: userType) {
      state.user = userInfo;
    },
  },
  actions: {
    setUserInfo({ commit }, userInfo: userType) {
      commit('userInfoChange', userInfo);
    },
  },
});
