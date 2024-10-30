package com.itheima.Test4;

public class Car {
    //属性
    private String band;
    private int price;
    private String color;

    public Car() {
    }

    public Car(String band, int price, String color) {
        this.band = band;
        this.price = price;
        this.color = color;
    }

    public String getBand() {
        return band;
    }

    public void setBand(String band) {
        this.band = band;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
