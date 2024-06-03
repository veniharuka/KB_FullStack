const handleClickLoginBtn = function () {
  const idInput = document.getElementById('id');
  const pwInput = document.getElementById('pw');

  const idInputValue = idInput.value;
  const pwInputValue = pwInput.value;

  let isIdPassed = false;
  let isPwPassed = false;

  if (idInputValue.length > 6) {
    isIdPassed = true;
  }

  if (pwInputValue.length > 6) {
    isPwPassed = true;
  }

  if (!isIdPassed) {
    return alert('아이디는 6자리 이상이어야 합니다.');
  }

  if (!isPwPassed) {
    return alert('비밀번호는 6자리 이상이어야 합니다.');
  }

  alert(`환영합니다! ${idInputValue}님!`);
  location.href = `/siwon/welcome.html?id=${idInputValue}`;
};

const loginBtn = document.getElementById('loginBtn');

window.loginBtn.addEventListener('click', handleClickLoginBtn);
