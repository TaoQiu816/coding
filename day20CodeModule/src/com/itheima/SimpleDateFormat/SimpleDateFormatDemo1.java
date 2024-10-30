package com.itheima.SimpleDateFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo1 {
    public static void main(String[] args) throws ParseException {
        //空参构造：默认格式
        //有参构造（传递字符串string pattern）：指定格式

        //public final string format(Date date)方法：格式化（日期对象->字符串）
        //public Date parse(string source)方法：解析（字符串->日期对象）

        //METHOD1();

        //时间字符串的解析
        String date ="1971-08-08 08:08:08";
        //创建simpleDateFormat对象时
        //细节：格式要与字符串中的格式完全一致
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //解析字符串所表示的时间为Date对象
        Date d = sdf.parse(date);
        System.out.println(d);
        System.out.println(d.getTime());

        METHOD1();
    }

    private static void METHOD1() {
        //空参构造对象，默认格式
        SimpleDateFormat sdf1 = new SimpleDateFormat();
        Date d1 = new Date(0L);
        String str1 = sdf1.format(d1);
        System.out.println(str1);//1970/1/1 上午8:00

        //有参构造，指定格式
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年M月d日 H:m:s");
        String str2 = sdf2.format(d1);
        System.out.println(str2);

        //加上星期几
        SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss EE");
        String str3 = sdf3.format(d1);
        System.out.println(str3);
    }
}
