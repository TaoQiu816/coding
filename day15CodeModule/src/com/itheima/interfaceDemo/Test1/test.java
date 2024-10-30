package com.itheima.interfaceDemo.Test1;

public class test {
    public static void main(String[] args) {
        PingPongPlayer pl = new PingPongPlayer("刘诗雯",23);
        System.out.println(pl.getName()+","+pl.getAge());
        pl.Learn();
        pl.speakEng();
    }
}
