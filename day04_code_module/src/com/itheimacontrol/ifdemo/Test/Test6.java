package com.itheimacontrol.ifdemo.Test;

import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {

        //键盘录入小明成绩
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入小明成绩");
        int score = sc.nextInt();

        //根据分数多少判定所得奖励
        //首先限定合法数据在0到100之间
        if (score >= 0 && score <= 100){
            //若分数合法，则判断奖励
            if (score >= 95 && score <= 100){
                System.out.println("奖励自行车一辆");
            } else if (score >= 90 && score <= 94 ) {
                System.out.println("奖励游乐场玩一天");
            } else if (score >= 80 && score <= 89) {
                System.out.println("奖励一个变型金刚");
            }else {
                System.out.println("揍一顿");
            }
        }else {
            System.out.println("当前录入成绩不合法");
        }

    }
}
