<template>
  <div>
    <h1>Counter</h1>
    <h1>count : {{ count }}</h1>
    <h1>count x 2 : {{ doubleCount }}</h1>
    <button @click="increment">+1</button>
  </div>
</template>

<script setup>
import { computed } from 'vue';
import { useCounterStore } from '@/stores/counter';

const counterStore = useCounterStore();
const { increment } = counterStore;
// 한 번에 구조분해 할당으로 가져올 수 있는 것 처럼 보이나 불가능함

const count = computed(() => counterStore.count);
const doubleCount = computed(() => counterStore.doubleCount);
</script>
