package com.itheimacontrol.ifdemo.Test;

import java.util.Scanner;

public class Test10 {
    public static void main(String[] args) {
        //休息日和工作日

        //输入星期数
        Scanner sc = new Scanner(System.in);
        System.out.println("输入整数表示星期：");
        int week = sc.nextInt();

        //判断工作日与休息日
        /*switch (week){
            case 1 :
            case 2 :
            case 3 :
            case 4 :
            case 5 :
                System.out.println("工作日");
                break;
            case 6 :
            case 7 :
                System.out.println("休息日");
                break;
            default:
                System.out.println("没有这个星期");
                break;

        }*/
        /*switch (week) {
            case 1,2,3,4,5:
                System.out.println("工作日");
                break;
            case 6,7:
                System.out.println("休息日");
                break;
            default:
                System.out.println("没有这个星期");
                break;

        }*/
        switch (week) {
            case 1,2,3,4,5 -> System.out.println("工作日");
            case 6,7 -> System.out.println("休息日");
            default -> System.out.println("没有这个星期");
                

        }
    }
}
