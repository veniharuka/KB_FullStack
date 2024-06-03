const obj1 = { name: '박문수', age: 29 };
const obj2 = { name: '박문수', age: 29, email: 'mspark@gmail.com' };
const obj3 = { ...obj1, email: 'mspark@gmail.com' }; //...obj1 로 obj1 값 가져옴
console.log(obj3);

const arr1 = [100, 200, 300];
const arr2 = ['world', ...arr1, 'hello'];
const arr3 = [...arr1];
console.log(arr1);
console.log(arr2);
