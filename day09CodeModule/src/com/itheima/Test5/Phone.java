package com.itheima.Test5;

public class Phone {
    //属性：品牌，颜色，价格
    private String band;
    private String color;
    private double price;

    //构造方法

    public Phone() {
    }

    public Phone(String band, String color, double price) {
        this.band = band;
        this.color = color;
        this.price = price;
    }

    public String getBand() {
        return band;
    }

    public void setBand(String band) {
        this.band = band;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}


