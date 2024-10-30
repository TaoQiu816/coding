package com.itheima.DateDemo.InstantDemo;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.SortedMap;

public class InstantDemo1 {
    public static void main(String[] args) {
        //Instant  时间戳

        /*
            static Instant now() 获取当前时间的Instant对象(标准时间)
            static Instant ofXxxx(long epochMilli) 根据(秒/毫秒/纳秒)获取Instant对象
            ZonedDateTime atZone(ZoneId zone) 指定时区
            boolean isxxx(Instant otherInstant) 判断系列的方法
            Instant minusXxx(long millisToSubtract) 减少时间系列的方法
            Instant plusXxx(long millisToSubtract) 增加时间系列的方法
        */


        //(静态方法)获取当前时间的Instant对象(标准时间)
        Instant now = Instant.now();
        System.out.println(now);

        //(静态方法)根据(秒/毫秒/纳秒)获取Instant对象
        Instant instant1 = Instant.ofEpochMilli(0L);//根据毫秒获取Instant对象
        System.out.println(instant1);
        Instant instant2 = Instant.ofEpochSecond(1L);//根据秒
        System.out.println(instant2);
        Instant instant3 = Instant.ofEpochSecond(1L, 1000000000L);//根据秒和纳秒的时间
        System.out.println(instant3);
        System.out.println("==========================================================================");

        //指定时区（非静态，要通过对象调用），括号内参数为时区对象,返回带时区的时间对象
        ZonedDateTime time = Instant.now().atZone(ZoneId.of("Asia/Shanghai"));
        System.out.println(time);//2024-10-10T10:40:27.895166200+08:00[Asia/Shanghai]
        System.out.println("==========================================================================");


        //isXxxx  判断
        Instant instant4 = Instant.ofEpochMilli(0L);
        Instant instant5 = Instant.ofEpochMilli(10000000L);
        //isBefore:判断调用者代表的时间是否在参数表示时间的前面
        boolean result1 = instant4.isBefore(instant5);
        System.out.println(result1);//true
        //isAfter:判断调用者代表的时间是否在参数表示时间的后面
        boolean result2 = instant4.isAfter(instant5);
        System.out.println(result2);//false
        System.out.println("==========================================================================");


        // minusXxx  减少时间系列的方法
        Instant instant6 = Instant.ofEpochMilli(3000L);
        Instant instant7 = instant6.minusMillis(1000L);
        Instant instant8 = instant6.minusSeconds(1L);
        System.out.println(instant6);
        System.out.println(instant7);
        System.out.println(instant8);
        System.out.println("==========================================================================");

        // plusXxx 增加时间系列的方法
        Instant instant9 = instant7.plusMillis(1000L);
        System.out.println(instant9);
        Instant instant10 = instant8.plusSeconds(1);
        System.out.println(instant10);
    }
}
