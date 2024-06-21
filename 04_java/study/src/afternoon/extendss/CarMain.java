package afternoon.extendss;

public class CarMain {
    public static void main(String[] args) {
        GasCar gasCar = new GasCar();
        ElectricCar electricCar = new ElectricCar();
        HydrogenCar hydrogenCar = new HydrogenCar();
        // new + class명 쓰고 ctr+alt+v 누르면 자동 변수명 만들어줌

        gasCar.fillup();
        gasCar.move();
        gasCar.openDoor();

        electricCar.charge();
        electricCar.move();
        electricCar.openDoor();

        hydrogenCar.filldrogen();
        hydrogenCar.move();
        hydrogenCar.openDoor();

    }
}
