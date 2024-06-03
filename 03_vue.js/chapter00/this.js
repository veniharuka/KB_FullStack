// const tetzObj = {
//   name: '이효석',
//   isOld: true,
//   sayHello: function () {
//     console.log(this.name);
//   },
//   nestedObj: {
//     name: '방시혁',
//     isOld: true,
//     sayHello: function () {
//       console.log(this.name);
//     },
//   },
// };

// tetzObj.sayHello();
// tetzObj.nestedObj.sayHello();
//==============================================================
// const tetzObj = {
//   name: '이효석',
//   isOld: true,
//   condition: 'good',
// };
// console.log(obj['name'], obj['isOld'], obj['condition']);
//==============================================================

// const obj = {
//   name: '최민준',
//   isOld: true,
// };

// function getKeyValue(obj, key) {
//   console.log(obj[key]);
// }
// getKeyValue(obj, 'name');
//==============================================================
const obj = {
  name: '최민준',
  isOld: true,
  condition: 'not bad',
};
for (let key in obj) {
  console.log(`key 값은 ${key}이고, value는 ${obj[key]}입니다!`);
}
