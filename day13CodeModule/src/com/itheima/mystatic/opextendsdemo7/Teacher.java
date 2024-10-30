package com.itheima.mystatic.opextendsdemo7;

public class Teacher extends Employee{
    String teachWay;
    //教研部内部根据教学方式分为不同教师

    //工作内容不同

    @Override
    public void work() {
        System.out.println("负责教学");
    }

    public Teacher() {
        this(null,null,"教学",null);

    }

    public Teacher(String id, String name, String job, String teachWay) {
        super(id, name, job);
        this.teachWay = teachWay;
    }

    public String getTeachWay() {
        return teachWay;
    }

    public void setTeachWay(String teachWay) {
        this.teachWay = teachWay;
    }
}
