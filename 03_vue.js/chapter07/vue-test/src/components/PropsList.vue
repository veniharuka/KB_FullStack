<template>
  <div>
    <h1>{{ siteName }}</h1>
    <a :href="siteUrl">{{ siteName }} 링크</a>
    <p>방문 여부: {{ visited }}</p>
    <hr />
  </div>
</template>

<script>
export default {
  name: 'PropsList',
  props: ['siteName', 'siteUrl', 'visited'],
};
</script>

<style lang="scss" scoped></style>
