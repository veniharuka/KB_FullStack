package afternoon.polyfinal;

import java.util.Scanner;

public class PayMain2 {
    public static void main(String[] args) {
        PaySystem paySystem = new PaySystem();
        Scanner scannner = new Scanner(System.in);

        paySystem.selectPay();
        paySystem.selectAmount();

//        int option;
//        int amount;
//
//        System.out.print("결제 옵션을 입력하세요 (1.KB 페이 / 2. 카카오페이 / 3.네이버페이) : ");
//        option = scannner.nextInt();
//
//        System.out.println("결제 금액을 입력하세요 : ");
//        amount = scannner.nextInt();
//
//        if(option == 1) {
//            KBPay kbPay = new KBPay();
//            paySystem.setPay(kbPay);
//        }else if(option == 2) {
//            paySystem.setPay(new KakapPay());
//        }else if(option == 3) {
//            paySystem.setPay(new NaverPay());
//        }
//    paySystem.payment(amount);
//
//    }

    }

}
