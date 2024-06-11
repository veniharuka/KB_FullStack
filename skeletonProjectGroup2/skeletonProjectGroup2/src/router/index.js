import { createRouter, createWebHistory } from 'vue-router';
import Home from '@/pages/Home.vue';
import Calendar from '@/pages/Calendar.vue';
import Add from '@/pages/Add.vue';
import Settings from '@/pages/Settings.vue';
const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: '/',
      name: 'home',
      component: Home,
    },
    {
      path: '/calendar',
      name: 'Calendar',
      component: Calendar,
    },
    {
      path: '/add',
      name: 'Add',
      component: Add,
    },
    {
      path: '/settings',
      name: 'Settings',
      component: Settings,
    },
  ],
});

export default router;
