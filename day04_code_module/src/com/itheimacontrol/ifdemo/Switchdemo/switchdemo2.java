package com.itheimacontrol.ifdemo.Switchdemo;

public class switchdemo2 {
    public static void main(String[] args) {
        //switch新特性
        int number = 1;
        switch (number){
            case 1 ->{
                System.out.println("一");
            }
            case 2 ->{
                System.out.println("二");
            }
            case 3 ->{
                System.out.println("三");
            }
            default -> {
                System.out.println("没有这种选项");
            }
        }
    }
}
