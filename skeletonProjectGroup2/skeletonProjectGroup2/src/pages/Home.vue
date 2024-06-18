<template>
  <div class="container">
    <div class="btn-group btn-group-sm rounded-pill">
      <button>dsd</button
      ><button
        type="button"
        class="btn btn-primary rounded-pill"
        style="width: 90px; position: relative; left: 0"
      >
        일일
      </button>
      <button
        type="button"
        class="btn btn-primary rounded-pill"
        style="width: 100px; position: absolute; left: 80px"
      >
        월별
      </button>
      <button
        type="button"
        class="btn btn-primary rounded-pill"
        style="width: 100px; position: relative; left: 90px"
      >
        요약
      </button>
    </div>

    <div class="header">
      <div class="header-left">
        <button @click="prevMonth"><i class="mdi mdi-chevron-left"></i></button>
      </div>
      <div class="header-center">
        <p>{{ currentYearMonth }}</p>
      </div>
      <div class="header-right">
        <button @click="nextMonth">
          <i class="mdi mdi-chevron-right"></i>
        </button>
      </div>
    </div>
    <div class="summary">
      <div>
        <button>
          <span class="income">{{ income }} 수입</span>
        </button>
      </div>
      <div>
        <button>
          지출<span class="expenses">{{ expenses }}</span>
        </button>
      </div>
      <div>
        <span class="totalBalance">합계{{ totalBalance }}</span>
      </div>
    </div>
    <div class="transactions">
      <div
        v-for="transaction in transactions"
        :key="transaction.id"
        class="transaction"
      >
        <div class="transaction-date">
          {{ formatDate(transaction.date) }}
        </div>
        <div class="transaction-details">
          <div class="description">{{ transaction.description }}</div>
          <div class="method">{{ transaction.method }}</div>
          <div
            :class="{
              amount: true,
              income: transaction.amount > 0,
              expense: transaction.amount < 0,
            }"
          >
            {{ transaction.amount }}원
          </div>
        </div>
      </div>
    </div>
    <div class="footer">
      <button @click="navigate('/calendar.vue')">
        <i class="fa fa-calendar"></i>
      </button>
      <button @click="navigate('/add')">
        <i class="fa fa-plus"></i>
      </button>
      <button @click="navigate('/settings')">
        <i class="fa fa-cog"></i>
      </button>
    </div>
  </div>
</template>

<script setup>
import { ref, computed } from 'vue';
import { useTransactionStore } from '@/stores/transaction';
import 'font-awesome/css/font-awesome.min.css';

const transactionStore = useTransactionStore();

const currentDate = ref(new Date());

const currentYearMonth = computed(() => {
  return currentDate.value.toLocaleString('default', {
    month: 'long',
    year: 'numeric',
  });
});
const prevMonth = () => {
  const prevDate = new Date(currentDate.value);
  prevDate.setMonth(prevDate.getMonth() - 1);
  currentDate.value = prevDate;
};
const nextMonth = () => {
  const nextDate = new Date(currentDate.value);
  nextDate.setMonth(nextDate.getMonth() + 1);
  currentDate.value = nextDate;
};

const income = computed(() => transactionStore.income.toLocaleString());
const expenses = computed(() => transactionStore.expenses.toLocaleString());
const totalBalance = computed(() =>
  transactionStore.totalBalance.toLocaleString()
);
const transactions = computed(() => transactionStore.transactions);

const formatDate = (date) => {
  const [year, month, day] = date.split('-');
  return `${parseInt(month)}월 ${parseInt(day)}일`;
};

const navigate = (path) => {
  this.$router.push(path);
};
</script>

<style src="@/assets/Home.css"></style>
