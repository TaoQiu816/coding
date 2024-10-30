package com.itheima.Test1;

public class phoneTest {
    //测试类
    public static void main(String[] args) {
        //创建phone的对象
        //格式 ： 类名 对象名 = new 类名();

        //类：共同特征的描述
        //对象：真实存在的具体实例
        Phone p = new Phone();

        //使用对象：使用成员变量或方法
        // 使用对象
        //        1：使用成员变量
        //            格式：对象名.变量名
        //            范例：p.brand
        //        2：使用成员方法
        //            格式：对象名.方法名()
        //            范例：p.call()

        p.brand = "小米";
        p.price = 1999.99;

        System.out.println(p.brand);
        System.out.println(p.price);
        p.call();
        p.playGame();

    }
}
