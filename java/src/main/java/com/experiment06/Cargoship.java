package com.experiment06;

import java.util.List;

public class Cargoship {
    private int id;
    private double rweight;
    private double maxweight;
    private String name;
    private List<Container> CONTAINER;

    public Cargoship(int id,String name,double maxweight) {
        this.name = name;
        this.id = id;
        this.maxweight = maxweight;
    }

    public List<Container> getCONTAINER() {
        return CONTAINER;
    }

    public void setCONTAINER(List<Container> CONTAINER) {
        this.CONTAINER = CONTAINER;
    }
    public void addCONTAINER(Container c){
        this.CONTAINER.add(c);
        this.rweight=this.rweight+c.getWeight();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getRweight() {
        return rweight;
    }

    public void setRweight(double rweight) {
        this.rweight = rweight;
    }

    public double getMaxweight() {
        return maxweight;
    }

    public void setMaxweight(double maxweight) {
        this.maxweight = maxweight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
