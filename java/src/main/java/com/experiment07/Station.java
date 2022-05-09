package com.experiment07;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.TreeMap;

public class Station{
    //包含名称，以及售出的车票列表。售票业务逻辑，售票点从铁道部拿票，
    //成功后将拿到的票置于销售点的车票销售列表，
    // 同时模拟随机50毫秒内的其他业务逻辑操作(即sleep)。
    public Ticket sell(){
        Ticket t = Ministry.take();
        Random random = new Random();
        if (t!=null){
            try {
                Thread.sleep(random.nextInt(50));
                tickets.add(t);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return t;
    }
    public Station(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    private String name;
    private List<Ticket> tickets = new LinkedList<>();

    public List<Ticket> getTickets() {
        return tickets;
    }

    public int getCount(){
        return tickets.size();
    }
}
