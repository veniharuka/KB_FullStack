let x = 100;
let y = 200;
// 전역 변수
// 전역 변수
function swap(x, y) {
  // 지역 변수 x, y
  let temp = x;
  // 지역 변수 temp
  x = y;
  y = temp;
  console.log(`swap 함수 안-> x: ${x}, y:${y}`);
}
console.log(`swap 호출 전-> x: ${x}, y:${y}`);
swap(x, y);
console.log(`swap 호출 후-> x: ${x}, y:${y}`);

//매개변수 xy를 없애면 전역변수가 스왑된다.
