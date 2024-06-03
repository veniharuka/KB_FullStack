function foodReport(name, age, ...likeFood) {
  let info = `${name}, ${age}`;
  console.log(info);
  console.log(likeFood);
}
foodReport('이몽룡', 20, '짜장면', '냉면', '불고기');
foodReport('홍길동', 16, '초밥');
