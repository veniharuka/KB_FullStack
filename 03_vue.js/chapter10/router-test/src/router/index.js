import { createRouter, createWebHistory } from 'vue-router';
import Dynamic from '@/pages/Dynamic.vue';
import NotFound from '@/pages/NotFound.vue';
import Home from '@/pages/Home.vue';

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: '/',
      name: 'home',
      component: Home,
    },
    {
      path: '/:pathMatch(.*)*',
      name: 'NotFound',
      component: NotFound,
    },
    {
      path: '/about',
      name: 'about',
      component: () => import('@/pages/About.vue'),
    },
    {
      path: '/dynamic/:mood',
      name: 'Dynamic',
      component: Dynamic,
      props: true,
    },
  ],
});

export default router;
