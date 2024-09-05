package com.itheimacontrol.ifdemo.Test;

public class Test13 {
    public static void main(String[] args) {
        //断线重连最多五次
        for (int i = 1; i <= 5; i++) {
            System.out.println("第" + i + "次断线重连");
        }

    }
}
