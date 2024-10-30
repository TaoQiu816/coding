package com.itheima.Test;

import java.util.ArrayList;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        //键盘录入1~100之间的整数并添加到集合之中
        //直到集合中所有的数据和超过200为止
        Scanner sc = new Scanner(System.in);

        //集合存放整数（包装类）,集合不能存储基本数据类型
        ArrayList<Integer> list = new ArrayList<>();

        //求和变量用于判断终止条件
        int sum = 0;
        while (sum <= 200) {
            //键盘录入
            String s = sc.nextLine();
            //类型转换
            int i = Integer.parseInt(s);
            //验证输入是否满足要求
            if (i < 1 || i > 100) {
                System.out.println("不在1到100之间");
                continue;
            }
            sum = sum + i;
            //添加到集合
            //集合里面是Int的包装类
            //在添加数据时触发了自动装箱
            list.add(i);

        }

        System.out.println(sum);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
