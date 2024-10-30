package com.itheima.mystatic.opextendsdemo7;

public class Maintainer extends AdminStaff{

    //工作内容

    @Override
    public void work() {
        System.out.println("维护设备");
    }

    public Maintainer() {
        this(null,null,"管理","维护设备");

    }

    public Maintainer(String id, String name, String job, String manageThing) {
        super(id, name, job, manageThing);
    }
}
