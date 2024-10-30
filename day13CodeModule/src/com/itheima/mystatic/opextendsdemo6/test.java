package com.itheima.mystatic.opextendsdemo6;

public class test {
    public static void main(String[] args) {
        Manager m = new Manager("uestc001","zhangsan",8000,3000);
        System.out.println(m.getId()+m.getName()+m.getWage()+m.getManageWage());
        m.work();
        m.eat();


        Chef c = new Chef("uestc002","lisi",6000);
        System.out.println(c.getId()+c.getName()+c.getWage());
        c.work();
        c.eat();


    }
}
