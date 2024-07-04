package afternoon.exception.real;


import afternoon.exception.real.exceptions.MyCheckException;

public class Client {

        public void callException(){
            throw new MyCheckException("MyCheckException");
        }




    public void callException2() {
        throw new MyCheckException("MyCheckException2");
    }
}
