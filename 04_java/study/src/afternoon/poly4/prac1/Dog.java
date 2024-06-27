package afternoon.poly4.prac1;

public class Dog implements Animal{
    @Override
    public void eat() {
        System.out.println("강아지가 사료를 먹습니다.");
    }

    @Override
    public void sound() {
        System.out.println("강아지가 귀를 쫑긋하며 소리를 듣습니다");
    }
}
