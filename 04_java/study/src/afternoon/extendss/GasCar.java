package afternoon.extendss;

public class GasCar extends Car {
    @Override
    public void move(){
        System.out.println("기름차가 이동합니다!");
    }
    @Override
    public void openDoor(){
        System.out.println("기름차의 문을 엽니다!");
    }
    public void fillup(){
        System.out.println("기름차가 주유합니다.");
    }


}
