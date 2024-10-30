package com.itheima.mystatic.opextendsdemo3;

public class Student extends Person{
    public void lunch(){
        eat();
        //其实在调用方法前面有一个隐含的this,即this.eat()
        //先在本类中查看eat和drink方法，就会调用子类的，如果没有，就会调用从父类继承下来的方法
        drink();

        //直接调用父类
        super.drink();
        super.eat();
    }
}
