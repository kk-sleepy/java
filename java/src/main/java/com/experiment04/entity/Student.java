package com.experiment04.entity;

public class Student {
    public enum Sex{
        MALE,FAMALE
    }
    private int id;
    private String name;
    private Sex sex;
    private int year;
    public Student(int id,String name,Sex sex,int year){
        this.id =id;
        this.name = name;
        this.sex = sex;
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }
}
