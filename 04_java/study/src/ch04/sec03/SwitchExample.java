package ch04.sec03;

public class SwitchExample {

    public static void main(String[] args) {
        int num = (int)(Math.random()*6)+1;

        switch (num){
            case 1 :
                System.out.print("1");
                break;
            case 2:
                System.out.print("2");
                break;
            case 3 :
                System.out.print("3");
                break;
            case 4 :
                System.out.print("4");
                break;
            case 5 :
                System.out.print("5");
                break;
            default:
                System.out.println("6번이 나왔습니다.");


        }
    }
}
