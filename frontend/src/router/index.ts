import Vue from 'vue';
import VueRouter from 'vue-router';
import Main from '../views/MainView.vue';
import MyInfoView from '../views/MyInfoView.vue';
import UserInfoView from '../views/user/InfoView.vue';
import UserCartView from '../views/user/CartView.vue';
import UserLikeView from '../views/user/LikeView.vue';
import UserOrderView from '../views/user/OrderView.vue';
import UserOrderDetailView from '../views/user/OrderDetailView.vue';
import FinalOrderView from '../views/user/FinalOrderView.vue';
import AuthService from '../service/AuthService';
import DetailProductView from '../views/product/DetailProductView.vue';
import QnaBoardView from '../views/board/QnaBoardView.vue';

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
  {
    path: '/myinfo/finalorder',
    name: 'FinalOrdrerView',
    component: FinalOrderView,
    meta: {
      requireAuth: true,
    },
  },
  {
    path: '/product/:productId',
    name: 'DetailProductView',
    component: DetailProductView,
    props: true,
    meta: {
      requireAuth: false,
    },
  },
  {
    path: '/qnaboard',
    name: 'QnaBoardView',
    component: QnaBoardView,
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
  console.log(user);
  if (to.path === '/callback') {
    await authService.siginCallback();
    next('/');
  }
  if (to.path === '/logout') {
    alert('success logout');
    next('/');
  }
  if (to.meta.requireAuth && user == null) {
    await authService.signIn();
  }
  next();
});

export default router;
