package afternoon.operator;

import java.util.Scanner;

public class PracticeQ4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int balance = 0;
        boolean run = true;
        while (run){
            System.out.println("------------------------------------");
            System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
            System.out.println("------------------------------------");

            System.out.println("번호를 입력하세요 : ");
            int selectNum = scanner.nextInt();


            if(selectNum==1){
                int inputNum = scanner.nextInt();
                System.out.println("선택>"+selectNum);
                balance += inputNum;
                System.out.println("예금액>"+inputNum);
                System.out.println("잔고 >" + balance);

            } else if (selectNum==2) {
                int outNum = scanner.nextInt();
                System.out.println("선택>"+selectNum);
                balance -= outNum;
                System.out.println("출금액 >" + outNum);
                System.out.println("잔고 >" + balance);

            } else if (selectNum==3) {
                System.out.println("선택>"+selectNum);
                System.out.println("잔고 >" + balance);

            }else if(selectNum==4){
                System.out.println("선택>"+selectNum);
                System.out.println("프로그램 종료");
                run =false;

            }else{
                System.out.println("잘못된 입력입니다. 다시 시도해주세요.");
            }

        }




    }
}
