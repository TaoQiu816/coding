package com.itheima.ToolClass;

import java.time.Duration;
import java.time.LocalDateTime;

public class durationdemo {
    public static void main(String[] args) {
        //Duration  时间间隔（秒，纳，秒）
        //本地时间对象
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        //指定事件对象
        LocalDateTime birthDate = LocalDateTime.of(2000, 1, 1, 0, 0, 0);
        System.out.println(birthDate);
        Duration duration = Duration.between(birthDate, now);//第二个参数减第一个参数
        System.out.println("相差的时间间隔对象:" + duration);

        System.out.println("============================================");
        System.out.println(duration.toDays());//两个时间差的天数
        System.out.println(duration.toHours());//两个时间差的小时数
        System.out.println(duration.toMinutes());//两个时间差的分钟数
        System.out.println(duration.toMillis());//两个时间差的毫秒数
        System.out.println(duration.toNanos());//两个时间差的纳秒数
    }
}
