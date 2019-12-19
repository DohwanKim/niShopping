import { defaultGet } from './apiService';

const addLikeToLike = async (uid: string, pid: string) => {
  return defaultGet('/like/add', { uid, pid });
};

const deleteLikeFromLike = async (uid: string, pid: string) => {
  return defaultGet('/like/delete', { uid, pid });
};

const clearLikeFromLike = async (uid: string) => {
  return defaultGet('/like/clear', { uid });
};

const getLikeFromLike = async (uid: string, pid: string) => {
  return defaultGet('/like/get', { uid, pid });
};

export {
  addLikeToLike,
  deleteLikeFromLike,
  clearLikeFromLike,
  getLikeFromLike,
};
