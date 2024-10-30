package com.itheima.Generics;

import java.util.ArrayList;

public class ListUtill {

    //工具类私有化构造方法
    private ListUtill() {
    }

    //类中定义一个静态方法addA11，用来添加多个集合的元素
    //工具方法静态
    //泛型方法写法1：将泛型写在泛型类，这样该类下的所有方法都可以使用该泛型
    //泛型方法写法2：将泛型写在方法的修饰符后面，这样泛型只能在本方法内使用
    public static <E> boolean addAll(ArrayList<E> list, E e1, E e2, E e3, E e4) {
        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);
        return true;
    }

    //E...e可变参数，底层实际上是一个数组，可通过普通for遍历添加，也可以增强for
    public static<E> void addAllNew(ArrayList<E> list, E...e){
        for (E element : e) {
            list.add(element);
        }
    }


}
