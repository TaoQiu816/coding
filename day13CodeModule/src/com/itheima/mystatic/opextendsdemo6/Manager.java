package com.itheima.mystatic.opextendsdemo6;

public class Manager extends Employee{
    private double manageWage;

    @Override
    public void work() {
        System.out.println("管理其他人");
    }

    public Manager() {

    }

    public Manager(String id, String name, double wage, double manageWage) {
        super(id, name, wage);
        this.manageWage = manageWage;
    }
    //get与set方法，父类已有的就不用再写，直接使用即可


    public double getManageWage() {
        return manageWage;
    }

    public void setManageWage(double manageWage) {
        this.manageWage = manageWage;
    }
}
