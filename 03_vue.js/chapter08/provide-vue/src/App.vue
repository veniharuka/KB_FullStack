<script setup>
import Child from './components/Child.vue';
</script>

<template>
  <div><Child :drilling="drilling" /></div>
</template>

<script>
export default {
  name: 'App',
  data() {
    return {
      drilling: '어디까지 내려가나요~',
    };
  },
  provide() {
    return {
      fly: '앙~ 한 번에 와버렸 띄',
    };
  },
};
</script>
