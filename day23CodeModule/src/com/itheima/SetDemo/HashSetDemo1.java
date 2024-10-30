package com.itheima.SetDemo;

public class HashSetDemo1 {
    public static void main(String[] args) {
        //Hashset底层原理(哈希表)
        //HashSet集合底层采取哈希表存储数据
        //哈希表是一种对于增删改查数据性能都较好的结构

        //底层是一个数组，每个数组是一个链表，(jdk8以后)新加入的元素会挂在当前位置已有元素之后
        //JDK8以后，当链表长度超过8，而且数组长度大于等于64时，自动转换为红黑树
        //
        //如果集合中存储的是自定义对象，必须要重写hashcode和equals方法：
        //先通过hashcode算出的哈希值得出应该存入的位置，如果该位置没有元素，则直接存
        //如果有元素，则使用equals方法比较元素是否重复，未重复则添加


        //无索引原因：数组+链表+红黑树混合的数据结构，定义索引无法恰当表示？

        //hashset通过hashcode和equals方法机制保证去重

        //
        //哈希值：哈希值是对象的整数表现形式
        //1.根据hashcode方法算出来的int类型的整数
        //2.该方法定义在0bject类中，所有对象都可以调用，默认使用地址值进行计算
        //3.一般情况下，会重写hashCode方法，利用对象内部的属性值计算哈希值
        //对象的哈希值特点：
        //1.如果没有重写hashcode方法，不同对象计算出的哈希值是不同的
        //2.如果已经重写hashcode方法，不同的对象只要属性值相同，计算出的哈希值就是一样的
        //3.在小部分情况下，不同的属性值或者不同的地址值计算出来的哈希值也有可能一样。(哈希碰撞)

        //创建对象
        Student s1 = new Student("zhangsan",23);
        Student s2 = new Student("lisi",24);
        Student s3 = new Student("wangwu",25);
        Student s4 = new Student("zhangsan",23);

        //1.如果没有重写hashcode方法（通过地址值计算），不同对象计算出的哈希值是不同的
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());
        System.out.println(s4.hashCode());

        //2.如果已经重写hashcode方法，不同的对象只要属性值相同，计算出的哈希值就是一样的
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());
        System.out.println(s4.hashCode());

        //哈希碰撞：小概率事件
        //string类已经重写了hashcode方法
        System.out.println("abc".hashCode());
        System.out.println("acD".hashCode());
    }
}
