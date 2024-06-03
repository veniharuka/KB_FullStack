<template>
  <div class="card card-body">
    <h2>{{ member.name }} 소개</h2>
    <p>{{ member.description }}</p>
    <router-link to="/members">뒤로가기</router-link>
  </div>
</template>

<script>
export default {
  name: 'MemberDetail',
  data() {
    return {
      members: [
        { id: 1, name: '공연정', description: '공연정의 상세 설명입니다.' },
        { id: 2, name: '이태웅', description: '이태웅의 상세 설명입니다.' },
        { id: 3, name: '최민준', description: '최민준의 상세 설명입니다.' },
        { id: 4, name: '최현수', description: '최현수의 상세 설명입니다.' },
      ],
      member: {},
    };
  },
  created() {
    const memberId = this.$route.params.id;
    this.member = this.members.find((member) => member.id == memberId);
  },
};
</script>

<style scoped>
h2 {
  color: violet;
}
</style>
