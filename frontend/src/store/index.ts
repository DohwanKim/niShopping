import Vue from 'vue';
import Vuex from 'vuex';
import { userType } from '../types/user';
import { productType } from '../types/product';
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
  product: {
    id: 0,
    name: 'TEST',
    price: 39000,
    salesRate: 9.9,
    promotion: 'test',
    seller: 'test',
    image: 'test',
    stock: 213,
    summary: 'test',
    score: 4.5,
    release: 'test',
    translator: 'test',
    author: 'test',
    publisher: 'test',
    size: 'test',
    weight: 'test',
    pages: 213,
  },
}

export default new Vuex.Store({
  state,
  mutations: {
    userInfoChange(state: stateType, userInfo: userType) {
      state.user = userInfo;
    },
    productInfoChange(state: stateType, productInfo: productType) {
      state.product = productInfo;
    },
  },
  actions: {
    setUserInfo({ commit }, userInfo: userType) {
      commit('userInfoChange', userInfo);
    },
    setProductInfo({ commit }, productInfo: productType) {
      commit('productInfoChange', productInfo);
    },
  },
});
