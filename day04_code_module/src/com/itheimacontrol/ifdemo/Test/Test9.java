package com.itheimacontrol.ifdemo.Test;

import java.util.Scanner;

public class Test9 {
    public static void main(String[] args) {
        //键盘录入星期数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入星期数：");
        int week = sc.nextInt();

        //根据星期数显示当天的减肥活动
        switch (week){
            case 1:{
                System.out.println("跑步");
                break;
            }
            case 2:{
                System.out.println("游泳");
                break;
            }
            case 3:{
                System.out.println("慢走");
                break;
            }
            case 4:{
                System.out.println("动感单车");
                break;
            }
            case 5:{
                System.out.println("拳击");
                break;
            }
            case 6:{
                System.out.println("爬山");
                break;
            }
            case 7:{
                System.out.println("好好吃一顿");
                break;
            }
            default:{
                System.out.println("非法输入");
                break;
            }
        }
    }
}
