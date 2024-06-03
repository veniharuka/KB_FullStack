<template>
  <div class="card card-body">
    <h2>Members</h2>
    <ul>
      <li>
        <router-link :to="{ name: 'MemberDetail', params: { id: 1 } }"
          >조원 1: 공연정</router-link
        >
      </li>
      <li>
        <router-link :to="{ name: 'MemberDetail', params: { id: 2 } }"
          >조원 2: 이태웅</router-link
        >
      </li>
      <li>
        <router-link :to="{ name: 'MemberDetail', params: { id: 3 } }"
          >조원 3: 최민준</router-link
        >
      </li>
      <li>
        <router-link :to="{ name: 'MemberDetail', params: { id: 4 } }"
          >조원 4: 최현수</router-link
        >
      </li>
    </ul>
  </div>
</template>

<script>
export default {
  name: 'Members',
};
</script>

<style scoped>
h2 {
  color: violet;
}
ul {
  list-style-type: none;
  padding: 0;
}
li {
  margin: 10px 0;
}
</style>
