const promise = new Promise((resolve, reject) => {
  setTimeout(() => {
    //0 ~ 10 사이의난수발생
    let num = parseInt(Math.random() * 10);
    if (num >= 5) {
      reject(num);
    }
    resolve(num);
  }, 1000);
});

async function main() {
  try {
    const result = await promise;
    console.log('무사통과! 생성된숫자:', result);
  } catch (error) {
    console.log('Error 발생! 생성된숫자:', error);
  }
}

main();
console.log('## Promise 객체생성!');
