package com.itheima.CalendarDemo;

import java.util.Calendar;
import java.util.Date;

public class CalendarDemo1 {
    public static void main(String[] args) {
        //细节：calendar是一个抽象类，不能直接创建对象
        //要通过其静态方法获取当前时间的日历对象,然后才能调用其类中的方法


        //1.获取日历对象,只能通过静态方法获取子类对象
        //底层原理
        //会根据系统的不同时区来获取不同的日历对象
        //会把时间中的纪元，年，月，日，分，秒，星期等等都放进一个数组中

        //细节：月份的范围是0~11，也就是月份对应的数字比实际少1，读取出来是11那么就是12月
        //星期日对应的是1
        Calendar c = Calendar.getInstance();//获取当前时间的日历对象
        System.out.println(c);

        //getTime() 获取日期对象
        Date date = c.getTime();
        System.out.println(date);

        //setTime(Date time)  给日历设置日期对象(通过时间对象所表示的时间设置日历)
        Date date1 = new Date(100L);
        c.setTime(date1);
        System.out.println(c);

        //getTimeMills()  获取时间毫秒值
        long timeInMillis = c.getTimeInMillis();
        System.out.println(timeInMillis);

        //setTimeMills(long mills)  给日历设置时间毫秒值
        c.setTimeInMillis(800000L);
        System.out.println(c);


        //在java中，数组对应的数字都定义为了常量
        //获取日期中某个字段的信息
        //细节：
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH)+1;
        int day = c.get(Calendar.DAY_OF_MONTH);
        int week = c.get(Calendar.DAY_OF_WEEK);
        System.out.println(year+","+month+","+day+","+getWeek(week));

        //设置字段信息
        c.set(Calendar.YEAR,1971);
        c.set(Calendar.MONTH,7);
        System.out.println(c.get(Calendar.YEAR)+","+(c.get(Calendar.MONTH)+1)+","+day+","+getWeek(week));

        // 增加某一字段的数据，可正可负，超出其范围就自动进位
        c.add(Calendar.MONTH,12);
        System.out.println(c.get(Calendar.YEAR)+","+(c.get(Calendar.MONTH)+1)+","+day+","+getWeek(week));



    }

    //查表法
    public static String getWeek(int index){
        String[] week={"","星期日","星期一","星期二","星期三","星期四","星期五","星期六"};
        return week[index];
    }
}
