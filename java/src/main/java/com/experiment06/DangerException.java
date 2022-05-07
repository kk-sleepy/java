package com.experiment06;

public class DangerException extends Exception {
    public void deal(Cargoship ship){
        System.out.println("警告！船已超重！");
    }
}
