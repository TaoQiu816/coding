package com.itheima.roleGame;

import java.util.Random;

public class Role {
    //属性
    private String name;
    private int blood;

    //空参构造
    public Role() {

    }

    //全参构造
    public Role(String name, int blood) {
        this.name = name;
        this.blood = blood;
    }

    //成员变量的get和set方法

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBlood() {
        return blood;
    }

    public void setBlood(int blood) {
        this.blood = blood;
    }

    //定义一个方法去攻击别人
    //谁攻击谁
    //比如定义了两个对象，也就是游戏中的两个人物
    //Role r1 = new Role();以及Role r2 = new Role();
    //让ri角色攻击r2，也就是r1.攻击(r2)
    //也就是方法的调用者攻击参数

    public void attack(Role role) {
        //计算一次攻击造成的伤害，1~20之间的随机数
        Random r = new Random();
        //单次攻击伤害
        int hurt = r.nextInt(20) + 1;

        //计算剩余血量，也就是被打人role(该方法的形参)的剩余血量
        int remainBlood = role.getBlood() - hurt;
        //由于最后一次伤害大于原有剩余血量时，会让血量成为负数，因此需要修正
        //若小于零则修正为0，否则不变
        remainBlood = remainBlood < 0 ? 0 : remainBlood;
        //修改被打人血量属性为剩余的血量
        role.setBlood(remainBlood);
        //this表示方法的调用者的地址
        //显示此次攻击效果，其中攻击者为this.getName(),被攻击者为role
        System.out.println(this.getName() + "举起拳头，打了" + role.getName() + "一下，" +
                "造成了" + hurt + "点伤害," + role.getName() + "还剩" + remainBlood + "点血");

    }
}
