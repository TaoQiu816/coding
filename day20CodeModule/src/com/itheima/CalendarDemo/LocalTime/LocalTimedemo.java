package com.itheima.CalendarDemo.LocalTime;

import java.time.LocalTime;

public class LocalTimedemo {
    public static void main(String[] args) {
        //localtime只包含时分秒
        // 获取本地时间的日历对象。(包含 时分秒)
        LocalTime now = LocalTime.now();
        System.out.println(now);
        System.out.println("================================");

        //单独获取每个属性
        int hour = now.getHour();
        System.out.println("hour: " + hour);

        int minute = now.getMinute();
        System.out.println("minute: " + minute);

        int second = now.getSecond();
        System.out.println("second:" + second);

        int nano = now.getNano();
        System.out.println("nano:" + nano);

        System.out.println("================================");

        //of方法指定时间
        System.out.println(LocalTime.of(20, 12));//时分
        System.out.println(LocalTime.of(20, 13, 55));//时分秒
        System.out.println(LocalTime.of(20, 13, 55, 150));//时分秒纳秒
        System.out.println("================================");

        LocalTime localTime = LocalTime.of(20, 13, 55, 150);
        //is系列方法
        System.out.println(localTime.isAfter(now));
        System.out.println(localTime.isBefore(now));
        System.out.println("================================");


        //with系列的方法，只能修改时、分、秒
        System.out.println(now.withHour(22));

        //mius 系列的方法，只能修改时、分、秒

        //plus系列的方法，只能修改时、分、秒
        System.out.println(now.plusHours(15));

    }
}
