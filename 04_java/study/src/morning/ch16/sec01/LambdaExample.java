package morning.ch16.sec01;

public class LambdaExample {
    public static void main(String[] args) {
        action((x,y) ->{
            int result = x + y;
            System.out.println("result :" +result);
        });
        action((x,y) ->{
            int result = x - y;
            System.out.println("result :" +result);
        });

    }
    public static void action(Calculable calculable) {
        //람다 식에 실제 값들은 없다.
        int x = 10;
        int y = 4;

        calculable.calculate(x, y);
    }
}
