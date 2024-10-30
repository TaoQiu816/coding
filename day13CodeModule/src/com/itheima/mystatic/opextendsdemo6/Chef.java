package com.itheima.mystatic.opextendsdemo6;

public class Chef extends Employee{
    @Override
    public void work() {
        System.out.println("炒菜");
    }

    public Chef() {
    }

    public Chef(String id, String name, double wage) {
        super(id, name, wage);
    }
    //get和set在父类中已经存在
}
