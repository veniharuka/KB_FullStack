<template>
  <main>
    <h1>Login</h1>
    아이디 : <input type="text" v.model.trim="userId" />
    <br />
    패스워드 : <input type="password" v.model.trim="userPassword" />
    <br />
    <button>로그인</button>
    &nbsp;
    <button>로그아웃</button>
  </main>
</template>

<script setup>
import axios from 'axios';
import { useRouter } from 'vue-router';
import { ref } from 'vue';

const userId = ref('');
const password = ref('');

async function login() {
  try {
    const url = 'http://localhost:3000/users';
    const loginRes = await axios.get(url);

    const userArr = loginRes.data;

    const findedUser = userArr.find(function (item, index) {
      return item.id === userId.value;
    });
    if (findedUser === undefined)
      return alert('해당 ID를 가지는 사용자가 존재하지 않습니다.');

    alert('로그인 성공');
    return router.push({ name: 'todo' });
  } catch (e) {
    alert('로그인 통신 err 발생');
    console.log(e);
  }
}
</script>
