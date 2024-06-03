<template>
  <div style="border: solid 1x gray; padding: 5px">
    이름: <input type="text" v-model="name" />
    <button @click="$emit('nameChanged', { name })">이벤트 발신</button>
  </div>
</template>
<script>
export default {
  name: 'InputName',
  emits: ['nameChanged1'], // nameChanged1 이외의 이벤트 발생시 경고 출력
  data() {
    return { name: '' };
  },
};
</script>
