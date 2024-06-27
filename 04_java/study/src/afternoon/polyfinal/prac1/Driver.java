package afternoon.polyfinal.prac1;

import java.util.Scanner;

public class Driver {
    private Car car;
    Scanner sc = new Scanner(System.in);

    public void setCar(Car car) {
        this.car = car;
    }

    public void selectCar(){
        System.out.println("운전하고 싶은 차를 선택하세요: 1.K5 / 2.그랜져 / 3.G70 : ");
        int optCar = sc.nextInt();
        this.findCar(optCar);
    }

    public void findCar(int optCar){
        if(optCar == 1) {
            this.setCar(new K5Car());
        }else if(optCar == 2) {
            this.setCar(new Grand());
        }else if(optCar == 3) {
            this.setCar(new G70());
        }
        drive(optCar);
    }

    public void drive(int optCar){
        car.drive();
    }
}
