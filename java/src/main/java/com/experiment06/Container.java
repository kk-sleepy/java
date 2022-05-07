package com.experiment06;

public class Container {
    //每个集装箱必须包含ID号以及重量。
    private int id;
    private double weight;

    public Container(int id, double weight) {
        this.id = id;
        this.weight = weight;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
