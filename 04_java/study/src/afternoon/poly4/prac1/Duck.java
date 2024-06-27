package afternoon.poly4.prac1;

public class Duck implements Animal,Fly{
    @Override
    public void fly() {
        System.out.println("오리 날다");
    }

    @Override
    public void eat() {
        System.out.println("오리가 지렁이를 먹습니다.");
    }

    @Override
    public void sound() {
        System.out.println("오리가 소리를 듣습니다.");
    }
}
