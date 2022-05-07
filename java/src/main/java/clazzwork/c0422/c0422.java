package clazzwork.c0422;

import javax.xml.catalog.Catalog;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class c0422 {
    public static void main(String[] args) {
       /*try{
            Files.readString(Path.of("A:/aa.aa"));
        }catch(IOException e){
            System.err.println("捕获IOexception异常");
        }
        try {
            Thread.sleep(1000);
        }catch(InterruptedException e){
            System.out.println("捕获interruptedEx异常");
        }
        try {
            Files.readString(Path.of("A:/aa.aa"));
            Thread.sleep(1000);
        }catch(IOException e){
            System.err.println("捕获IOexception异常");
        }catch(InterruptedException e){
            System.out.println("捕获interruptedEx异常");
        }*/
        /*try{
            Files.readString(Path.of("A:/aa.aa"));
        }catch(IOException e){
            System.err.println(e.getMessage());
            e.printStackTrace();//getMessage()方法获取系统在异常对象中封装的异常错误信息
        }*/
        /*try {
            Files.readString(Path.of("A:/aa.aa"));
            Thread.sleep(1000);
        }catch(IOException |InterruptedException e){
        System.err.println(e.getMessage());
        //e.printStackTrace();
    }finally {
            System.out.println("已经结束了！！！");
        }
        try {
            Thread.sleep(1000);
        }catch(Exception e){
            System.out.println("捕获interruptedEx异常");
        }*/
    }
}
