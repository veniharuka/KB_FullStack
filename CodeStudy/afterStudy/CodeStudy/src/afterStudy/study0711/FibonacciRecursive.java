package afterStudy.study0711;

public class FibonacciRecursive {
    public static void main(String[] args) {
        int num = 4;
        int result = fibonacci(num);
        System.out.println("Fibonacci number at position " + num + " is " + result);


    }
    private static int fibonacci(int n) {
        if(n==1){
            return 1;
        }else if(n==0){
            return 0;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }

}
