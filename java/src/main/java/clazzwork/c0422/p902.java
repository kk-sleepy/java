package clazzwork.c0422;

import java.util.concurrent.CountDownLatch;

public class p902 {
    public static void main(String[] args) throws InterruptedException {
        /*Counter cou = new Counter();
        int count =800;
        CountDownLatch latch = new CountDownLatch(count);
        for (int i=0;i<count;i++){
            new Thread(()->{
                cou.incrementSyc();
                latch.countDown();
            }).start();
        }
        latch.await();
        System.out.println(cou.getC());*/
        int c = 100;
        CountDownLatch latch =new CountDownLatch(c);
        Account a = new Account();
        for (int i = 0;i<c;i++){
            new Thread(()->{
                a.add();
                latch.countDown();
            }).start();
        }
        for (int i = 0;i<c;i++){
            new Thread(()->{
                a.add2();
                latch.countDown();
            }).start();
        }
        latch.await();
        /*Counter2 cou2 = new Counter2();
        int count =800;
        CountDownLatch latch = new CountDownLatch(count);
        for (int i=0;i<count;i++){
            new Thread(()->{
                cou2.increment();
                latch.countDown();
            }).start();
        }
        latch.await();
        System.out.println("执行结果:"+cou2.value());*/
        /*Counter3 cou3 = new Counter3();
        int count =800;
        CountDownLatch latch = new CountDownLatch(count);
        for (int i=0;i<count;i++){
            new Thread(()->{
                cou3.increment();
                latch.countDown();
            }).start();
        }
        latch.await();
        System.out.println("执行结果:"+cou3.value());*/
        /*int count =8_000;
        CountDownLatch latch = new CountDownLatch(count);
        for (int i=0;i<count;i++){
            new Thread(()->{
                Volatile.increment();
                latch.countDown();
            }).start();
        }
        latch.await();
        System.out.println("执行结果:"+Volatile.getC());*/
    }
}
