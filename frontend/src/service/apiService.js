import axios from 'axios'
import AuthService from './AuthService'

const baseUrl = 'http://localhost:9000';
var user = new AuthService();

export default class ApiService {
  async defineHeaderAxios () {
    await user.getUser().then(
      userInfo => {
        axios.defaults.headers.common['Authorization'] = 'Bearer ' + userInfo.id_token;
      }, err => {
        console.log(err)
      })  
  }

  async defaultGet(api){
    await this.defineHeaderAxios() 
    return axios
      .get(baseUrl + api)
      .then(response => response.data)
      .catch(err => {
        console.log(err);
      })
  }
}
