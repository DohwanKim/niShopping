import { defaultGet } from './apiService';

const addLikeToLike = async (uid, pid) => {
  return defaultGet(`/like/add?uid=${uid}&pid=${pid}`);
};

const deleteLikeFromLike = async (uid, pid) => {
  return defaultGet(`/like/delete?uid=${uid}&pid=${pid}`);
};

const clearLikeFromLike = async (uid) => {
  return defaultGet(`/like/clear?uid=${uid}`);
};

const getLikeFromLike = async (uid, pid) => {
  return defaultGet(`/like/get?uid=${uid}&pid=${pid}`);
};

export {
  addLikeToLike,
  deleteLikeFromLike,
  clearLikeFromLike,
  getLikeFromLike,
};
