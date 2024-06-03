<script setup>
import ParentScopedSlot from './components/ParentScopedSlot.vue';
</script>

<template>
  <div><ParentScopedSlot /></div>
</template>

<script>
export default {
  name: 'App',
  components: {
    ParentScopedSlot,
  },
};
</script>

<style scoped></style>
