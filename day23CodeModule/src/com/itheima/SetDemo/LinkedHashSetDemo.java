package com.itheima.SetDemo;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        //LinkedHashset底层原理
        //有序、不重复、无索引。
        //这里的有序指的是保证存储和取出的元素顺序一致
        //原理:底层数据结构是依然哈希表，只是每个元素又额外的多了一个双链表的机制记录存储的顺序。

        //继承于hashset

        //若要求去重复，并且存取有序采用linkedhashset（效率比hashset低）

        //创建对象
        //创建学生对象
        Student s1 = new Student("zhangsan",23);
        Student s2 = new Student("lisi",24);
        Student s3 = new Student("wangwu",25);
        Student s4 = new Student("zhangsan",23);

        //创建集合
        LinkedHashSet<Student> lhs = new LinkedHashSet<>();
        System.out.println(lhs.add(s1));
        System.out.println(lhs.add(s2));
        System.out.println(lhs.add(s3));
        System.out.println(lhs.add(s4));//元素重复，添加失败（已经重写了hashcode和equals）

        //打印集合：存取顺序一样（有序）
        System.out.println(lhs);
    }
}
