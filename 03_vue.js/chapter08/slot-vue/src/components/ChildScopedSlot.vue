<template>
  <div>
    <slot v-bind:msg="msg"></slot>
  </div>
</template>

<script>
export default {
  name: 'ChildScopedSlot',
  data() {
    return {
      msg: '과연 나는 어떤 태그에 들어갈까?! 느어어어무 궁금하다!',
    };
  },
};
</script>

<style lang="scss" scoped></style>
