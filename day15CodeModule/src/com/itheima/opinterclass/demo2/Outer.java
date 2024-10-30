package com.itheima.opinterclass.demo2;

public class Outer {
    private int a = 10;

    class inner{
        private int a = 20;

        public void show(){
            int a=30;
            System.out.println(a);//就近原则
            System.out.println(this.a);
            System.out.println(Outer.this.a);
            //内部类中虚拟机会自动添加一个变量存储外部类对象的地址
            //通过outer.this获取了外部类对象的地址值

        }
    }
}
