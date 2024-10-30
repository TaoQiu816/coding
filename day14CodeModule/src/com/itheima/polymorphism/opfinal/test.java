package com.itheima.polymorphism.opfinal;

public class test {
    public static void main(String[] args) {
        //final修饰类、方法、变量
        //- 类：被修饰的类，不能被继承。
        //- 方法：被修饰的方法，不能被重写。
                 //比如某些定义的规则不能被改变就可以用final
        //- 变量：被修饰的变量，（叫做常量）有且仅能被赋值一次。


        //此时a必须被初始化赋值
        final int a = 0;
        System.out.println(a);

    }
}

class Fu{
     public void show(){
        System.out.println("父类的show");
    }
}

class zi extends Fu{
    @Override
    public void show() {
        System.out.println("子类的show");
    }
}

