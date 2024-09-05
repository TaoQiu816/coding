package com.itheimacontrol.ifdemo.Test;

import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        //根据电影票号的奇偶判断坐哪边

        //录入票号
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入电影票号：");
        int ticket = sc.nextInt();


        //if嵌套
        //只有当票号在0到100之间才是真实有效的票
        if (ticket >= 0 && ticket <= 100){
            //判断奇偶
            if (ticket % 2 == 0){
                System.out.println("坐右侧");
            }else {
                System.out.println("坐左侧");
            }
        }


    }
}
