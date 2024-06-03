import { createRouter, createWebHistory } from 'vue-router';
import Home from '@/pages/Home.vue';
import About from '@/pages/About.vue';
import Members from '@/pages/Members.vue';
import Gong from '@/pages/Gong.vue';
import Moon from '@/pages/Moon.vue';
import Choi from '@/pages/Choi.vue';
// import Videos from '@/pages/Videos.vue';
import MemberInfo from '@/pages/MemberInfo.vue';

const router = createRouter({
  history: createWebHistory(),
  routes: [
    { path: '/', component: Home },
    { path: '/about', component: About },
    { path: '/members', component: Members },
    // { path: '/videos', component: Videos },
    { path: '/MemberInfo', component: MemberInfo },
    { path: '/Choi', component: Choi },
    { path: '/Moon', component: Moon },
    { path: '/Gong', component: Gong },
  ],
});
export default router;
