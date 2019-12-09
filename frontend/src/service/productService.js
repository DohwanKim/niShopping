import { defaultGet, defaultPost } from './apiService';

const createProduct = async (productInfo) => {
  return defaultPost('/product/create', productInfo);
};

// Update의 경우, 단순히 productInfo를 날려도 되는가?
const updateProduct = async (productInfo) => {
  return defaultPost('/product/update', productInfo);
};

const findAllProduct = async (order) => {
  return defaultGet(`/product/find/all?order=${order}`);
};

const findById = async (pid) => {
  return defaultGet(`/product/find?pid=${pid}`);
};

const findByGenre = async (genre) => {
  return defaultGet(`/product/find?genre=${genre}`);
};

export {
  createProduct,
  updateProduct,
  findAllProduct,
  findById,
  findByGenre,
};
