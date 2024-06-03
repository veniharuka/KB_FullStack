<template>
  <nav class="navbar navbar-expand-md bg-dark navbar-dark mt-2">
    <span class="navbar-brand">오죠사마 5조에 어서와요 </span>
    <button class="navbar-toggler" type="button" @click="changeIsNavShow">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div :class="navClass">
      <ul class="navbar-nav">
        <li class="nav-item">
          <router-link class="nav-link" to="/">홈</router-link>
        </li>
        <li class="nav-item">
          <router-link class="nav-link" to="/about">최현수</router-link>
        </li>

        <li class="nav-item">
          <router-link class="nav-link" to="/Gong">공연정</router-link>
        </li>
        <li class="nav-item">
          <router-link class="nav-link" to="/Moon">이태웅</router-link>
        </li>
        <li class="nav-item">
          <router-link class="nav-link" to="/Choi">최민준</router-link>
        </li>
      </ul>
    </div>
  </nav>
</template>

<script>
import { reactive, computed } from 'vue';
export default {
  setup() {
    const state = reactive({ isNavShow: false });
    const navClass = computed(() =>
      state.isNavShow
        ? 'collapse navbar-collapse show'
        : 'collapse navbar-collapse'
    );
    const changeIsNavShow = () => {
      state.isNavShow = !state.isNavShow;
    };
    return { state, changeIsNavShow, navClass };
  },
};
</script>
