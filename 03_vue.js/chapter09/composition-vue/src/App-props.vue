<template>
  <div>
    <PropsChild :msg="msg" />
    <!-- <Vue3Count /> -->
  </div>
</template>

<script setup>
import { ref } from 'vue';
// import Vue3Count from './components/Vue3Count.vue';
import PropsChild from './components/PropsChild.vue';
const msg = ref('props로 전달 될 메세지');
</script>
