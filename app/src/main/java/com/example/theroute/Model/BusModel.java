package com.example.theroute.Model;

public class BusModel {
    public String name;
    /*public String image;*/
    public String description;
    public String busno;
    public BusModel(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

   /* public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }*/

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getBusno() {
        return busno;
    }

    public void setBusno(String busno) {
        this.busno = busno;
    }

    //Constructor is not needed for Try 6
    public BusModel(String name, String image, String description, String busno) {
        this.name = name;
        /*this.image = image;*/
        this.description = description;
        this.busno = busno;
    }
}
