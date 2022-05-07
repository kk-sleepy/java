package clazzwork.c0422;

public class MyException extends RuntimeException {
    public MyException(String message){
        super(message);
    }
    public MyException(String message,Throwable cause){
        super(message,cause);
    }
}
