package clazzwork.c0422;

public class p901 {
    public static void main(String[] args) throws InterruptedException{
        /*Thread t =new Thread(new HelloRunnable());
        t.start();*/
        //new HelloThread().start();
        /*System.out.println("main thread");
        new Thread(new Runnable() {
            @Override
            public void run() {
                int amount = 5;
                for (int i=0;i<5;i++){
                    System.out.println(i);
                    try {
                        Thread.sleep(1000);
                    }catch (InterruptedException e){}
                }
            }
        }).start();
        System.out.println("ending!");*/
        Thread t =new Thread(()->{
            for(int i=0;i<5;i++){
                System.out.println(i);
                try {
                    Thread.sleep(1000);
                }catch (InterruptedException e){
                    System.out.println("Interrupted");
                }
            }
        });
        t.start();
        t.join();
        //Thread.sleep(2000);
        t.interrupt();
        System.out.println("ending!");
    }
}
