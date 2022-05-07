package clazzwork.c0418;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class test {
    public static void main(String[] args) {
        try{
            Files.readString(Path.of("A:/aa.aa"));
            Thread.sleep(1000);
        } catch (IOException | InterruptedException e){
            /* System.out.println("输出错误程序："+e.getMessage()); */
            e.printStackTrace();
        }
        int i=1,j=10;
        Object a = new Object();

    }
}