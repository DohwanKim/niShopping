import Vue from 'vue';
import VueRouter from 'vue-router';
import Main from '../views/MainView.vue';
import MyInfoView from '../views/MyInfoView.vue';
import UserInfoView from '../views/user/InfoView.vue';
import UserCartView from '../views/user/CartView.vue';
import UserLikeView from '../views/user/LikeView.vue';
import UserOrderView from '../views/user/OrderView.vue';
import UserOrderDetailView from '../views/user/OrderDetailView.vue';
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
    path: '/myinfo',
    name: 'MyInfo',
    component: MyInfoView,
    meta: {
      requireAuth: true,
    },
  },
  {
    path: '/myinfo/info',
    name: 'UserInfoView',
    component: UserInfoView,
    meta: {
      requireAuth: true,
    },
  },
  {
    path: '/myinfo/cart',
    name: 'UserCartView',
    component: UserCartView,
    meta: {
      requireAuth: true,
    },
  },
  {
    path: '/myinfo/like',
    name: 'UserLikeView',
    component: UserLikeView,
    meta: {
      requireAuth: true,
    },
  },
  {
    path: '/myinfo/order',
    name: 'UserOrderView',
    component: UserOrderView,
    meta: {
      requireAuth: true,
    },
  },
  {
    path: '/myinfo/order/detail',
    name: 'UserOrderDetailView',
    component: UserOrderDetailView,
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
