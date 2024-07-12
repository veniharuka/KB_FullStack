package afterStudy.study0711;

public class Factorial {
    public static void main(String[] args) {
        int num =5;
        int result = factorial(num);
        System.out.println(" = Factorial result : " + result);
    }

    private static int factorial(int num) {
        if(num ==1){
            System.out.print(num);
            return 1;
        }
        System.out.print(num+" * ");
        return num*factorial(num-1);
    }



}
