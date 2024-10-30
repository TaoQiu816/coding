package com.itheima.Collection.List;

import java.util.ArrayList;
import java.util.List;

public class Listdemo1 {
    public static void main(String[] args) {
       /*
       List系列集合独有的方法:
        void add(int index,E element):在此集合中的指定位置插入指定的元素
        E remove(int index):删除指定索引处的元素，返回被删除的元素
        E set(int index,E element):修改指定索引处的元素，返回被修改的元素
        E get(int index):返回指定索引处的元素
        */
        //注意：list本身也是一个接口，不能直接创建其对象，要通过其实现类创建对象

        //创建集合
        List<String> list = new ArrayList<>();
        List<Integer> numlist = new ArrayList<>();

        numlist.add(1);
        numlist.add(2);
        numlist.add(3);

        //1.添加元素（没有索引）
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        System.out.println(list);
        System.out.println("===============");

        //2.通过索引添加元素
        //该索引的原有元素依次向后移动
        list.add(1,"fff");
        list.add(2,"ppp");
        list.add(4,"ttt");
        System.out.println(list);
        System.out.println("===============");

        //3.直接删除元素(无索引，通过元素对象删除)，返回bollean
        list.remove("aaa");
        System.out.println(list);
        System.out.println("===============");

        //4.通过索引删除元素，返回被删除的元素
        String remove = list.remove(1);
        System.out.println(remove);
        System.out.println(list);
        System.out.println("===============");

        //注意细节：
       /* //在调用方法的时候，如果方法出现了重载现象
        //优先调用，实参跟形参类型一致的那个方法。*/
        //因此对于numlist，会优先删除传递索引的元素
        numlist.remove(1);
        System.out.println(numlist);
        System.out.println("===============");
        //如果要不通过索引删除指定元素，要将被删除的元素手动装箱成包装类
        Integer i = Integer.valueOf(1);
        numlist.remove(i);
        System.out.println(numlist);
        System.out.println("===============");

        //修改元素,返回被修改元素
        String set = list.set(0, "iuwfdhbfiu");
        System.out.println(set);
        System.out.println(list);
        System.out.println("===============");

        //获取指定索引的元素,可用于遍历list
        System.out.println(list.get(3));


    }
}
