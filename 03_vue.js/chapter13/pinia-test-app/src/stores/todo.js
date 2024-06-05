import { reactive, computed } from 'vue';
import { defineStore } from 'pinia';

export const useTodoListStore = defineStore('todoList', () => {
  const state = reactive({
    todoList: [
      { id: 1, todo: 'ES6학습', done: false },
      { id: 2, todo: 'React학습', done: false },
      { id: 3, todo: 'ContextAPI 학습', done: true },
      { id: 4, todo: '야구경기 관람', done: false },
    ],
  });
  //todo : todo가 이름이 같아서 생략 가능 todo는 다른 곳에 있기 때문에 매개변수로 받아옴
  const addTodo = (todo) => {
    state.todoList.push({ id: new Date().getTime(), todo, done: false });
  };
  const deleteTodo = (id) => {
    const index = state.todoList.findIndex((todo) => todo.id === id);
    state.todoList.splice(index, 1);
  };

  const toggleDone = (id) => {
    const index = state.todoList.findIndex((todo) => todo.id === id);
    state.todoList[index].done = !state.todoList[index].done;
  };
  //(todoItem) =>todoItem.done===true + return 지우기로도 가능함
  const doneCount = computed(() => {
    return state.todoList.filter((todoItem) => todoItem.done === true).length;
  });
  const todoList = computed(() => state.todoList);

  return { todoList, doneCount, addTodo, deleteTodo, toggleDone };
});
