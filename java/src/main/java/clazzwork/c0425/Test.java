package clazzwork.c0425;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

public class Test {
    public static void main(String[] args){
        /*try(FileInputStream in = new FileInputStream("E:/test/input.txt");
            FileOutputStream out = new FileOutputStream("E:/test/output.txt");) {
            int len = 0;
            byte []b = new byte[6];
            while ((len = in.read(b)) != -1){
                out.write(b,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }*/
        /*try(FileInputStream in = new FileInputStream("E:/test/input.txt");
            FileOutputStream out = new FileOutputStream("E:/test/output.txt");) {
            byte []b = in.readAllBytes();
            System.out.println(new String(b,"UTF-8"));
        } catch (IOException e) {
            e.printStackTrace();
        }*/
        /*Path p = Path.of("E:/test/input.txt");//Java 11
        Path a = Paths.get("E:/test/input.txt");//Java 8*/
        List<Integer>list =  new ArrayList<>();
        A a = new A();
        B b = new B();
        List<A> list1 = new ArrayList<>();
        List<B> list2 = new ArrayList<>();
        list2.add(b);
        Iterator<B> ilist = list2.iterator();
        Optional<Integer> op = Optional.ofNullable(null);

    }
}
