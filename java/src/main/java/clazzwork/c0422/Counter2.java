package clazzwork.c0422;

import java.security.PublicKey;
import java.util.Random;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public class Counter2 {
    private static Random r = new Random();
    private static AtomicInteger c =new AtomicInteger(0);
    public static synchronized  void increment(){
        try {
             Thread.sleep(r.nextInt(50));
             c.incrementAndGet();
        }catch (InterruptedException e){

        }
    }
    public static int value(){
        return c.get();
    }
/*
    public static int getC() {
        return c;
    }

    public static int value(){
        return c;
    }*/
}
