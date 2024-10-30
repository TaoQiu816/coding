package com.itheima.SetDemo;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo3 {
    public static void main(String[] args) {
        //需求:请自行选择比较器排序和自然排序两种方式;
        //要求:存入四个字符串，c,ab.df,qwer
        //按照长度排序，如果一样长则按照首字母排序

        //使用比较器排序


        //创建集合
        //o1:表示当前要添加的元素
        //o2:表示红黑树中已经存在的元素
        //返回值规则同前，负数表示认为要添加的元素小，放在左边，正数表示放在右边
        //Comparator接口是函数式接口，可改写为lambda表达式
        /*TreeSet<String> ts = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int i = o1.length() - o2.length();
                //字符串等长时，调用默认的compareTo方法
                //长度不相等时，按照长度排序
                i = i == 0 ? o1.compareTo(o2) : i;
                return i;
            }
        });*/
        TreeSet<String> ts = new TreeSet<>(( o1,  o2)->{
                int i = o1.length() - o2.length();
                //字符串等长时，调用默认的compareTo方法
                //长度不相等时，按照长度排序
                i = i == 0 ? o1.compareTo(o2) : i;
                return i;
            }
        );
        //添加元素
        ts.add("c");
        ts.add("ab");
        ts.add("df");
        ts.add("qwer");
        //打印（未指定排序规则，但是string已经重写排序规则，按照首字母排序）
        System.out.println(ts);
    }
}
