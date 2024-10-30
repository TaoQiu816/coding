package com.itheima.mystatic.opextendsdemo3;

public class OverseasStudent extends Person{
    public void lunch(){
        eat();
        drink();

        this.eat();
        this.drink();

        super.eat();
        super.drink();
    }

    @Override
    public void eat() {
        System.out.println("吃意大利面");
    }
    //子类中和父类一模一样的方法声明
    //重写注解
    @Override
    public void drink(){
        System.out.println("喝凉水");
    }
    //重写的应用场景：
    //当父类方法不能满足子类现在的需求时，需要对此方法进行重写
    //但是注意要在子类重写的方法上面加上重写注解
    //如果发生了重写，则会覆盖虚方法表中的原有方法
    //只有被添加到虚方法表中的方法才可以被重写
}
