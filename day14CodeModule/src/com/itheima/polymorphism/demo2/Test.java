package com.itheima.polymorphism.demo2;

public class Test {
    public static void main(String[] args) {
        //创建对象（多态）
        Animal a = new Dog();
        //对于成员方法，编译看左边，运行看右边
        a.eat();

        //多态的弊端
        //不能调用子类的特有功能（因为父类中没有）
        //编译看左边，会先检查左边父类中是否有这个方法，没有就会报错
        //解决方法
        //将对象变回子类类型（相当于强制类型转换）再调用
        //注意：转换的时候不能瞎传，如果转换成其他类型，就会报错
        //比如此处就不能转成cat

        //可以使用instanceof关键字判断instanceof左侧变量所记录的对象是不是
        //instanceof右侧的类型
        /*Dog d = (Dog) a;
        d.lookHome();*/
        /*if (a instanceof Dog){
            Dog d = (Dog) a;
            d.lookHome();
        } else if (a instanceof Cat) {
            Cat c = (Cat) a;
            c.catchMouse();
        }else {
            System.out.println("没有这个类型，无法转换");
        }*/

        //JDK14后的新特性
        //先判断a是否是Dog类型，如果是，则强转成Dog类型，转换之后变量名为d
        //如果不是，则不强转，结果直接是false
        if (a instanceof Dog d){
            //Dog d = (Dog) a;
            d.lookHome();
        } else if (a instanceof Cat c) {
            //Cat c = (Cat) a;
            c.catchMouse();
        }else {
            System.out.println("没有这个类型，无法转换");
        }

    }
}

class Animal{
    public void eat(){
        System.out.println("动物在吃东西");
    }
}
class Dog extends Animal{
    @Override
    public void eat() {
        System.out.println("狗啃骨头");
    }
    public void lookHome(){
        System.out.println("狗看家");
    }
}
class Cat extends Animal{
    @Override
    public void eat() {
        System.out.println("猫吃猫粮");
    }
    public void catchMouse(){
        System.out.println("猫抓老鼠");
    }
}
