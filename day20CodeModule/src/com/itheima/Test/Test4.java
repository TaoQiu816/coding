package com.itheima.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAccessor;
import java.util.Date;

public class Test4 {
    public static void main(String[] args) throws ParseException {
        //请使用代码实现计算你活了多少天，用JDK7和JDK8两种方式完成
        //JDK7
        //规则:只要对时间进行计算或者判断，都需要先获取当前时间的 毫秒值

        //获取当前时间毫秒值

        /*//获取生日毫秒值
        String birth = "2001年8月16日";
        String birthDay = "1971年8月8日";
        //转换成时间对象(解析字符串)
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
        Date birth1 = sdf.parse(birth);
        System.out.println(birth1);
        //获取毫秒值
        long time1 = birth1.getTime();
        System.out.println(time1);

        Date birth2 = sdf.parse(birthDay);
        System.out.println(birth2);
        long time2 = birth2.getTime();
        System.out.println(time2);

        //当前时间，通过system获取
        long now = System.currentTimeMillis();


        System.out.println("my:"+((now-time1)/1000/60/60/24));
        System.out.println("my:"+((now-time2)/1000/60/60/24));*/


        //JDK8  使用datetimeformTTER等类
        //有三个类计算时间间隔：period  duration chronoUnit

        //获取时间
        LocalDate b1 = LocalDate.of(2001, 8, 16);
        LocalDate b2 = LocalDate.of(1971, 8, 8);
        LocalDate now = LocalDate.now();
        //直接计算时间差
        long day1 = ChronoUnit.DAYS.between(b1, now);
        long day2 = ChronoUnit.DAYS.between(b2, now);

        System.out.println(day1);
        System.out.println(day2);


    }
}
