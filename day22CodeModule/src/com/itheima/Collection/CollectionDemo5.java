package com.itheima.Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo5 {
    public static void main(String[] args) {
        //迭代器细节注意点:
        //1，报错NoSuchElementException
        //2，迭代器遍历完毕，指针不会复位
        //3，循环中只能用一次next方法
        //4，迭代器遍历时（遍历过程中），不能用集合的方法进行增加或者删除

        //创建集合，添加元素
        Collection<String> coll = new ArrayList<>();
        coll.add("aaa");
        coll.add("bbb");
        coll.add("ccc");
        coll.add("ddd");

        //获取迭代器对象（通过集合的对象调用方法）
        Iterator<String> iterator = coll.iterator();
        //迭代器好比一个箭头，默认指向集合的0索引，
        //利用循环不断获取集合中的元素
        while (iterator.hasNext()) {//判断本位置是否有元素
            String s = iterator.next();
            //1. 获取本位置的元素
            //2.并将迭代器指向下一位置
            System.out.println(s);
        }

        //3，循环中只能用一次next方法
        //因为next不仅会获取当前位置的元素，还会移动迭代器所指的位置
        //因此hasNext和next方法最好一一对应的使用


        //4，迭代器遍历时，不能用集合的方法进行增加或者删除，否则会报错
        //要删除就使用迭代器自带的remove方法
        //如果要添加，暂无方法

    }
}
