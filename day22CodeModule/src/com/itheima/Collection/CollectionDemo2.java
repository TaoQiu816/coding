package com.itheima.Collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo2 {
    public static void main(String[] args) {
        //创建集合对象
        Collection<Student> coll = new ArrayList<>();

        //创建学生对象
        Student s1 = new Student("zhangsan",23);
        Student s2 = new Student("lisi",22);
        Student s3 = new Student("wangwu",21);

        //添加到集合
        coll.add(s1);
        coll.add(s2);
        coll.add(s3);

        //判断集合中某一个学生对象是否包含
        Student s4 = new Student("lisi",22);
        //如果同名同年龄，则是同一个学生(属性值相同)
        //因为contains方法在底层依赖equals方法来判断对象是否一致的。
        //如果存的是自定义对象，没有重写equa1s方法，那么默认使用obiect类（没有重写就使用父类的）中的equals方法进行判断，而obiect类中equals方法，依赖地址值进行判断
        //所以，需要在自定义的Javabean类中，重写eguals方法就可以了(只看属性值而不看地址)。
        System.out.println(coll.contains(s4));

    }
}
