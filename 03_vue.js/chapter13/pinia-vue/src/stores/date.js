import { ref, computed } from 'vue';
import { defineStore } from 'pinia';

export const useDateStore = defineStore('date', () => {
  const date = new Date();

  const year = date.getFullYear();
  const month = date.getMonth() + 1;
  const day = date.getDate();
  const dateMsg = ref('');

  function getYear() {
    console.log(year);
    dateMsg.value = `오늘은 ${year}년 입니다`;
  }
  function getMonth() {
    dateMsg.value = `오늘은 ${month}월 입니다`;
  }
  function getDate() {
    dateMsg.value = `오늘은 ${day}일 입니다`;
  }
  return { dateMsg, getYear, getMonth, getDate };
});
