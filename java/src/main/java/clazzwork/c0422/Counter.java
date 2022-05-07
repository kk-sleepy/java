package clazzwork.c0422;

import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Counter {
    private Random r =new Random();
    private int c;
    private static final Lock lock= new ReentrantLock();
    public void increment(){
        try{
            Thread.sleep(r.nextInt(50));
            lock.lock();
            c++;
        }catch (InterruptedException e){
        }finally {
            lock.unlock();
        }
    }
    public synchronized void incrementSyc(){
        try {
            Thread.sleep(r.nextInt(50));
            c++;
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public int getC() {
        return c;
    }
}
