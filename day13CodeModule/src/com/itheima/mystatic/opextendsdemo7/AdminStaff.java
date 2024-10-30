package com.itheima.mystatic.opextendsdemo7;

public class AdminStaff extends Employee{
    //行政内部区分负责事项
    String manageThing;

    //工作内容

    @Override
    public void work() {
        System.out.println("负责管理");
    }

    public AdminStaff() {

    }

    public AdminStaff(String id, String name, String job, String manageThing) {
        super(id, name, job);
        this.manageThing = manageThing;
    }

    public String getManageThing() {
        return manageThing;
    }

    public void setManageThing(String manageThing) {
        this.manageThing = manageThing;
    }
}
