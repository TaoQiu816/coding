package com.itheima.Collection.List;

import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.Consumer;

public class Listdemo2 {
    public static void main(String[] args) {
        /*List系列集合的五种遍历方式:
        1.迭代器
        2.列表迭代器
        3.增强for
        4.Lambda表达式
        5.普通for循环
        迭代器遍历：在遍历的过程中需要删除元素，请使用迭代器
        列表迭代器：在遍历的过程中需要添加元素，请使用列表迭代器。

        增强for遍历
        Lambda表达式：仅仅想遍历，那么使用增强for或Lambda表达式:

        普通for： 如果遍历的时候想操作索引，可以用普通for。


        */

        //创建集合添加对象
        List<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");

        //1.迭代器遍历
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            String str = iterator.next();
            System.out.print(str+ ", ");
        }
        System.out.println();

        //增强for（单列集合可用） 可用快捷键
        for (String s: list){
            System.out.print(s+ ", ");
        }
        System.out.println();

        //lambda表达式,s为获取到的数据
        list.forEach(s-> System.out.print(s+ ", "));
        System.out.println();

        //普通for循环(用到size,get)
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        //列表迭代器（也是接口）
        //在遍历的过程中可以添加元素（移除元素原本迭代器就有）
        //但是必须用迭代器中的方法,并且将元素添加到当前遍历到的元素后一个位置
        ListIterator<String> listIterator = list.listIterator();
        while (listIterator.hasNext()){
            String s = listIterator.next();
            if (s.equals("bbb")){
                listIterator.add("gwdiugcuiw");
            }
            System.out.println(s);
        }
        System.out.println(list);


    }
}
