package com.itheima.DateDemo;

import java.util.Date;
import java.util.Random;

public class dateDemo2 {
    public static void main(String[] args) {
        //需求1:打印时间原点开始一年之后的时间
        //需求2：定义任意两个date对象，比较哪个时间在前那个时间在后


        //method1();

        //需求2
        //两个对象获取随机时间
        Random r = new Random();
        //随机获取整数表示毫秒值，取绝对值保证非负
        Date d1 = new Date(Math.abs(r.nextInt()));
        Date d2 = new Date(Math.abs(r.nextInt()));
        System.out.println(d1);
        System.out.println(d2);

        //获取两时间对象的毫秒值用于比较时间按先后
        long t1 = d1.getTime();
        long t2 = d2.getTime();

        if (t1>t2){
            System.out.println("第二个时间先");
        } else if (t2 > t1) {
            System.out.println("第一个时间先");
        }else {
            System.out.println("两时间相同");
        }
    }

    private static void method1() {
        //需求1、
        //对象表示时间原点
        Date d1 = new Date(0L);
        //获取d1的毫秒值
        long time = d1.getTime();
        //在其基础之上加上一年时间的毫秒值（可能超出了int范围）
        time = time + 1000L * 60 * 60 * 24 * 365;
        //将计算之后的时间毫秒值重新设置d1
        d1.setTime(time);
        System.out.println(d1);
    }
}
