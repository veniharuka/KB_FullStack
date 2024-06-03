<template>
  <div>
    <h1>{{ count }}</h1>
    <h1>x={{ obj.x }} / y= {{ obj.y }}</h1>
    <h1>multiple = {{ double }}</h1>
    <h2>지금까지 계산한 횟수 : {{ clickCount }}</h2>
    <button @click="increment">+1</button>
    <button @click="decrement">-1</button>
  </div>
</template>

<script setup>
import { reactive, ref, computed } from 'vue';

const count = ref(2);
const obj = reactive({ x: 0, y: 0, result: 0 });

const clickCount = ref(0);

const double = computed(function () {
  return count.value * 2;
});
function increment() {
  count.value++;
  clickCount.value++;
}
function decrement() {
  count.value--;
  clickCount.value++;
}
</script>
