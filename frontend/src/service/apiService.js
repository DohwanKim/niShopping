import axios from 'axios';
import AuthService from './AuthService';

const baseUrl = 'http://localhost:9000';
const user = new AuthService();

const defineHeaderAxios = async () => {
  await user.getUser().then(
    (userInfo) => {
      axios.defaults.headers.common.Authorization = `Bearer ${userInfo.id_token}`;
    }, (err) => {
      console.log(err);
    },
  );
};

const defaultGet = async (api, data) => {
  await defineHeaderAxios();
  return axios
    .get(baseUrl + api, {
      params: {
        ...data,
      },
    })
    .then(response => response.data)
    .catch((err) => {
      console.log(err);
    });
};

const defaultPost = async (api, data) => {
  await defineHeaderAxios();
  return axios
    .post(baseUrl + api, data)
    .then(response => response.data)
    .catch((err) => {
      console.log(err);
    });
};

export {
  defaultGet,
  defaultPost,
};
