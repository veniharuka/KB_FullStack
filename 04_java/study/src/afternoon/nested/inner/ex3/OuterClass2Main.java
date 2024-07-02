package afternoon.nested.inner.ex3;

public class OuterClass2Main {
    public static void main(String[] args) {
        OuterClass2 o = new OuterClass2(); //static이 아니니깐 인스턴스화 해줌
        OuterClass2.InnerClass inner = o.new InnerClass(); // inner도 인스턴스화


      //OuterClass2.InnerClass inner2 = new OuterClass2().new InnerClass();
      // 위의 것도 가능
        inner.hello();
    }
}
