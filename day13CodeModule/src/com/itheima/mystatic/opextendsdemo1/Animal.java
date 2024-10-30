package com.itheima.mystatic.opextendsdemo1;

public class Animal {

    //父类的权限修饰符不能使用private
    //私有：只能在本类中使用
    //子类只能访问父类中非私有成员

    //吃饭
    public void eat(){
        System.out.println("吃饭");
    }

    //喝水
    public void drink(){
        System.out.println("喝水");
    }
}
