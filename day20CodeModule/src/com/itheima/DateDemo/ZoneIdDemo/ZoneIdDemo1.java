package com.itheima.DateDemo.ZoneIdDemo;

import java.time.ZoneId;
import java.util.Set;

public class ZoneIdDemo1 {
    public static void main(String[] args) {
        //ZoneId  时区

        /*
        static Set<string> getAvailableZoneIds() 获取Java中支持的所有时区
        static ZoneId systemDefault() 获取系统默认时区(对象)
        static Zoneld of(string zoneld) 获取一个指定时区(对象)

        均为静态方法，直接通过类名调用即可
        */

        //获取所有时区(名称)  时区名称格式为：洲名/城市名  （或郭家铭/城市名）
        Set<String> zoneIds = ZoneId.getAvailableZoneIds();
        System.out.println(zoneIds.size());//600
        System.out.println(zoneIds);

        //获取当前系统的默认时区
        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println(zoneId);

        //获取指定时区（括号内必须指定某一时区，否则会报错）
        ZoneId zoneId1 = ZoneId.of("America/Araguaina");
        System.out.println(zoneId1);//America/Araguaina
    }
}
