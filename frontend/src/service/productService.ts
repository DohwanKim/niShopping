import { defaultGet, defaultPost } from './apiService';
import { productType } from '../types/product';


const createProduct = async (productInfo: productType) => {
  return defaultPost('/product/create', productInfo);
};

// Update의 경우, 단순히 productInfo를 날려도 되는가?
const updateProduct = async (productInfo: productType) => {
  return defaultPost('/product/update', productInfo);
};

const findAllProduct = async (order: string) => {
  return defaultGet('/product/find/all',{ order });
};

const findById = async (pid: string) => {
  return defaultGet('/product/find', { pid });
};

const findByGenre = async (genre: string) => {
  return defaultGet('/product/find,', { genre });
};

export {
  createProduct,
  updateProduct,
  findAllProduct,
  findById,
  findByGenre,
};
