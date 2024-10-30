package com.itheima.mystatic.opextendsdemo7;

public class test {
    public static void main(String[] args) {
        Lecturer l = new Lecturer();
        System.out.println(l.getId()+","+l.getName()+","+l.getJob()+","+l.getTeachWay());
        l.work();
    }
}
