package com.itheima.mystatic.opextendsdemo4;

public class shapidog extends Dog{

    //当父类的方法不能满足需求了，需要进行重写
    @Override
    public void eat() {
        super.eat();
        System.out.println("狗啃吃骨头");
    }
}
