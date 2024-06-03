<template>
  <div>
    <input type="text" v-model.trim="inputNum" />
    <button @click="sendNum">정답!</button>
  </div>
</template>

<script setup>
import { ref, defineEmits, defineProps } from 'vue';

const porps = defineProps({
  randomNumber: {
    type: Number,
    required: true,
  },
});
const inputNum = ref('');
const emit = defineEmits(['send-Num']);
function sendNum() {
  emit('send-Num', inputNum.value);
}
</script>
