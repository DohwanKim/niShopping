import Vue from 'vue';
import VueRouter from 'vue-router';
import Main from '../views/MainView.vue';
import AuthService from '../service/AuthService';
import store from '../store'

Vue.use(VueRouter);

const routes = [
  {
    path: '/',
    name: 'Main',
    component: Main,
    meta: {
      requireAuth:true
    }
  },
];

const router = new VueRouter({
  mode: 'history',
  base: process.env.BASE_URL,
  routes,
});

const authService = new AuthService();

router.beforeEach(async (to, from, next)=>{
  var user = await authService.getUser();
  if(to.path === '/callback'){
    await authService.siginCallback();
    next('/')
  }
  if(to.path === '/logout'){
    await authService.signOutCallback();
    await authService.signIn();
  }
  if(to.meta.requireAuth && user==null){
    document.location.href = "https://dev-z1noh6-s.auth0.com/v2/logout?returnTo=http%3A%2F%2Flocalhost%3A8080%logout"
  }
  // store.commit('userInfoChange', user);
  // console.log("test",store.state.userInfo);
  next();
});

export default router;
