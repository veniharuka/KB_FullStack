package afternoon.nested.local.ex3;

public class AnonymousMain implements Hello {


    @Override
    public void hello() {
        System.out.println("안녕하세요오.");
    }



    public static void main(String[] args) {
        Hello hello = new AnonymousMain();
        hello.hello();
    }
}
