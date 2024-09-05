package com.itheimacontrol.ifdemo.Test;

import java.util.Scanner;

public class Test11 {
    public static void main(String[] args) {
        //1.键盘录入数字表示选择
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的选择：");
        int choose = sc.nextInt();


        //2.根据录入的数字执行不同的代码逻辑
        /*switch (choose) {
            case 1:
                System.out.println("机票查询");
                break;
            case 2:
                System.out.println("机票预定");
                break;
            case 3:
                System.out.println("机票改签");
                break;
            case 4:
                System.out.println("退出服务");
                break;
            default:
                System.out.println("退出服务");
                break;
        }*/
        //JDK12简写格式
        switch (choose) {
            case 1 -> System.out.println("机票查询");
            case 2 -> System.out.println("机票预定");
            case 3 -> System.out.println("机票改签");
//            case 4 -> System.out.println("退出服务");
            default -> System.out.println("退出服务");
        }
    }

}
