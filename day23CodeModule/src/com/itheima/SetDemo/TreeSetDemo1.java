package com.itheima.SetDemo;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo1 {
    public static void main(String[] args) {
        //Treeset的特点:
        //1.不重复、无索引、可排序
        //2.可排序:按照元素的默认规则(有小到大)排序。
        //3.Treeset集合底层是基于红黑树的数据结构实现排序的，增删改查性能都较好。

        //对于数值类型：Integer Double,默认按照从小到大的顺序进行排序
        //对于字符、字符串类型：按照字符在ASCII码表中的数字升序进行排序
        //字符串是从第一个字符挨个往后按照ASCII码表确定顺序的，只要有一个字母能确定顺序，后面的就不再继续比较

        //存取整数并进行排序
        TreeSet<Integer> treeSet = new TreeSet<>();

        treeSet.add(9);
        treeSet.add(5);
        treeSet.add(6);
        treeSet.add(1);
        treeSet.add(3);
        treeSet.add(2);

        //不重复、无索引、可排序(默认从小到大)
        //打印
        System.out.println(treeSet);

        //三种方法遍历
        //迭代器
        Iterator<Integer> iterator = treeSet.iterator();
        while (iterator.hasNext()) {
            Integer i = iterator.next();
            System.out.println(i);
        }
        System.out.println("==============================");

        //增强for
        for (Integer i : treeSet) {
            System.out.println(i);
        }
        System.out.println("==============================");

        //lambda表达式
        treeSet.forEach(integer -> System.out.println(integer));


    }
}
