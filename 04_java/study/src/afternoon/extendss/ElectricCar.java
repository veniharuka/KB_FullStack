package afternoon.extendss;
//다른 패키지일 때만 import가 발생한다
public class ElectricCar extends Car {
    @Override
    public void move(){
        System.out.println("전기차가 움직입니다.");
    }

    @Override
    public void openDoor(){
        System.out.println("전기차의 문을 엽니다.");
    }
    public void charge(){
        System.out.println("전기차를 충전합니다.");
    }
}
