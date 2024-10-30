package com.itheima.mystatic.opextendsdemo5;

public class Student extends Person{

    public Student() {
        //子类构造方法中第一行是隐藏的super()去访问父类的无参构造
        //super()是默认有的，并且是第一行
        //默认先访问父类的无参构造，再执行自己
        super();
        System.out.println("子类的无参构造");
    }

    public Student(String name, int age,String school) {
        //想要方法访问父类的有参构造，必须手动书写
        super(name,age,school);
    }

}
