package com.itheima.Test3;

public class GirlFriend {
    //Java Bean类
    //属性
    private int age;//默认0


    //动作
    public void method(){
        int age = 10;
        System.out.println(age);
        //就近原则，局部变量比成员变量更近，因此打印局部变量
        //成员变量和局部变量重名时，要使用成员变量，要加上this关键字
        //若为重名，则可以直接使用成员变量
        //this基本左右：区分成员变量和局部变量
        System.out.println(this.age);
    }

}
