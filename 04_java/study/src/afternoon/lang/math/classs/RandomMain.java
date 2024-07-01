package afternoon.lang.math.classs;

import java.util.Random;

public class RandomMain {
    public static void main(String[] args) {
        Random random = new Random();

        System.out.println(random.nextInt()); // int 범위 +- 정수
        System.out.println(random.nextDouble()); // 0~1.0 소수
        System.out.println(random.nextBoolean()); // T or F

        System.out.println(random.nextInt(100)); // 0~99 숫자
    }
}
