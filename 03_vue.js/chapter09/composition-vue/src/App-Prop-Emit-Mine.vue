<template>
  <div>
    <p>{{ msg }}</p>
    <ChildComponent :randomNumber="randNum" @emit-num="emitHandler" />
  </div>
</template>

<script setup>
import { ref } from 'vue';
import ChildComponent from './components/ChildQuizComponent.vue';

const msg = ref('랜덤 숫자를 맞춰 주세요!');

const randNum = Math.floor(Math.random() * 21);
const result = ref('');

function emitHandler(payload) {
  const inputNum = parseInt(payload);
  if (inputNum < randNum) {
    result.value = 'Up';
  } else if (inputNum > randNum) {
    result.value = 'Down';
  } else {
    result.value = '정답입ㄴ다.';
  }
}
</script>
