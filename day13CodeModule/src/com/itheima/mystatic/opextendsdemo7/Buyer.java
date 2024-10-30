package com.itheima.mystatic.opextendsdemo7;

public class Buyer extends AdminStaff{

    //工作内容

    @Override
    public void work() {
        System.out.println("采购物资");
    }

    public Buyer() {
        this(null,null,"管理","采购物资");

    }

    public Buyer(String id, String name, String job, String manageThing) {
        super(id, name, job, manageThing);
    }
}
