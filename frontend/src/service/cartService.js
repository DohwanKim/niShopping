import { defaultGet, defaultPost } from './apiService';

// 관리자에 의해 상품 정보 변경시
const updateCart = async (cartInfo) => {
  return defaultPost('/cart/update', cartInfo);
}

const getCart = async (uid, pid, quantity) => {
  return defaultGet(`/cart/get?uid=${uid}&pid=${pid}&quantity=${quantity}`);
};

const clearCart = async (uid) => {
  return defaultGet(`/cart/clear?uid=${uid}`);
};

const deleteCart = async (uid, pid) => {
  return defaultGet(`/cart/delete?uid=${uid}&pid=${pid}`);
};

// 중복 확인 필요
const addCart = async (uid, pid, quantity, totalPrice) => {
  return defaultGet(`/cart/add?uid=${uid}&pid=${pid}&quantity=${quantity}&totalprice=${totalPrice}`);
};

export {
  updateCart,
  getCart,
  clearCart,
  deleteCart,
  addCart,
};
