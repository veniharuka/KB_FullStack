<script setup>
import CheckList from './components/CheckList.vue';
import TodoProps from './components/TodoProps.vue';
</script>

<style>
.todo {
  text-align: center;
}
</style>

<template>
  <div class="todo">
    <h1>오늘의 할 일</h1>
    <CheckList />
    <hr />
    <TodoProps todo="Vue 부수기" />
    <TodoProps todo="배열함수끝장내기" />
    <CheckList />
  </div>
</template>
