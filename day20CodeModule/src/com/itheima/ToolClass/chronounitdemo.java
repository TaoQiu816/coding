package com.itheima.ToolClass;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class chronounitdemo {
    public static void main(String[] args) {
        //ChronoUnit是最全的，最常用的


        //当前时间
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        //指定时间
        LocalDateTime localDateTime = LocalDateTime.of(2000, 1, 1, 0, 0);


        //算的时间差是第二个减去第一个
        System.out.println("相差的年数:" + ChronoUnit.YEARS.between(now,localDateTime));
        System.out.println("相差的月数:" + ChronoUnit.MONTHS.between(now, localDateTime));
        System.out.println("相差的周数:" + ChronoUnit.WEEKS.between(now, localDateTime));
        System.out.println("相差的天数:" + ChronoUnit.DAYS.between(now, localDateTime));
        System.out.println("相差的时数:" + ChronoUnit.HOURS.between(now, localDateTime));
        System.out.println("相差的分数:" + ChronoUnit.MINUTES.between(now, localDateTime));
        System.out.println("相差的秒数:" + ChronoUnit.SECONDS.between(now, localDateTime));
        System.out.println("相差的毫秒数:" + ChronoUnit.MILLIS.between(now, localDateTime));
        System.out.println("相差的微秒数:" + ChronoUnit.MICROS.between(now, localDateTime));
        System.out.println("相差的纳秒数:" + ChronoUnit.NANOS.between(now, localDateTime));
        System.out.println("相差的半天数:" + ChronoUnit.HALF_DAYS.between(now, localDateTime));
        System.out.println("相差的十年数:" + ChronoUnit.DECADES.between(now, localDateTime));
        System.out.println("相差的世纪(百年)数:" + ChronoUnit.CENTURIES.between(now, localDateTime));
        System.out.println("相差的千年数:" + ChronoUnit.MILLENNIA.between(now, localDateTime));
        System.out.println("相差的纪元数:" + ChronoUnit.ERAS.between(now, localDateTime));



    }
}
