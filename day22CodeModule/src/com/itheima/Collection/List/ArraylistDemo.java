package com.itheima.Collection.List;

public class ArraylistDemo {
    public static void main(String[] args) {
        //ArrayList集合底层原理
        //1.利用空参创建的集合，在底层创建一个默认长度为0的数组
        //2.添加第一个元素时，底层会创建一个新的长度为10的数组
        //3.存满时，会扩容1.5倍
        //4.如果一次添加多个元素，1.5倍还放不下，则新创建数组的长度以实际为准
        //

        //避免并发修改异常：ConcurrentModificationException
        //在使用迭代器或者增强for(底层也是迭代器)遍历集合的时候，不要使用集合的方法取添加或者删除元素即可


    }
}
