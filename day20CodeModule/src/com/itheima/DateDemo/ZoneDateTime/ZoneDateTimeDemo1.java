package com.itheima.DateDemo.ZoneDateTime;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZoneDateTimeDemo1 {
    public static void main(String[] args) {
        //带时区的时间

        /*
            static ZonedDateTime now() 获取当前时间的ZonedDateTime对象
            static ZonedDateTime ofXxxx(。。。) 获取指定时间的ZonedDateTime对象
            ZonedDateTime withXxx(时间) 修改时间系列的方法
            ZonedDateTime minusXxx(时间) 减少时间系列的方法
            ZonedDateTime plusXxx(时间) 增加时间系列的方法
         */

        //（静态）获取当前时间的ZonedDateTime对象（带时区）
        ZonedDateTime now = ZonedDateTime.now();
        System.out.println(now);

        //静态，ofXxxx，获取指定时间的ZonedDateTime对象
        // 年月日时分秒纳秒以及时区对象方式指定
        ZonedDateTime time1 = ZonedDateTime.of(2023, 10, 10, 10, 50, 58, 1000000, ZoneId.of("Asia/Shanghai"));
        System.out.println(time1);
        //通过instant+时区的方式指定获取事件对象
        Instant instant = Instant.ofEpochMilli(0L);
        ZoneId zoneId = ZoneId.of("Asia/Shanghai");
        ZonedDateTime time2 = ZonedDateTime.ofInstant(instant, zoneId);
        System.out.println(time2);

        //withXxxx  修改时间的系列方法
        ZonedDateTime time3 = time2.withYear(1971);
        System.out.println(time3);

        //减少时间系列的方法
        ZonedDateTime time4 = time3.minusSeconds(20L);
        System.out.println(time4);

        //增加时间系列的方法
        ZonedDateTime time5 = time3.plusMonths(7);
        System.out.println(time5);

        //细节：
        //JDK8新增的时间对象都是不可变的
        //如果我们修改、减少、增加了时间，调用者不会发生改变，而是会产生一个新的时间对象


    }
}
