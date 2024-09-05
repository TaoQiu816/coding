package com.itheimacontrol.ifdemo.Test;

public class Test17 {
    public static void main(String[] args) {
        //案例：打印折纸的次数
        //需求：一张纸厚度0.1毫米，珠穆朗玛峰高度8844.43米=8844430毫米，将纸折叠多少次可以达到珠峰的高度
        //珠峰高度
        double height = 8844430;
        //折叠次数
        int count = 0;
        //纸的初始厚度，每折叠一次厚度翻倍
        double paper = 0.1;
        while (paper < height) {
            //折叠一次厚度翻倍
            paper = paper * 2;
            //折叠次数变化统计
            count++;
        }
        System.out.println(count);
    }
}
