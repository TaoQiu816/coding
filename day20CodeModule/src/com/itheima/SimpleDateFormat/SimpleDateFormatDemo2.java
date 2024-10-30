package com.itheima.SimpleDateFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo2 {
    public static void main(String[] args) throws ParseException {
        //将一格式的时间字符串转换为另一格式的时间

        //2000-11-11  转换为2000年11月11日

        String str = "2000-11-11";
        //解析字符串时间为Date对象来表示时间
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
        Date d = sdf1.parse(str);
        System.out.println(d);

        //将解析后的事件对象重新格式化
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年MM月dd日");
        String format = sdf2.format(d);
        System.out.println(format);
    }
}
