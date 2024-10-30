package com.itheima.mystatic.opextendsdemo7;

public class Employee {
    //共有属性
    private String id;
    private String name;
    private String job;

    public void work(){
        System.out.println("员工工作");
    }

    //构造方法

    public Employee() {
    }

    public Employee(String id, String name, String job) {
        this.id = id;
        this.name = name;
        this.job = job;
    }
    //get与set

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

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
}
