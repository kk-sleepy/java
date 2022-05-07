package clazzwork.c0422;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class p802 {
    private static void getThrowsl() throws IOException, InterruptedException{
        Files.readString(Path.of("A/aa.aa"));
        Thread.sleep(1000);
    }

    public static void main(String[] args) throws  IOException {
        try{
            getThrowsl();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
    private static void getMyExeception(){
        if(1==1){
            throw new MyException("1==1,错了！");
        }
    }
    private static void getMyException2(){
        try{
            Files.readString(Path.of("A:/aa.aa"));
        }catch(IOException e){
            throw new MyException("错了！"+e.getMessage());
        }
    }
}

