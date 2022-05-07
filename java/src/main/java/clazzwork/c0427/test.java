package clazzwork.c0427;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class test {
    private static final List<Integer> create(){
        Integer int1 = 1;
        Integer int2 = 2;
        List<Integer> xooox = new ArrayList<>();
        xooox.add(int1);
        xooox.add(int2);
        return xooox;
    }
    private static final List<Integer> create1(){
        Integer int1 = 111;
        Integer int2 = 222;
        List<Integer> xooox = new ArrayList<>();
        xooox.add(int1);
        xooox.add(int2);
        return xooox;
    }
    private static final List<Integer> zzy = create();
    public static void main(String[] args) {
        List<Integer> xoox =create();
        System.out.println(xoox.get(0));
        List<Integer> xoox1 = create1();
        xoox = xoox1;
        System.out.println(xoox.get(0));
    }
}
