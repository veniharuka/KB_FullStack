package afternoon.operator;

import java.util.Scanner;

public class Scanner2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("첫번째 정수를 입력하세요:");
        int num1 = scanner.nextInt();

        System.out.println("두번째 정수를 입력하세요:");
        int num2 = scanner.nextInt();

        System.out.println("세번째 정수를 입력하세요:");
        int num3 = scanner.nextInt();

        int sum = num1 + num2 + num3;
        System.out.println(sum);
    }
}
