<template>
  <div>
    <!--입력 파트-->
    <h1>Todo List</h1>
  </div>
  <div>
    <input type="text" v-model.trim="todo" />
    <button>추가</button>
  </div>
  <!--리스트 파트-->
  <ol>
    <!--투두 항목-->
    <li>
      <span>목표 : 투두 리스트 만들기</span>
      &nbsp;
      <span>
        <button>수정</button>
        /
        <button>삭제</button>
      </span>
    </li>
  </ol>
</template>

<script setup>
import axios from 'axios';
import { ref, reactive } from 'vue';

const states = reactiv({
  todolist: [],
});

//localhost:3000
const BASEURL = '/api/todos';

async function fetchTodoList() {
  try {
    const fetchTodoRes = await axios.get(BASEURL);
    console.log(fetchTodoRes.data);
  } catch (error) {
    alert('TodoList 데이터 통신 Err발생');
    console.log(error);
  }
}
fetchTodoList();
</script>
