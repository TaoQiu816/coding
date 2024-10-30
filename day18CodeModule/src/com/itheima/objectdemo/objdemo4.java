package com.itheima.objectdemo;

import com.google.gson.Gson;

public class objdemo4 {
    public static void main(String[] args) throws CloneNotSupportedException {
        int[] data = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,0};
        user u1 = new user(1,"zhangsan","1234","girl11",data);

        //克隆方法不能直接调用，原因：protected只能被本包中的类或其他包中的子类使用
        //要用clone方法，则必须要先重写
        user u2 = (user) u1.clone();//类型强转

        //u1.setData({1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,0});
        int[] arr = u1.getData();
        arr[0]=100;//arr获取的是数组的地址值，因此可以改变数组内容
        u1.setUsername("LISI");

        //tostring方法已重写，sout的底层会调用tostring
        //System.out.println(u1);
        //System.out.println(u2);

        //第三方工具
        Gson gson = new Gson();
        //把对象转换成为一个字符串
        String s = gson.toJson(u1);
        System.out.println(s);
        //再把字符串变回对象
        user user = gson.fromJson(s, user.class);
        System.out.println(user);
        //可用上面的第三方方法实现深克隆

        //克隆对象
        //细节：
        //方法再底层会帮我们创建一个对象，并把对象中的数据拷贝过去
        //书写细节
        //1.要重写Object中的clone方法
        //2.让JAVABEAN类实现Cloneable接口
        //创建对象并调用clone

        //Object的clone是浅克隆：基本数据类型数据直接拷贝，引用数据类型直接拷贝地址，因此改变原对象或
        //拷贝对象其中一者的引用类型数据，另一者也会改变。也就是基本数据类型和引用数据类型都完全拷贝过来
        //深克隆要自己重写：基本数据类型照样拷贝，引用数据类型会重新创建对象，字符串复用

    }
}
