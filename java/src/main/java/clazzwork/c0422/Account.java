package clazzwork.c0422;

import java.util.Random;

public class Account {
    private int a;
    private int b;
    private int c;
    private  final Random r = new Random();
    public synchronized void addA(){
        try {
            int c = a;
            c++;
            Thread.sleep(r.nextInt(50));
            a = c;
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
    public synchronized void addB(){
        try {
            int c = b;
            c++;
            Thread.sleep(r.nextInt(50));
            b = c;
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
    public synchronized void add(){
        try{
            Thread.sleep(5000);
            a++;
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("add"+a);
    }
    public synchronized void add2(){
        try{
            Thread.sleep(100);
            a++;
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("add2"+a);
    }
    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }
}
