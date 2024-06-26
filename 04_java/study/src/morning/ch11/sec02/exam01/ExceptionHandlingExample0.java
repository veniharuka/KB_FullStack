package morning.ch11.sec02.exam01;

public class ExceptionHandlingExample0 {
    public static void printLength(String data) {
        int result = data.length();
        // 12째 줄에서 null을 전달하여, null.length가 실행되어
        //NullPointerException가 발생함
        System.out.println("문자 수: " + result);
    }
    public static void main(String[] args) {
        System.out.println("[프로그램 시작]\n");
        printLength("ThisIsJava");
        printLength(null);
        // NullPointerException은 참조 변수가 null인상태에서 필드나 메소드에
        // 접근할 경우 발생한다. 위 상황에선 printLength의 매개변수로
        // null 값을 주었기에 error가 발생한다.
        System.out.println("[프로그램 종료]");
    }
}
//Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.length()" because "data" is null
//at morning.ch11.sec02.exam01.ExceptionHandlingExample1.printLength(ExceptionHandlingExample1.java:5)
//at morning.ch11.sec02.exam01.ExceptionHandlingExample1.main(ExceptionHandlingExample1.java:11)




