package afternoon.operator;

import java.util.Scanner;

public class Scanner6EX {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int randNum = (int) (Math.random()*100);



        while(true){
            System.out.println("랜덤 숫자를 입력하세요 :");

            int inputNum=scanner.nextInt();

            if(inputNum == randNum){
                System.out.println("정답입니다! 랜덤 숫자는"+ randNum);
                break;
            }else if(inputNum > randNum){
                System.out.println("Down");

            } else {
                System.out.println("up");

            }
        }

    }
}
