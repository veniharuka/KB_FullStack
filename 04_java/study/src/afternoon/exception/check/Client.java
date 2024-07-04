package afternoon.exception.check;

import java.util.Random;

public class Client {
    public void callException() throws MyCheckException {

        throw new MyCheckException("Client.call 에서 에러 발생");


    }

    public void callRandException() throws  MyCheckException2 {
//        throw new MyCheckException2("Client.call 에서 에러 발생");

        Random rand = new Random();
        boolean result = rand.nextBoolean();

        if(result==true){
            throw new MyCheckException2("오늘은 운이 없으시군요");
        }else{
            System.out.println("오늘은 운이 좋으시군요");
        }
    }

}
