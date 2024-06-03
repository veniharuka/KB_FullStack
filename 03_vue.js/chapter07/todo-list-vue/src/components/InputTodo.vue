<template>
  <div>
    <input type="text" v-model.trim="todo" placeholder="할 일 추가하시오." />
    <button @click="$emit('addTodo', { todo })">추가</button>
  </div>
</template>

<script>
export default {
  name: 'InputTodo',
  data() {
    return {
      todo: '',
    };
  },
};
</script>

<style lang="scss" scoped></style>
