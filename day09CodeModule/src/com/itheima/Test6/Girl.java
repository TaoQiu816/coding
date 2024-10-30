package com.itheima.Test6;

public class Girl {
    //属性：姓名，年龄，性别，爱好
    private String name;
    private int age;
    private String gender;
    private String hobby;

    //构造方法

    public Girl() {
    }

    public Girl(String name, int age, String gender, String hobby) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.hobby = hobby;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public void showInfo() {
        System.out.println("姓名:" + this.getName()
                + ",年龄:" + this.getAge()
                + ",性别:" + this.getGender()
                + ",爱好:" + this.getHobby());

    }
}
