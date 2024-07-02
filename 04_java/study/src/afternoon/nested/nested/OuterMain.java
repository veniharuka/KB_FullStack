package afternoon.nested.nested;

public class OuterMain {
    public static void main(String[] args) {
        Outer outer = new Outer();

       //outer. private 변수는 접근 안되는 건 private때문임.

        Outer.Nested nested = new Outer.Nested();

        nested.print();
    }
}
