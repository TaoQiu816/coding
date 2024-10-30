package com.itheima.SetDemo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Consumer;

public class SetDemo1 {
    public static void main(String[] args) {
        //利用Set系列的集合，添加字符串，并使用多种方式遍历。
        //迭代器
        //增强for
        //Lambda表达式
        //

        //set继承于collection，方法基本与collection的Api一致，比如上面的三种遍历方法
        //set同样是一个接口而不是类

        //1.创建set对象（通过实现类,多态的方法创建对象）
        Set<String> s = new HashSet<>();

        //2.添加元素，使用collection中的方法add,返回值为bollean
        //set元素不能重复
        //因此，如果返回值为false说明元素有重复
        //即：当前元素是第一次添加可以添加成功，若是第二次添加则会失败并返回false
        s.add("bbb");
        s.add("aaa");

        s.add("ccc");
        boolean a = s.add("aaa");
        System.out.println(a);
        //打印的顺序与add的顺序不同，即Set是存取无序的（存和取的顺序不一定相同）
        System.out.println(s);

        //不可使用索引，因为没有索引,没有get(index)的方法

        //迭代器遍历
        Iterator<String> iterator = s.iterator();
        while (iterator.hasNext()) {
            String str = iterator.next();//获取元素并移动迭代器指向
            System.out.println(str);
        }

        //增强for遍历
        for (String string : s) {
            System.out.println(string);
        }

        //lambda表达式遍历,先调用forEach方法，匿名内部类，再改写
        s.forEach(str -> System.out.println(str));


    }
}
