package com.itheima.DateDemo;

import java.util.Date;

public class dateDemo1 {
    public static void main(String[] args) {
        //- `public Date()`：从运行程序的此时此刻到时间原点经历的毫秒值,转换成Date对象，分配Date对象并初始化此对象，以表示分配它的时间（精确到毫秒）。
        //- `public Date(long date)`：将指定参数的毫秒值date,转换成Date对象，分配Date对象并初始化此对象，以表示自从标准基准时间（称为“历元（epoch）”，即1970年1月1日00:00:00 GMT）以来的指定毫秒数。

        // public void setTime(long time)  设置/修改毫秒值
        // public long getTime()   获取时间对象的毫秒值

        //创建对象表示时间(空参构造：当前时间)
        Date d1 = new Date();//空参构造表示获取相对于时间原点的毫秒值
        System.out.println(d1);

        //有参构造，从时间远点开始经过指定时间(毫秒值)后所对应的时间
        Date d2 = new Date(52000L);//在东八区所以加了八个小时
        System.out.println(d2);


        //修改时间
        d2.setTime(1200L);//参数是long类型，最好加上L
        System.out.println(d2);

        //获取当前时间的毫秒值(相对于时间原点的毫秒值)
        long time = d2.getTime();
        System.out.println(time);

    }
}
