const promise = new Promise((res, rej) => {
  console.log('나 로또 사도 될까!?');
  setTimeout(() => {
    const rand = parseInt(Math.random() * 10);
    console.log(`나온 숫자는 ${rand}`);
    if (rand >= 5) {
      return res('아싸! 로또 사자!');
    } else {
      return rej('아... 망했어요...');
    }
  }, 2000);
});

// promise
//   .then((data) => {
//     console.log(data);
//   })

//   .catch((error) => {
//     console.log(error);
//   });

async function funcAsync() {
  try {
    const data = await promise;
    console.log(data);
  } catch (err) {
    console.log(err);
  }
}

funcAsync();
