package com.itheima.mystatic.opextendsdemo7;

public class Tutor extends Teacher{
    //主教内部没有专属属性

    //区分工作内容

    @Override
    public void work() {
        System.out.println("协助教学");
    }

    public Tutor() {
        this(null,null,"教学","协助教学");

    }

    public Tutor(String id, String name, String job, String teachWay) {
        super(id, name, job, teachWay);
    }
}
