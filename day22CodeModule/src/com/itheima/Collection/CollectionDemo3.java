package com.itheima.Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo3 {
    public static void main(String[] args) {
        //collection通用遍历方式
        /*1.迭代器遍历
        2.增强for遍历
        3.lambda表达式遍历*/


        /*迭代器:在遍历的过程中需要删除元素，请使用迭代器，
        增强for、Lambda:
        仅仅想遍历，那么使用增强for或Lambda表达式。*/

        //1.迭代器遍历
        //特点：迭代器不依赖索引,是集合专用的遍历方式
        //迭代器类：Iterator
       /* 迭代器遍历相关的三个方法:
        Iterator<E> iterator()：获取一个迭代器对象
        boolean hasNext()：判断当前指向的位置是否有元素
        E next()：获取当前指向的元素并移动指针*/

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

        //细节注意点:
        //1，报错NoSuchElementException
        //2，迭代器遍历完毕，指针不会复位
        //3，循环中只能用一次next方法
        //4，迭代器遍历时，不能用集合的方法进行增加或者删除

    }
}
