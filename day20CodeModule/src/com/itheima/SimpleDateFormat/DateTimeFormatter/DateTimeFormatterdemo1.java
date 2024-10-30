package com.itheima.SimpleDateFormat.DateTimeFormatter;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterdemo1 {
    public static void main(String[] args) {
        //用于时间的格式化和解析
        /*
            static DateTimeFormatter ofPattern(格式) 获取格式对象
            String format(时间对象) 按照指定方式格式化
        */

        //首先要有被格式化的时间对象
        ZonedDateTime time = Instant.now().atZone(ZoneId.of("Asia/Shanghai"));

        //解析/格式化器
        //获取格式对象
        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH时mm分ss秒 EE a");
        //格式化
        String format = dtf1.format(time);
        System.out.println(format);

    }
}
