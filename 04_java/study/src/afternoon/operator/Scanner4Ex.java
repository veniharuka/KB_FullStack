package afternoon.operator;

import java.util.Scanner;

public class Scanner4Ex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("시작 정수를 입력하세요 : ");
        int startNum = scanner.nextInt();

        System.out.println("종료 정수를 입력하세요 : ");
        int endNum = scanner.nextInt();

        int result=(startNum+endNum)*endNum/2;
        if (startNum > endNum) {
            System.out.println("시작 정수가 종료 정수보다 큽니다!");


        }else{
            System.out.println("시작 수부터 종료 수까지의 합은 :" +result);

        }


    }
}
