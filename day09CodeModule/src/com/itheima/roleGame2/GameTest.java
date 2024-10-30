package com.itheima.roleGame2;

public class GameTest {
    public static void main(String[] args) {
        //创建第一个角色
        Role r1 = new Role("乔峰", 100, '男');
        //创建第二个角色
        Role r2 = new Role("鸠摩智", 100, '女');
        //展示角色信息
        r1.showRoleInfo();
        r2.showRoleInfo();


        //开始格斗，回合制游戏,直到有人被KO则终止游戏
        while (true){
            //r1攻击r2
            r1.attack(r2);
            //若r2血量为0则终止游戏
            if (r2.getBlood()==0){
                System.out.println(r1.getName() + "KO了" + r2.getName());
                break;
            }

            //r2攻击r1
            r2.attack(r1);
            //若r2血量为0则终止游戏
            if (r1.getBlood()==0){
                System.out.println(r2.getName() + "KO了" + r1.getName());
                break;
            }
        }

    }
}
