package com.itheima.mystatic.opextendsdemo5;

public class Person {
    String name;
    int age;
    String school;

    public Person() {
        //访问本类构造方法\
        //使用场景：某些属性由默认值时，并且也必须在第一行使用
        this(null,0,"电子科大");
        System.out.println("父类的无参构造");
    }

    public Person(String name, int age,String school) {
        this.name = name;
        this.age = age;
        this.school= school;
    }
}
