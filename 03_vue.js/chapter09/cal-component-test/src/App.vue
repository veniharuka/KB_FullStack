<template>
  <div class="black-bg" v-if="모달창열렸니 === true">
    <div class="white-bg">
      <h4>상세페이지임</h4>
      <p>상세페이지 내용임</p>
      <button @click="모달창열렸니 = false">모달창 닫기</button>
    </div>
  </div>

  <div class="menu">
    <a v-for="(a, i) in 메뉴들" :key="i">{{ a }}</a>
    <!-- 매개변수로 인덱스를 설정해주자 -->
  </div>
  <!-- 
  <div v-for="(작명, i) in products" :key="i">
    <h4>{{ products[i] }}</h4>
    <p>{{ prices[i] }}만원</p>
  </div> -->
  <div v-for="(data, i) in 원룸들" :key="i">
    <div>
      <img :src="원룸들[i].image" class="rm-img" />
      <div>
        <h4 @click="모달창열렸니 = true">{{ 원룸들[0].title }}</h4>
      </div>
      <p>{{ 원룸들[i].price }}원</p>
      <button @click="신고수[0]++">허위매물 신고버튼</button>
      <p>신고수 : {{ 신고수[0] }}</p>
    </div>
  </div>
</template>

<script>
import oneroomData from './asset/oneroom';

export default {
  name: 'App',
  data() {
    return {
      모달창열렸니: false,
      신고수: [0, 0, 0],
      원룸들: oneroomData,
      메뉴들: ['Home', 'Shop', 'About'],
      products: ['역삼동원룸', '천호동원룸', '마포구원룸'],
      prices: ['60', '70', '80'],
    };
  },

  methods: {
    increase() {
      this.신고수 += 1;
    },
  },
};
</script>

<style>
.rm-img {
  width: 30%;
  margin-top: 40px;
}

.menu {
  background: darkgoldenrod;
  padding: 15px;
  border-radius: 5px;
}
.menu a {
  color: white;
  padding: 10px;
}

body {
  margin: 0;
}
div {
  box-sizing: border-box;
}
.black-bg {
  width: 100%;
  height: 100%;
  background: rgba(0, 0, 0, 0.5);
  position: fixed;
  padding: 20px;
}
.white-bg {
  width: 100%;
  background: white;
  border-radius: 8px;
  padding: 20px;
}
</style>
