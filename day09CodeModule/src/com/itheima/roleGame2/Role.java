package com.itheima.roleGame2;

import java.util.Random;

public class Role {
    //属性
    private String name;
    private int blood;
    private char gender;
    private String face;//长相是随机的

    //长相数组
    String[] boyfaces = {"风流俊雅", "气宇轩昂", "相貌英俊", "五官端正", "相貌平平", "一塌糊涂", "面目狰狞"};
    String[] girlfaces = {"美奂绝伦", "沉鱼落雁", "婷婷玉立", "身材娇好", "相貌平平", "相貌简陋", "惨不忍睹"};

    //attack 攻击描述：
    String[] attacks_desc={
            "%s使出了一招【背心钉】，转到对方的身后，一掌向%s背心的灵台穴拍去。",
            "%s使出了一招【游空探爪】，飞起身形自半空中变掌为抓锁向%s。",
            "%s大喝一声，身形下伏，一招【劈雷坠地】，捶向%s双腿。",
            "%s运气于掌，一瞬间掌心变得血红，一式【掌心雷】，推向%s。",
            "%s阴手翻起阳手跟进，一招【没遮拦】，结结实实的捶向%s。",
            "%s上步抢身，招中套招，一招【劈挂连环】，连环攻向%s。"
    };

    //injured 受伤描述：
    String[] injureds_desc={
            "结果%s退了半步，毫发无损",
            "结果给%s造成一处瘀伤",
            "结果一击命中，%s痛得弯下腰",
            "结果%s痛苦地闷哼了一声，显然受了点内伤",
            "结果%s摇摇晃晃，一跤摔倒在地",
            "结果%s脸色一下变得惨白，连退了好几步",
            "结果『轰』的一声，%s口中鲜血狂喷而出",
            "结果%s一声惨叫，像滩软泥般塌了下去"
    };

    //空参构造
    public Role() {

    }

    //有参构造
    public Role(String name, int blood, char gender) {
        this.name = name;
        this.blood = blood;
        this.gender = gender;
        //长相随机初始化（根据性别），直接调用类中的方法
        setFace(gender);
    }


    public String getFace() {
        return face;
    }

    public void setFace(char gender) {
        //根据性别随机设置长相，若非男非女则设置为默认长相惨不忍睹
        //随机数
        Random r = new Random();
        if (gender == '男') {
            int index = r.nextInt(boyfaces.length);
            this.face = boyfaces[index];
        } else if (gender == '女') {
            int index = r.nextInt(girlfaces.length);
            this.face = girlfaces[index];
        } else {
            this.face = "惨不忍睹";
        }

        this.face = face;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
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

        //随机输出一个攻击效果
        int index = r.nextInt(attacks_desc.length);
        System.out.printf(attacks_desc[index], this.getName(), role.getName());
        System.out.println();

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
        //根据剩余血量，输出被攻击者的描述
        if (remainBlood > 90){
            System.out.printf(injureds_desc[0], role.getName());
        } else if (remainBlood >80 && remainBlood <= 90) {
            System.out.printf(injureds_desc[1], role.getName());
        }else if (remainBlood >70 && remainBlood <= 80) {
            System.out.printf(injureds_desc[2], role.getName());
        }else if (remainBlood >60 && remainBlood <= 70) {
            System.out.printf(injureds_desc[3], role.getName());
        }else if (remainBlood >40 && remainBlood <= 60) {
            System.out.printf(injureds_desc[4], role.getName());
        }else if (remainBlood >20 && remainBlood <= 40) {
            System.out.printf(injureds_desc[5], role.getName());
        }else if (remainBlood >10 && remainBlood <= 20) {
            System.out.printf(injureds_desc[6], role.getName());
        }else {
            System.out.printf(injureds_desc[7], role.getName());
        }
        System.out.println();


    }

    public void showRoleInfo() {
        System.out.println("姓名为:" + getName());
        System.out.println("血量为:" + getBlood());
        System.out.println("长相为:" + getFace());
        System.out.println("性别为:" + getGender());
    }
}
