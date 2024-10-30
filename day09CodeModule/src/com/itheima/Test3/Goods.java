package com.itheima.Test3;

public class Goods {
    //商品属性：id,名字，价格，库存
    private String id;
    private String name;
    private double price;
    private int remainCount;


    public Goods() {
    }

    public Goods(String id, String name, double price, int remainCount) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.remainCount = remainCount;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getRemainCount() {
        return remainCount;
    }

    public void setRemainCount(int remainCount) {
        this.remainCount = remainCount;
    }

    //显示商品信息
    public void showGoodInfo(){
        System.out.println("ID:" + getId());
        System.out.println("名称:" + getName());
        System.out.println("价格:" + getPrice());
        System.out.println("库存:" + getRemainCount());
    }
}
