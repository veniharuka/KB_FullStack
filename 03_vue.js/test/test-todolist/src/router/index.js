import { createRouter, createWebHistory } from 'vue-router';
import Home from '@/pages/Home.vue';
import Login from '@/pages/Login.vue';
import Todo from '@/pages/Todo.vue';

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: '/',
      name: 'home',
      component: Home,
    },
    {
      path: '/login',
      name: 'login',
      // route level code-splitting
      // this generates a separate chunk (About.[hash].js) for this route
      // which is lazy-loaded when the route is visited.
      component: Login,
    },
    {
      path: '/todo',
      name: 'todo',
      component: Todo,
      meta: { requireAuth: true },
    },
  ],
});

router.beforeEach((to, from, next) => {
  if (to.matched.some((item) => item.meta.requireAuth)) {
    if (localStorage.getItem('auth') !== true) {
      alert('로그인이 필요하므니다.');
      next({ name: 'Login' });
    } else {
      next();
    }
  } else {
    next();
  }
});

export default router;
