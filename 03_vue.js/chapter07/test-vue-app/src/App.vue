<script setup>
import HelloWorld from '03_vue.js\chapter07\test-vue-app\src\components\HelloWorld.vue';
import TheWelcome from '03_vue.js\chapter07\test-vue-app\src\components\TheWelcome.vue';
</script>

<template>
  <div>
    <h2>App 컴포넌트</h2>
    <hr />
    <ul>
      <CheckboxItem />
      <CheckboxItem />
      <CheckboxItem />
      <CheckboxItem />
    </ul>
  </div>
</template>
<script>
import CheckboxItem from './components/CheckboxItem.vue';
export default {
  name: 'App',
  components: { CheckboxItem },
};
</script>

<style scoped>
header {
  line-height: 1.5;
}

.logo {
  display: block;
  margin: 0 auto 2rem;
}

@media (min-width: 1024px) {
  header {
    display: flex;
    place-items: center;
    padding-right: calc(var(--section-gap) / 2);
  }

  .logo {
    margin: 0 2rem 0 0;
  }

  header .wrapper {
    display: flex;
    place-items: flex-start;
    flex-wrap: wrap;
  }
}
</style>
