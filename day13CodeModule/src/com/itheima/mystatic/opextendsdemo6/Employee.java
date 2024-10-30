package com.itheima.mystatic.opextendsdemo6;

public class Employee {
    private String id;
    private String name;
    private double wage;

    public void work(){
        System.out.println("员工在工作");
    }

    public void eat(){
        System.out.println("吃米饭");
    }

    public Employee() {
    }

    public Employee(String id, String name, double wage) {
        this.id = id;
        this.name = name;
        this.wage = wage;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }
}
