package clazzwork.c0422;

import java.util.Random;

public class Counter3 {
    //private static int c = 0;
    private static ThreadLocal<Integer> c = new ThreadLocal<>();
    private static Random r = new Random();
    private static Account account = new Account();
    public static void increment(){
        try {
            Thread.sleep(r.nextInt(50));
            //account.setC(account.getC()+1);
            if(c.get() == null){
                c.set(0);
            }
            c.set(c.get()+1);
        }catch(InterruptedException ignored){

        }
    }

    public static ThreadLocal<Integer> getC() {
        return c;
    }

    public static void setC(ThreadLocal<Integer> c) {
        Counter3.c = c;
    }
    public static int value(){
        return c.get();
    }
    /*public static int value(){
        return c;
    }*/
}
