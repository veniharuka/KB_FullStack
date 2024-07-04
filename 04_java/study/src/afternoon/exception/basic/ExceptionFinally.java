package afternoon.exception.basic;

public class ExceptionFinally {
    public static void main(String[] args) {
        try{
            // 예외상황 발생 시키기 1, null 접근
           Object obj = null;
           obj.equals(null);


        }catch (Exception e){
            e.printStackTrace();
        } finally {
            System.out.println("정말 실행하고 싶은 코드");
        }
        System.out.println("나오나요?");
    }
}
