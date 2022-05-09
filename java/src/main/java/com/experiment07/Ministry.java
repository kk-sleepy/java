package com.experiment07;

import java.security.PublicKey;
import java.util.LinkedList;
import java.util.List;

public class Ministry {
    private static List<Ticket> TICKETS = create();
    private static List<Ticket> create(){
        List<Ticket> tickets = new LinkedList<>();
        for (int i = 1; i <= 200; i++){
            Ticket ticket = new Ticket(i,"哈尔滨","北京");
            tickets.add(ticket);
        }
        return tickets;
    }
    public static synchronized Ticket take(){
        Ticket t = null;
        if (TICKETS.size()>0){
            t = TICKETS.get(0);
            TICKETS.remove(t);
        }
        return t;
    }
}
