package com.itheima.Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class CollectionDemo4 {
    public static void main(String[] args) {
        //迭代器细节注意点:
        //1，报错NoSuchElementException
        //2，迭代器遍历完毕，指针不会复位
        //3，循环中只能用一次next方法
        //4，迭代器遍历时，不能用集合的方法进行增加或者删除

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

        //当上面循环结束之后，达代器的拍针已经指向了最后没有元素的位置
        //System.out.println(iterator.next());//NoSuchElementException
        //因为迭代器不依赖索引，因此报错是没有这个元素而不是索引越界

        //迭代器遍历完毕，指针不会复位
        System.out.println(iterator.hasNext());

        //如果要再次遍历集合，只能再次获取一i个新的迭代器对象
        Iterator<String> iterator2 = coll.iterator();
        while (iterator2.hasNext()){
            String s = iterator2.next();
            System.out.println(s);
        }
    }
}
