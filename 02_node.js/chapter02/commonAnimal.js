const animals = ['강아지', '고양이'];

function showAnimals() {
  //el e는 강아지 l은 고양이
  animals.map((el) => {
    console.log(el);
  });
}

module.exports = {
  animals,
  showAnimals,
};
