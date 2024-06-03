const outerObj = {
  nestedObj: {
    nestedNestedObj: {
      nestedNestedNestedObj: {
        nestedNestedNestedNestedObj: {
          nestedNestedNestedNestedNestedObj: {
            sayHello: function () {
              console.log(this);
            },
          },
        },
      },
    },
  },
};
