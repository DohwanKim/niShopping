import Vue from 'vue';
import Vuex from 'vuex';

Vue.use(Vuex);

export default new Vuex.Store({
  state: {
    userInfo : Object,
  },
  mutations: {
    userInfoChange(state, userInfo){
      state.userInfo = userInfo;
    }
  },
  actions: {
    setUserInfo({ commit }, userInfo) {
      commit('userInfoChange', userInfo);
    }
  },
});
