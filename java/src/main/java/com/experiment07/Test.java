package com.experiment07;

import java.util.concurrent.CountDownLatch;

public class Test {
    public static void main(String[] args)  throws InterruptedException{
        Station s1 = new Station("哈尔滨东站");
        Station s2 = new Station("哈尔滨西站");
        Station s3 = new Station("哈尔滨站");
        CountDownLatch latch = new CountDownLatch(3);
        new Thread(()->{
            while (s1.sell()!=null){
            }
            latch.countDown();
        }).start();
        new Thread(()->{
            while (s2.sell()!=null){
            }
            latch.countDown();
        }).start();
        new Thread(()->{
            while (s3.sell()!=null){
            }
            latch.countDown();
        }).start();
        latch.await();
        System.out.println(s1.getName()+"售卖了："+s1.getCount()+"张票");
        System.out.println(s2.getName()+"售卖了："+s2.getCount()+"张票");
        System.out.println(s3.getName()+"售卖了："+s3.getCount()+"张票");
        int num=s1.getCount()+s2.getCount()+s3.getCount();
        System.out.println("一共售卖了"+num+"张票");
    }
}
