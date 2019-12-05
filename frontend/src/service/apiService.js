import axios from 'axios'
import AuthService from './AuthService'

const baseUrl = 'http://localhost:9000';
var user = new AuthService();

const defineHeaderAxios = async () => {
  await user.getUser().then(
    userInfo => {
      axios.defaults.headers.common['Authorization'] = 'Bearer ' + userInfo.id_token;
    }, err => {
      console.log(err)
    })
};

const defaultGet = async (api) => {
  await defineHeaderAxios();
  return axios
    .get(baseUrl + api)
    .then(response => response.data)
    .catch(err => {
      console.log(err);
    })
};

export {
  defaultGet
}
