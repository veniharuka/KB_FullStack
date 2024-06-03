<template>
  <div class="facncy">
    <slot name="tilte"></slot>
    <slot name="photo"></slot>
  </div>
</template>

<script>
export default {
  name: 'FancyPhotoBox',
};
</script>

<style>
.fancy {
  text-align: center;
  padding: 30px;
  border-radius: 30px;
  border: 10px solid #ccc;
  margin-top: 30px 0px;
  border-color: violet;
}
</style>
