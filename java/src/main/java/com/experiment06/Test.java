package com.experiment06;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Cargoship ship = new Cargoship(1,"神盾号航空母舰",1000);
        Container c1 = new Container(1,100);
        Container c2 = new Container(2,200);
        Container c4 = new Container(3,400);
        Container c8 = new Container(4,800);
        List<Container> containers = new ArrayList<>();
        List.of(c1,c2);
        ship.setRweight(c1.getWeight()+ c2.getWeight());
        ship.setCONTAINER(containers);
        try {
            LoadService.loading(ship,c4);
            System.out.println(ship.getName());
            LoadService.loading(ship,c8);
            System.out.println(ship.getName());
        } catch (DangerException e) {
            e.deal(ship);
        }finally {
            System.out.println("启航");
        }
    }
}
