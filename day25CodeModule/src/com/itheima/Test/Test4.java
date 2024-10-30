package com.itheima.Test;

import java.util.*;

public class Test4 {
    public static void main(String[] args) {
        //Map集合案例-省和市
        //需求
        //定义一个Map集合，键用表示省份名称province，值表示市city，但是市会有多个。
        //添加完毕后，遍历结果格式如下:
        //江苏省=南京市，扬州市，苏州市，无锡市，常州市
        //湖北省=武汉市，孝感市，十堰市，宜昌市，鄂州市
        //河北省=石家庄市，唐山市，邢台市，保定市，张家口市

        //创建集合对象，双列集合默认使用hashmap
        //值为单列集合
        HashMap<String, ArrayList<String>> hmap = new HashMap<>();
        //创建市的集合
        ArrayList<String> city1 = new ArrayList<>();
        ArrayList<String> city2 = new ArrayList<>();
        ArrayList<String> city3 = new ArrayList<>();

        //批量添加
        Collections.addAll(city1, "南京市", "扬州市", "苏州市", "无锡市", "常州市");
        Collections.addAll(city2, "武汉市", "孝感市", "十堰市", "宜昌市", "鄂州市");
        Collections.addAll(city3, "石家庄市", "唐山市", "邢台市", "保定市", "张家口市");

        //put方法返回的是被覆盖的值
        hmap.put("江苏省", city1);
        hmap.put("湖北省", city2);
        hmap.put("河北省", city3);

        System.out.println(hmap);

        //遍历输出指定格式
        //遍历1：先获取键，存于单列集合，在获取其值
        Set<String> keys = hmap.keySet();
        for (String key : keys) {
            //System.out.println(key+"="+hmap.get(key));
            //获取值并遍历值集合
            //拼接成字符串(间隔负号，起始负号，结束符号)
            StringJoiner sj = new StringJoiner(", ", "", "");
            for (String s : hmap.get(key)) {
                sj.add(s);
            }
            //拼接键值对
            System.out.println(key + " = " + sj);
        }
        //遍历2：获取所有entry对象，通过entryset方法，再遍历
        //b遍历3.lambda表达式


    }
}
