<template>
  <div class="add-container">
    <h2>새로운 트랜잭션 추가</h2>
    <form @submit.prevent="addTransaction">
      <div>
        <label for="description">설명</label>
        <input type="text" v-model="description" required />
      </div>
      <div>
        <label for="amount">금액</label>
        <input type="number" v-model="amount" required />
      </div>
      <div>
        <label for="method">지불 방법</label>
        <select v-model="method" required>
          <option value="카드">카드</option>
          <option value="현금">현금</option>
        </select>
      </div>
      <div>
        <label for="date">날짜</label>
        <input type="date" v-model="date" required />
      </div>
      <button type="submit">추가</button>
    </form>
  </div>
</template>

<script>
import { useTransactionStore } from '@/stores/transaction';

export default {
  name: 'Add',
  data() {
    return {
      description: '',
      amount: '',
      method: '카드',
      date: '',
    };
  },
  methods: {
    addTransaction() {
      const transaction = {
        id: Date.now(),
        description: this.description,
        amount: parseFloat(this.amount),
        method: this.method,
        date: this.date,
      };
      const transactionStore = useTransactionStore();
      transactionStore.addTransaction(transaction);
      this.$router.push('/');
    },
  },
};
</script>

<style scoped>
.add-container {
  padding: 20px;
}
</style>
