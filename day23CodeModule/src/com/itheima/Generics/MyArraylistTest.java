package com.itheima.Generics;

public class MyArraylistTest {
    public static void main(String[] args) {
        //创建对象时，类名后有泛型，则一定要加上泛型
        myArraylist<String> mylist = new myArraylist<>();

        mylist.add("aaa");
        mylist.add("bbb");
        mylist.add("ccc");
        mylist.add("ddd");

        System.out.println(mylist.get(1));

        System.out.println(mylist.toString());
    }
}
