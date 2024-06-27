package afternoon.poly4;

public class MinJune implements Animal,Human{
    @Override
    public void eat() {
        System.out.println("민준이가 닭가슴살을 입에 달고 삽니다!");
    }

    @Override
    public void sleep() {
        System.out.println("민준이가 잠을 잘 자려고 노력합니다!");
    }

    @Override
    public void think() {
        System.out.println("민준이가 어떻게하면 개발 실력이 늘지 고민합니다!");
    }
}
