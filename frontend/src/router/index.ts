import Vue from 'vue';
import VueRouter from 'vue-router';
import Main from '../views/MainView.vue';
import SettingView from '../views/SettingView.vue';
import UserInfoView from '../views/user/InfoView.vue';
import UserCartView from '../views/user/CartView.vue';

import AuthService from '../service/AuthService';


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
    path: '/setting',
    name: 'Setting',
    component: SettingView,
    meta: {
      requireAuth: ture,
    },
  },
  {
    path: '/setting/info',
    name: 'UserInfoView',
    component: UserInfoView,
    meta: {
      requireAuth: true,
    },
  },
  {
    path: '/setting/cart',
    name: 'UserCartView',
    component: UserCartView,
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
  if (to.path === '/callback') {
    await authService.siginCallback();
    next('/');
  }
  if (to.meta.requireAuth && user == null) {
    await authService.signIn();
  }
  next();
});

export default router;
