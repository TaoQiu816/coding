package day03_homework;

public class homework1 {
    public static void main(String[] args) {
        //某小伙想定一份外卖，商家的优惠方式如下：
        // 鱼香肉丝单点24元，油炸花生米单点8元，
        // 米饭单点3元。订单满30元8折优惠。鱼香肉丝优惠价16元，
        // 但是优惠价和折扣不能同时使用。那么这个小伙要点这三样东西，
        // 最少要花多少钱？
        //三元运算符的使用

        //1.求不使用优惠时的总价
        double money1 = 24 + 8 + 3;
        //2.判断折后总价
        money1 = (money1 >= 30 ? money1 * 0.8 : money1);
        //3.求使用优惠时的总价
        double money2 = 16 + 8 + 3;
        //4.判断两种花费哪个更少
        double money = money1 < money2 ? money1 : money2;
        //5.打印最终花费
        System.out.println(money);
    }
}
