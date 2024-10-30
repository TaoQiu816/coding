package com.itheima.Generics;

import java.util.ArrayList;
import java.util.Iterator;

public class GenericsDemo1 {
    public static void main(String[] args) {
        ////结论:
        ////如果我们没有给集合指定类型，默认认为所有的数据类型都是object类型
        ////此时可以往集合添加任意的数据类型。
        ////带来一个坏处:我们在获取数据的时候，无法使用他的特有行为。

        ////此时推出了泛型，可以在添加数据的时候就把类型进行统一
        ////而且我们在获取数据的时候，也省的强转了，非常的方便，

        //泛型的好处
        //统一数据类型。
        //把运行时期的问题提前到了编译期间，避免了强制类型转换可能出现的异常，因为在编译阶段类型就能确定下来。
        //扩展知识点:java中的泛型是伪泛型，在编译时还是会当成object类型处理，但是外界获取的时候还是会强转成指定泛型

        //泛型的细节
        //泛型中不能写基本数据类型，因为不能转换成object对象
        //指定泛型的具体类型后，传递数据时，可以传入该类类型或者其子类类型
        //如果不写泛型，类型默认是Object

        //1.创建集合的对象
        ArrayList<String> list = new ArrayList<>();
        //2.添加数据
       // list.add(123);
        list.add("aaa");
        //list.add(new student("zhangsan", 123));
        //3.遍历集合获取里面的每一个元素
        //迭代器也要使用泛型，并且与集合的泛型保持一致
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String str = it.next();
            //多态的弊端是不能访问子类的特有功能
            //obj.length();
            //str.length();
            System.out.println(str);
        }
    }
}
