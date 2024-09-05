package com.itheimacontrol.ifdemo;

import java.util.Scanner;

public class ifdemo1 {
    public static void main(String[] args) {
        //需求，键盘录入酒量，若大于2则给出回应，反之不回应

        //键盘录入酒量
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入女婿酒量：");
        int wine = sc.nextInt();

        //第一种形式的if语句判断是否大于2、
        //格式  if(关系表达式){
                  //语句体
        //  }

        //这种形式的if语句的注意点
        //1.大括号的开头可以另起一行书写，但是建议写在第一行的末尾
        //2.在语句体中，如果只有一句代码，大括号可以省略不写
        //3.如果对一个布尔类型的变量进行判断，不要用==号(容易写成赋值)，直接把变量写在小括号中就行
        if (wine > 2){
            System.out.println("小伙子，不错呦！！");
        }

    }
}
