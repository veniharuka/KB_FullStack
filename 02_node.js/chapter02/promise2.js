const fs = require('fs').promises;

fs.readFile('./chapter02/readme.txt')
  .then((data) => {
    console.log(data.toString()); //utf-8 안넣었어서 형 변환
    return fs.readFile('./chapter02/readme2.txt');
  })
  .then((data) => {
    console.log(data.toString());
    return fs.readFile('./chapter02/readme3.txt');
  })
  .then((data) => {
    console.log(data.toString());
    return fs.readFile('./chapter02/readme4.txt');
  })
  .then((data) => {
    console.log(data.toString());
  })
  .catch((err) => {
    console.log(err);
  });
