import Vue from 'vue';
import Vuex from 'vuex';
import { userType } from '../types/user';
import { stateType } from '../types/state';
import { cartType, cartTypeArray } from '../types/cart';
import { likeType } from '../types/like';

Vue.use(Vuex);

const state: stateType = {
  user: {
    id: 0,
    userId: 'uid',
    name: 'name',
    nickName: 'nickname',
    userImage: 'userimage',
    gender: 1,
    address: 'address',
    birthDate: 'birth',
    phoneNumber: 'phone',
    phoneNumberVerified: 1,
    email: 'email',
    emailVerify: 1,
    registerDate: 'registerdate',
    lastLoggedIn: 'lastloggedin',
  },
  cart: {
    123141251: {
      id: 0,
      userId: 'userid',
      productId: '123141251',
      quantity: 2,
      totalPrice: 23400,
    },
    32531241: {
      id: 1,
      userId: 'userid',
      productId: '32531241',
      quantity: 1,
      totalPrice: 29700,
    },
  },
  like: [
    {
      id: 0,
      userId: 'userid',
      productId: 145346234,
    },
    {
      id: 3,
      userId: 'userid',
      productId: 25476576,
    },
  ],
};

export default new Vuex.Store({
  state,
  mutations: {
    userInfoChange(state: stateType, userInfo: userType) {
      state.user = userInfo;
    },
    fetchCartInfo(state: stateType, cartInfo: cartTypeArray) {
      state.cart = cartInfo;
    },
    addItemToCartInfo(state: stateType, cartInfo: cartType) {
      state.cart[cartInfo.productId] = cartInfo;
    },
    clearCartInfo(state: stateType) {
      state.cart = {};
    },
    dropFromCart(state: stateType, cartInfo: cartType) {
      delete state.cart[cartInfo.productId];
    },
    fetchLikeInfo(state: stateType, likeInfo: Array<likeType>) {
      state.like = likeInfo;
    },
    addItemToLikeInfo(state: stateType, likeInfo: likeType) {
      state.like.push(likeInfo);
    },
  },
  actions: {
    setUserInfo({ commit }, userInfo: userType) {
      commit('userInfoChange', userInfo);
    },
    setCartInfo({ commit }, cartInfo: Array<cartType>) {
      /* 선행 로직  */
      /* 호출전 유저 로그인 여부 확인 -> 로그인 중 -> DB에 상품 정보 INSERT -> 성공 */
      commit('fetchCartInfo', cartInfo);
    },
    addCartInfo({ commit }, cartInfo: cartType) {
      /* 선행 로직  */
      /* 호출전 유저 로그인 여부 확인 -> 로그인 중 -> DB에 상품 정보 INSERT -> 성공 */
      commit('addItemToCartInfo', cartInfo);
    },
    clearProductInfoInCart({ commit }) {
      commit('clearCartInfo');
    },
    deleteProductInfoInCart({ commit }, cartInfo: cartType) {
      commit('dropFromCart', cartInfo);
    },
    setLikeInfo({ commit }, likeInfo: Array<likeType>) {
      commit('fetchLikeInfo', likeInfo);
    },
    addLikeInfo({ commit }, likeInfo: likeType) {
      commit('addItemToLikeInfo', likeInfo);
    },
  },
});
