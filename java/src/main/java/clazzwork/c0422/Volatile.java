package clazzwork.c0422;

import java.util.Random;

public class Volatile {
    private static volatile int c;
    private static Random r = new Random();
    public static void increment(){
        try{
            Thread.sleep(r.nextInt(50));
            c++;
        }catch (InterruptedException e){

        }
    }

    public static int getC() {
        return c;
    }
}
