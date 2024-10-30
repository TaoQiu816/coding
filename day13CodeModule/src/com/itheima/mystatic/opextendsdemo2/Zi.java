package com.itheima.mystatic.opextendsdemo2;

public class Zi extends Fu {
    String name = "zi";

    public void show(){
        String name = "zishow";
        System.out.println(name);
        System.out.println(this.name);
        System.out.println(super.name);//最多只能使用一次super
    }

}
