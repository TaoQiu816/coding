package com.itheima.Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Consumer;

public class CollectionDemo7 {
    public static void main(String[] args) {
        //得益于IDK8开始的新技术Lambda表达式，提供了一种更简单、更直接的遍历集合的方式
        //default void forEach(Consumer<? super T> action):结合lambda遍历集合
        //

        //创建集合添加元素
        Collection<String> coll = new ArrayList<>();
        coll.add("zhangsan");
        coll.add("lisi");
        coll.add("wangwu");
        coll.add("zhaoliu");

        //利用匿名内部类遍历
        //consumer是函数式接口
        //底层翠理:
        //其实也会自己遍历集合。依次得到每一个元素
        //把得到的每一个元素。传递给下面的accept方法
        //s依次表示集合中的每一个数据
        /*coll.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                //s依次表示集合中的每一个数据
                System.out.println(s);
            }
        });*/

        //lambda表达式(简化后)
        coll.forEach( s-> System.out.println(s));//s依次表示集合中的每一个数据


    }
}
