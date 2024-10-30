package com.itheima.mystatic.a01staticdemo1;

public class Student {
    //属性
    private String name;
    private String gender;
    private int age;
    //老师姓名
    public static String teacherName;

    public Student() {
    }

    public Student(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //行为
    public void study(){
        System.out.println(name + "正在学习");
    }

    //打印对象所有属性
    public void show(){
        System.out.println(name + "," + age + "," + gender + "," + teacherName);
    }
}
