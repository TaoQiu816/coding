package com.itheima.methoddemo;

public class loopcontroldemo {
    public static void main(String[] args) {
        //continue:跳过本次循环，继续执行下次循环,相当于直接跳到i++
        for (int i = 1; i <= 5; i++) {
            if (i == 3){
                continue;
            }
            System.out.println("小老虎在吃第" + i + "个包子");

        }


        //break:直接结束整个循环
        for (int i = 1; i <= 5; i++) {
            System.out.println("小老虎在吃第" + i + "个包子");

            if (i == 3){
                break;
            }


        }
    }
}
