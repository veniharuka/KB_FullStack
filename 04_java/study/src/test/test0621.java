package test;

public class test0621 {
    int filed;
    void method(){}



    static test0621 tst = new test0621();
    static void method3(){

        tst.filed=10;

    }


    public static void main(String[] args) {
        test0621 test = new test0621();
//        System.out.println(tst.method3());
    }
}
