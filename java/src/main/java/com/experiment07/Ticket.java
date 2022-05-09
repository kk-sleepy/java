package com.experiment07;

public class Ticket {
    private int ID;
    private String starName;
    private String finalName;

    public Ticket(int ID, String starName, String finalName) {
        this.ID = ID;
        this.starName = starName;
        this.finalName = finalName;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getStarName() {
        return starName;
    }

    public void setStarName(String starName) {
        this.starName = starName;
    }

    public String getFinalName() {
        return finalName;
    }

    public void setFinalName(String finalName) {
        this.finalName = finalName;
    }
}
