<template>
  <div>
    <h1>Date</h1>
    <h3>{{ dateMsg }}</h3>
    <button @click="getYear">년도 출력</button>
    <button @click="getMonth">월 출력</button>
    <button @click="getDate">일자 출력</button>
  </div>
</template>

<script setup>
import { computed } from 'vue';
import { useDateStore } from '@/stores/date';
const dateStore = useDateStore();
const dateMsg = computed(() => dateStore.dateMsg);
// 원시형 데이터이기 때문에 반드시 computed로 따로 선언할것
console.log(dateMsg);

const { getYear, getMonth, getDate } = dateStore;
</script>
