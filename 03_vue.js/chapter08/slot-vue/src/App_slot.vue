<script setup>
import ParentSlot from './components/ParentSlot.vue';
</script>

<template><ParentSlot /></template>

<script>
export default {
  name: 'App',
  components: {
    ParentSlot,
  },
};
</script>

<style scoped></style>
