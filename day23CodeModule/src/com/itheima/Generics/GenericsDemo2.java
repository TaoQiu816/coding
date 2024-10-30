package com.itheima.Generics;

import java.util.ArrayList;

public class GenericsDemo2 {
    public static void main(String[] args) {
        //
        //定义一个工具类:Listuti1
        //
        //类中定义一个静态方法addA11，用来添加多个集合的元素

        ArrayList<String> list1 = new ArrayList<>();

        //泛型方法中的类型，当方法被调用时就会被确定
        ListUtill.addAll(list1,"aaa","bbb","ccc","ddd");
        System.out.println(list1);

        ArrayList<Integer> list2 = new ArrayList<>();

        //泛型方法中的类型，当方法被调用时就会被确定
        ListUtill.addAll(list2,111,222,333,444);
        System.out.println(list2);

        ListUtill.addAllNew(list2,123,564,125,123368,49856);
        System.out.println(list2);
    }
}
