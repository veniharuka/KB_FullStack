import { ref, computed } from 'vue';
import { defineStore } from 'pinia';

export const useTransactionStore = defineStore('transaction', () => {
  const income = ref(500000);
  const expenses = ref(40000);
  const transactions = ref([
    {
      id: 1,
      date: '2024-06-10',
      description: '서브웨이',
      method: '카드',
      amount: -30000,
    },
    {
      id: 2,
      date: '2024-06-10',
      description: '용돈',
      method: '현금',
      amount: 50000,
    },
    {
      id: 3,
      date: '2024-06-07',
      description: '용돈',
      method: '현금',
      amount: 50000,
    },
    {
      id: 4,
      date: '2024-06-07',
      description: '용돈',
      method: '현금',
      amount: 50000,
    },
  ]);

  const totalBalance = computed(() => income.value - expenses.value);

  function addTransaction(transaction) {
    transactions.value.push(transaction);
    if (transaction.amount > 0) {
      income.value += transaction.amount;
    } else {
      expenses.value -= transaction.amount;
    }
  }

  return {
    income,
    expenses,
    transactions,
    totalBalance,
    addTransaction,
  };
});
