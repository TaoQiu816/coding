package com.itheima.SimpleDateFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo3 {
    public static void main(String[] args) throws ParseException {
        //秒杀活动时间判断

        //秒杀开始时间
        String start = "2023年11月11日 0:0:0";
        //秒杀结束时间
        String end = "2023年11月11日 0:10:0";

        //小贾下单付款时间
        String jia = "2023年11月11日 0:01:0";
        String pi = "2023年11月11日 0:11:0";

        //首先解析时间为Date对象并获取秒杀开始和结束的毫秒值用于判断是否参加
        //时间解析为Date对象
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        Date startDate = sdf1.parse(start);
        Date endDate = sdf1.parse(end);
        Date jiatDate = sdf1.parse(jia);
        Date piDate = sdf1.parse(pi);

        System.out.println(startDate);
        System.out.println(endDate);
        System.out.println(jiatDate);
        System.out.println(piDate);

        //获取各自时间的毫秒值
        long startDateTime = startDate.getTime();
        long endDateTime = endDate.getTime();
        long jiatDateTime = jiatDate.getTime();
        long piDateTime = piDate.getTime();


        //判断小贾是否参加
        if (jiatDateTime>startDateTime && jiatDateTime <endDateTime){
            System.out.println("小贾参加了");
        }else {
            System.out.println("小贾没有参加");
        }
        //判断小皮
        if (piDateTime>startDateTime && piDateTime <endDateTime){
            System.out.println("小皮参加了");
        }else {
            System.out.println("小皮没有参加");
        }

    }
}
