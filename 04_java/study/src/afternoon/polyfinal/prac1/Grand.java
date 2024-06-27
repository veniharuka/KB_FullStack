package afternoon.polyfinal.prac1;

public class Grand implements Car {
    @Override
    public void openDoor() {
        System.out.println("Grand, 차 문을 엽니다.");
    }

    @Override
    public void drive() {
        System.out.println("Grand주행 시작합니다.");
        System.out.println("Grand주행 종료합니다.");

    }
}
