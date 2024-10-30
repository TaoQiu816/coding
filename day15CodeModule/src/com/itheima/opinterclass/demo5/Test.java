package com.itheima.opinterclass.demo5;

public class Test {
    public static void main(String[] args) {


        //匿名内部类
        //实现了接口
        //重写了接口中所有的抽象方法
        //创建了对象
        //实际的类是大括号中的内容，实现的是大括号前的接口名
        new Swim(){

            @Override
            public void swim() {
                System.out.println("重写接口中的抽象方法");
            }
        };

        //匿名内部类
        //继承了类
        //重写了接口中所有的抽象方法
        //创建了对象
        //实际的类是大括号中的内容，继承的是大括号前的接口名
        new Animal(){

            @Override
            public void eat() {
                System.out.println("重写了类中的抽象方法");
            }
        };

        //使用匿名内部类调用方当
        method(
                new Animal() {
                    @Override
                    public void eat() {
                        System.out.println("狗吃骨头");
                    }
                }
        );
        //因为大括号中的类继承了animal类
        //此时也就是多态，animal a  = 子类对象
        //这样使用对于那些只使用一次的对象不用再去单独的定义

        /*使用场景
                当方法的参数是接口或者类时
        以接口为例，可以传递这个接口的实现类对象，
        如果实现类只要使用一次，就可以用匿名内部类简化代码*/




    }
    public static void method(Animal a){
        a.eat();
    }
}
