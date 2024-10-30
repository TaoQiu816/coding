package com.itheima.Collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo1 {
    public static void main(String[] args) {
        //Collection是单列集合的祖宗接口，它的功能是全部单列集合都可以继承使用的
        //常见成员方法:
        //add、clear、remove、contains、isEmpty、size
        //注意点：
        //Collection是一个接口，我们不能直接创建它的对象
        //所以，在使用它的方法时，只能创建它的实现类的对象，如arraylist


        //这种是利用多态创建对象
        //目的：学习collection中的方法
        //自己在做练习的时候，还是按照之前的方式创建对象
        Collection<String> coll = new ArrayList<>();

        //1.添加元素
        //返回值细节1：在List系列集合中添加数据，方法永远返回true，因为list系列是允许元素重复的
        //返回值细节2：在set系列集合中添加数据，如果当前元素不存在，返回true，若已存在则返回false，因为不允许元素重复
        coll.add("aaa");
        coll.add("bbb");
        coll.add("bbb");
        System.out.println(coll);
        System.out.println("==================================");

        //2.清空集合
        coll.clear();
        System.out.println(coll);
        System.out.println("==================================");


        coll.add("aaa");
        coll.add("bbb");
        coll.add("ccc");
        //3.删除元素
        //注意：因为collection里面定义的是共性的方法。所以此时 不能通过索引 进行制除。只能通过元素的对象进行删除。
        //(set系列没有索引)
        //返回值为boolean，删除成功返回true(元素存在)，元素不存在则返回false
        coll.remove("bbb");
        System.out.println(coll);
        System.out.println("==================================");



        //4.判断元素是否包含在集合中
        //细节：此方法的底层是通过equals方法进行判断是否存在的
        //所以，如果集合中存储的是自定义对象，如student，那么在javabean类中一定要重写equals方法
        //见demo2
        coll.remove("bbb");

        System.out.println(coll.contains("aaa"));
        System.out.println(coll.contains("bbb"));
        System.out.println("==================================");

        //5.判断集合是否为空
        //底层是看集合的长度
        System.out.println(coll.isEmpty());
        System.out.println("==================================");


        //6.获取集合的长度
        System.out.println(coll.size());
        System.out.println("==================================");


    }
}
