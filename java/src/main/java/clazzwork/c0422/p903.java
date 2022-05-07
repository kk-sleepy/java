package clazzwork.c0422;

import java.time.LocalTime;
import java.util.concurrent.*;

public class p903 {
    public void fuc(float a, float b) {}
    private void fuc(float c,float d, float e){ }
    public static void main(String[] args) throws InterruptedException{
        /*int count =8_000;
        Counter counter = new Counter();
        CountDownLatch latch = new CountDownLatch(count);
        for (int i=0;i<count;i++){
            new Thread(()->{
                counter.increment();
                latch.countDown();
            }).start();
        }
        latch.await();
        System.out.println("执行结果:"+counter.getC());*/
        /*ExecutorService service = Executors.newFixedThreadPool(3);
        for(int i = 0;i < 10; i++){
            service.execute(()->{
                try {
                    Thread.sleep(500);
                    System.out.println(Thread.currentThread().getName()+"/"+ LocalTime.now());
                }catch (InterruptedException ignored){
                    System.out.println("被中断");
                }
            });
        }
        Thread.sleep(1000);
        service.shutdownNow();*/
        Runnable r = () ->{
            for (int j = 0; j < 1000; j++){
                Counter3.increment();
            }
            System.out.println(Counter3.value());
        };
        for(int i =0; i < 3; i++){
            new Thread(r).start();
        }
    }
}
