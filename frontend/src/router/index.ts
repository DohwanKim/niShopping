import Vue from 'vue';
import VueRouter from 'vue-router';
import Main from '../views/MainView.vue';
import UserMenuView from '../views/UserMenuView.vue';
import UserInfoView from '../views/user/InfoView.vue';
import AuthService from '../service/AuthService'

Vue.use(VueRouter);

const routes = [
  {
    path: '/',
    name: 'Main',
    component: Main,
    meta: {
      requireAuth: false,
    },
  },
  {
    path: '/user',
    name: 'UserMenuView',
    component: UserMenuView,
    meta: {
      requireAuth: true,
    },
  },
  {
    path: '/user/info',
    name: 'UserInfoView',
    component: UserInfoView,
    meta: {
      requireAuth: true,
    },
  },
];

const router = new VueRouter({
  mode: 'history',
  base: process.env.BASE_URL,
  routes,
});

const authService = new AuthService();
router.beforeEach(async (to, _, next) => {
  let user = await authService.getUser();
  if (to.path === '/callback'){
    await authService.siginCallback();
    next('/');
  }
  if (to.meta.requireAuth && user == null) {
    await authService.signIn();
  }
  next();
});

export default router;
