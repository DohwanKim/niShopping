import Vue from 'vue';
import VueRouter from 'vue-router';
import Main from '../views/MainView.vue';
import UserMenuView from '../views/UserMenuView.vue';
import UserInfoView from '../views/user/InfoView.vue';

Vue.use(VueRouter);

const routes = [
  {
    path: '/',
    name: 'Main',
    component: Main,
  },
  {
    path: '/user/',
    name: 'UserMenuView',
    component: UserMenuView,
  },
  {
    path: '/user/info',
    name: 'UserInfoView',
    component: UserInfoView,
  },
];

const router = new VueRouter({
  mode: 'history',
  base: process.env.BASE_URL,
  routes,
});

export default router;
