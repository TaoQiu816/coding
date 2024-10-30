package com.itheima.mystatic.opextendsdemo7;

public class Lecturer extends Teacher{
    //讲师内部无特有属性

    //教研部内部员工工作内容不同

    @Override
    public void work() {
        System.out.println("讲授课程");
    }

    public Lecturer() {
        this(null,null,"教学","讲授课程");
    }

    public Lecturer(String id, String name, String job, String teachWay) {
        super(id, name, job, teachWay);
    }

}
