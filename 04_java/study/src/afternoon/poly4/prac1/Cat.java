package afternoon.poly4.prac1;

public class Cat implements Animal{
    @Override
    public void eat() {
        System.out.println("고양이가 츄르를 먹습니다.");
    }

    @Override
    public void sound() {
        System.out.println("고양이가 귀를 뒤로 젖히며 소리를 듣습니다.");
    }
}
