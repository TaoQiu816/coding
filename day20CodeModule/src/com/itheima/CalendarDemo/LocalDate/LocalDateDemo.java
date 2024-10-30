package com.itheima.CalendarDemo.LocalDate;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.MonthDay;

public class LocalDateDemo {
    public static void main(String[] args) {
        //只包含年月日

        //1.获取当前时间的日历对象(包含 年月日)
        LocalDate now = LocalDate.now();
        System.out.println(now);
        System.out.println("=============================");

        //2.获取指定的时间的日历对象(指定年月日)
        LocalDate localDate = LocalDate.of(1971, 8, 8);
        System.out.println(localDate);
        System.out.println("=============================");

        //3.get系列方法获取localdate对象中的每一个属性值//获取年
        int year = localDate.getYear();
        System.out.println("year: " + year);
        //获取月//方式一:
        Month month = localDate.getMonth();
        //获取的是month对象，若要阿拉伯数字，则还要使用getvalue
        System.out.println("month: " + month);//
        System.out.println("month: " + month.getValue());//getvalue获取month的数字

        //方式二:
        int monthValue = localDate.getMonthValue();
        System.out.println("month: " + monthValue);
        System.out.println("=============================");

        //获取日
        //月内的第几天
        int dayOfMonth = localDate.getDayOfMonth();
        System.out.println("day:" + dayOfMonth);
        //年内的第几天
        int dayOfYear = localDate.getDayOfYear();
        System.out.println("dayOfYear:" + dayOfYear);
        //星期：周内的第几天
        DayOfWeek dayOfWeek = localDate.getDayOfWeek();
        System.out.println(dayOfWeek);
        System.out.println(dayOfWeek.getValue());
        System.out.println("=============================");

        //is开头的方法表示判断
        System.out.println(now.isAfter(localDate));
        System.out.println(now.isBefore(localDate));
        System.out.println("=============================");

        //with开头的方法表示修改，只能修改年月日
        LocalDate withedYear = now.withYear(2001);
        System.out.println(withedYear);
        System.out.println("=============================");


        //minus开头的方法表示减少，只能减少年月日
        LocalDate minusedMonths = now.minusMonths(12);
        System.out.println(minusedMonths);
        System.out.println("=============================");

        //plus开头的方法表示增加，只能增加年月日
        LocalDate plussedDays = now.plusDays(42);
        System.out.println(plussedDays);
        System.out.println("=============================");

        //-------------
        // 判断今天是否是你的生日
        //生日对象
        LocalDate birDate = LocalDate.of(2001, 8, 16);
        //今天
        LocalDate nowDate = LocalDate.now();

        //封装成MonthDay对象
        MonthDay birMd = MonthDay.of(birDate.getMonth(), birDate.getDayOfMonth());
        MonthDay nowMd = MonthDay.from(nowDate);

        System.out.println("今天是生日吗？？"+birMd.equals(nowMd));


    }
}
