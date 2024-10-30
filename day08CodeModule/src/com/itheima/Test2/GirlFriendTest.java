package com.itheima.Test2;

public class GirlFriendTest {
    public static void main(String[] args) {
        GrilFriend gf = new GrilFriend();
        gf.setName("Java");
        gf.setAge(23);
        gf.setGender("女");

        System.out.println(gf.getName());
        System.out.println(gf.getAge());
        System.out.println(gf.getGender());

        gf.sleep();
        gf.eat();
    }


}
