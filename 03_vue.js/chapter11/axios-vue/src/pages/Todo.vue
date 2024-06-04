<template>
  <div>
    <!--입력 파트-->
    <h1>Todo List</h1>
  </div>
  <div>
    <input type="text" v-model.trim="todo" />
    <button @click="addTodo">추가</button>
  </div>
  <!--리스트 파트-->
  <ol>
    <!--투두 항목-->
    <li v-for="todoItem in states.todoList" :key="todoItem.id">
      <span
        :style="
          todoItem.done
            ? { textDecoration: 'line-through' }
            : { textDecoration: 'none' }
        "
        @click.stop="toggleTodo(todoItem.id)"
        >{{ todoItem.todo }} {{ todoItem.done ? '(완료)' : '' }}</span
      >
      <!-- 수정 모드-->
      <div v-if="todoItem.editing">
        <input type="text" v-model.trim="todoEdit" />
        <button @click.stop="confirmEditTodo(todoItem.id)">확인</button>
        <button @click.stop="cancelEditTodo(todoItem.id)">취소</button>
      </div>
      &nbsp;
      <!-- 수정 및 삭제 버튼-->
      <span v-if="!todoItem.editing">
        <button @click.stop="editTodo(todoItem.id)">수정</button>
        /
        <button @click.stop="deleteTodo(todoItem.id)">삭제</button>
      </span>
    </li>
  </ol>
</template>

<script setup>
import axios from 'axios';
import { ref, reactive } from 'vue';

const states = reactive({
  todolist: [],
});
const todo = ref('');
//localhost:3000
const BASEURL = '/api/todos';
const todoEdit = ref('');
async function fetchTodoList() {
  try {
    const fetchTodoRes = await axios.get(BASEURL);

    states.todoList = fetchTodoRes.data;
    console.log(states.todoList);
  } catch (error) {
    alert('TodoList 데이터 통신 Err발생');
    console.log(error);
  }
}

async function addTodo() {
  if (todo.value === '') return alert('할 일을 입력하라 임마!');
  try {
    const newTodo = { todo: todo.value, done: false };
    const addTodoRes = await axios.post(BASEURL, newTodo);

    if (addTodoRes.status !== 201) return alert('Todo 추가 실패!');
    todo.value = '';
    fetchTodoList();
  } catch (error) {
    alert('TodoList 추가 작업 중, Err 발생 ');
    console.log(error);
  }
}

async function deleteTodo(id) {
  try {
    const deleteTodoRes = await axios.delete(BASEURL + `/${id}`);

    if (deleteTodoRes.status !== 200) {
      alert('삭제 실패!');
    }
    fetchTodoList();
  } catch (error) {
    alert('Todolist 삭제 작업 중, ERR 발생');
    console.log(error);
  }
}

async function toggleTodo(id) {
  try {
    const targetTodo = states.todoList.find((todo) => todo.id === id);
    const payload = { ...targetTodo, done: !targetTodo.done };
    const toggleTodoRes = await axios.put(BASEURL + `/${id}`, payload);
    if (toggleTodoRes.status !== 200) return alert('Todo 변경 실패');
    fetchTodoList();
  } catch (err) {
    alert('Todolist 토글 작업 중, ERR 발생');
    console.log(err);
  }
}

function editTodo(id) {
  const targetTodo = states.todoList.find((todo) => todo.id === id);
  targetTodo.editing = true;
}

function cancelEditTodo(id) {
  const targetTodo = states.todoList.find((todo) => todo.id === id);
  targetTodo.editing = false;
}

async function confirmEditTodo(id) {
  if (todoEdit.value === '') return alert('마! 수정 내용 입력해라 마 ㅏ!');

  try {
    const targetTodo = states.todoList.find((todo) => todo.id === id);
    const payload = { ...targetTodo, todo: todoEdit.value, editing: false };

    const toggleTodoRes = await axios.put(BASEURL + `/${id}`, payload);
    if (toggleTodoRes.status !== 200) return alert('Todo 수정 실패');
    todoEdit.value = '';

    fetchTodoList();
  } catch (error) {
    alert('수정 작업 중 ERR 발생');
    console.log(error);
  }
}

fetchTodoList();
</script>
