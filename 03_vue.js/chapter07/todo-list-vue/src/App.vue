<script setup>
import InputTodo from './components/InputTodo.vue';
import TodoList from './components/TodoList.vue';
</script>

<template>
  <div style="display: flex; flex-direction: column; align-items: center">
    <h1>Min TodoList</h1>
    <InputTodo @add-Todo="addTodo" />
    <TodoList
      :todoList="todoList"
      @toggleCompleted="toggleCompleted"
      @deleteTodo="deleteTodo"
    />
  </div>
</template>

<script>
export default {
  components: { InputTodo, TodoList },
  data() {
    return {
      todoList: [
        {
          id: 1,
          todo: 'TodoList만들기',
          completed: false,
        },

        {
          id: 2,
          todo: 'Vue공부하기',
          completed: true,
        },
        {
          id: 3,
          todo: '운동하기',
          completed: false,
        },
        {
          id: 4,
          todo: '꿀잠때리기',
          completed: false,
        },
      ],
    };
  },
  methods: {
    addTodo(todo) {
      this.todoList.push({
        id: this.todoList.length + 1,
        todo: todo.todo,
        completed: false,
      });
    },
    toggleCompleted(id) {
      const index = this.todoList.findIndex(function (item, index) {
        return id === item.id;
      });
      this.todoList[index].completed = !this.todoList[index].completed;
    },
    deleteTodo(id) {
      const index = this.todoList.findIndex((item) => id === item.id);
      this.todoList.splice(index, 1);
    },
  },
};
</script>

<style scoped></style>
