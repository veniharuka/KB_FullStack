const fs = require('fs'); //이름 바로 되어있는 건 내장 혹은 npm다운 받은거
fs.readFile('./chapter02/readme.txt', 'utf-8', (err, data) => {
  if (err) {
    return console.log(err);
  }
  console.log('1번', data.toString());

  fs.readFile('./chapter02/readme.txt2', 'utf-8', (err, data) => {
    if (err) {
      return console.log(err);
    }
    console.log('2번', data.toString());

    fs.readFile('./chapter02/readme.txt3', 'utf-8', (err, data) => {
      if (err) {
        return console.log(err);
      }
      console.log('3번', data.toString());

      fs.readFile('./chapter02/readme.txt4', 'utf-8', (err, data) => {
        if (err) {
          return console.log(err);
        }
        console.log('4번', data.toString());
      });
    });
  });
});
