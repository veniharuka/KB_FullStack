package afternoon.extendss.superrr;

public class Child extends Parent {
    public Child(String name) {
        super(); //부모의 기본 생성자 , Parent();랑 동일함.생성자
        System.out.println("Child 생성자");
    }
    public Child(String name, int age) {
        super();
        System.out.println("Child 생성자2");
    }
}
