package com.itheima.Test;

import java.time.LocalDate;
import java.util.Calendar;

public class Test5 {
    public static void main(String[] args) {
        /*
            判断任意的一个年份是闰年还是平年要求:用JDK7和JDK8两种方式判断提示:
            二月有29天是闰年
            一年有366天是闰年
        */

        //JDK7：使用日历
        //思路一
        //在当前年的3月1号减一天，看是2月29还是28
        Calendar c = Calendar.getInstance();
        c.set(1971,2,1);//calendar的月份范围是0~11
        //减一天
        c.add(Calendar.DAY_OF_MONTH,-1);
        //
        int i = c.get(Calendar.DAY_OF_MONTH);
        System.out.println(i);

        //思路二：看day of year
        c.set(1972,0,1);
        c.add(Calendar.DAY_OF_YEAR,-1);
        System.out.println(c);
        int i1 = c.get(Calendar.DAY_OF_YEAR);
        System.out.println(i1);

        //jdk8
        LocalDate localDate = LocalDate.of(2001, 3, 1);
        //localdate的月份范围是1~12
        //减一天,产生新的对象
        LocalDate localDate1 = localDate.minusDays(1);
        //获取是一个月中的几号
        System.out.println(localDate1.getDayOfMonth());

        //直接判断是否是闰年
        System.out.println(localDate.isLeapYear());

    }
}
