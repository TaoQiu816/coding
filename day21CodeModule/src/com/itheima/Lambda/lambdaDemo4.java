package com.itheima.Lambda;

import java.util.Arrays;
import java.util.Comparator;

public class lambdaDemo4 {
    public static void main(String[] args) {
        //简化comparator接口的匿名格式
        //定义数组并存储一些字符串，利用Arrays中的sort方法进行排序
        //要求:
        //按照字符串的长度进行排序，短的在前面，长的在后面
        //(暂时不比较字符串里面的内容)

        String[] str = {"asd", "asgs", "a", "al", "lpoij", "poiuyt", "1023hddah", "usjvchuirwfhuo"};

        //如果以后要把数组中的数据按照指定的方式进行排序，就需要用到sort方法，而且要指定排序的规则
        //首先检查是否是函数式接口
        Arrays.sort(str, (o1, o2) -> o1.length() - o2.length());//按照字符串长度升序排序
        System.out.println(Arrays.toString(str));
    }
}
