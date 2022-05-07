package com.experiment06;

public class LoadService {
    public static void loading(Cargoship cs,Container c)throws DangerException{
        if(cs.getRweight()+c.getWeight()>cs.getMaxweight()){
            throw new DangerException();
        }
        else {
            cs.addCONTAINER(c);
        }
    }
}
