<template>
  <div>
    <FancyPhotoBox>
      <template v-slot:title>
        <h1>호구마호구마 호박고구마</h1>
      </template>
      <template v-slot:photo>
        <img
          src="C:\KB_FullStack\03_vue.js\chapter08\slot-vue\src\components\sweetPotato.jpg"
          alt="베니하루카"
        />
      </template>
    </FancyPhotoBox>
  </div>
</template>

<script>
import FancyPhotoBox from './FancyPhotoBox.vue';
export default {
  name: 'ParentFancyPhotoBox',
  components: { FancyPhotoBox },
};
</script>

<style lang="scss" scoped></style>
