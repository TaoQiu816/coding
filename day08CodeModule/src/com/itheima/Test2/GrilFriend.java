package com.itheima.Test2;

public class GrilFriend {
    //JavaBean类,不写main方法
    //一个JAVA文件中可以定义多个类，但是只能一个类用PUBLIC修饰，PUBLIC修饰的类名必须是JAVA代码的文件名
    //属性
    private String name;
    private int age;
    private String gender;
    //private关键字可保证数据安全性，用于修饰成员（成员变量和成员被方法）
    // 一旦使用private关键字修饰，则只能在本类中被访问，不可在其它类中使用
    //所以针对private修饰的成员变量，如果需要被其他类使用，提供相应的操作，如setXXXX(参数),getXXX()

    //因此，需要针对于每一个私有的成员变量，都要提供其get和set方法
    //set方法：给成员变量赋值
    //get方法：对外提供成员变量的值

    //给成员变量name赋值，要获取参数
    public void setName(String name){
        //局部变量表示测试类中使用方法传递过来的数据
        //等号左边，就表示成员位置的age，也就是成员变量
        this.name = name;
    }
    //对外提供name属性,返回name即可，无需接收参数
    public String getName(){
        return name;
    }


    //age
    //setAge:给成员变量age赋值，要获取参数
    public void setAge(int age){
        if (age >=18 && age <= 50){
            //符合条件才赋值
            this.age = age;
        }else {
            System.out.println("非法参数");
        }
    }
    //getAge:对外提供成员变量age的值
    public int getAge(){
        return age;
    }

    //gender
    //给成员变量gender赋值，要获取参数
    public void setGender(String gender){
        this.gender = gender;
    }
    //对外提供name属性,返回name即可，无需接收参数
    public String getGender(){
        return gender;
    }

    public void sleep(){
        System.out.println("女朋友在睡觉");
    }

    public void eat(){
        System.out.println("女朋友在吃饭");
    }

}
