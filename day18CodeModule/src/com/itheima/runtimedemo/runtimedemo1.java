package com.itheima.runtimedemo;

import java.io.IOException;

public class runtimedemo1 {
    public static void main(String[] args) throws IOException {
        //runtime中的方法不是静态方法，要先获取runtime的对象才能调用方法
        //在源码中runtime的构造方法是私有化private的，外界不能独立创建其对象

        //获取runtime对象的方法
        /*Runtime r1 = Runtime.getRuntime();
        Runtime r2 = Runtime.getRuntime();
        System.out.println(r2==r1);*/
        //都是同一个runtime对象

        //exit停止虚拟机,system.exit调用的就是此方法
        /*Runtime.getRuntime().exit(0);
        System.out.println("这个语句执行了吗？");*/

        //获取CPU线程数
        System.out.println(Runtime.getRuntime().availableProcessors());//16线程

        //虚拟机JVM能从系统中获取的总内存大小（最多能获取的,单位是byte字节
        System.out.println(Runtime.getRuntime().maxMemory()/1024/1024);//最多4038MB

        //虚拟机JVM已经从系统中获取的总内存大小（已经获取的,单位是byte字节
        System.out.println(Runtime.getRuntime().totalMemory()/1024/1024);//已经获取254MB

        //虚拟机JVM剩余内存的大小
        System.out.println(Runtime.getRuntime().freeMemory()/1024/1024);

        //运行CMD命令
        //shotdown: 关机
        //-s： 默认在一分钟后关机
        //-s -t 指定时间：在指定时间后（秒）关机
        //-a：取消关机操作
        //-r：关机并重启
        Runtime.getRuntime().exec("notepad");//打开记事本
        Runtime.getRuntime().exec("shutdown -a");



    }
}
