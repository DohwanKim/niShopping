import { defaultGet, defaultPost } from './apiService';
import { cartType } from '../types/cart';

// 관리자에 의해 상품 정보 변경시
const updateCart = async (cartInfo: cartType) => {
  return defaultPost('/cart/update', cartInfo);
}

const getCart = async (uid: string, pid: string, quantity: number) => {
  return defaultGet('/cart/get', { uid, pid, quantity });
};

const clearCart = async (uid: string) => {
  return defaultGet('/cart/clear', { uid });
};

const deleteCart = async (uid: string, pid: string) => {
  return defaultGet('/cart/delete', { uid, pid });
};

// 중복 확인 필요
const addCart = async (uid: string, pid: string, quantity: number, totalPrice: number) => {
  return defaultGet('/cart/add', { uid, pid, quantity, totalPrice });
};

export {
  updateCart,
  getCart,
  clearCart,
  deleteCart,
  addCart,
};
