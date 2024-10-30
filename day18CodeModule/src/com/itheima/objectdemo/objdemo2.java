package com.itheima.objectdemo;

public class objdemo2 {
    public static void main(String[] args) {
        //比较两个对象是否相等
        //本质是比较地址值
        //可在类中重写此方法。

        Student s1 = new Student("zhangsan",23);
        Student s2 = new Student("zhangsan",23);
        System.out.println(s1.equals(s2));

        //如果没有重写equal方法，那么默认使用Object中的方法进行比较，比较的是对象的地址值是否相等
        //一般来讲地址值对于我们的意义不大，所以会重写，重写之后比较的就是对象内部的属性值

    }
}
