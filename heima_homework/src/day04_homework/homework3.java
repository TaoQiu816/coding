package day04_homework;

import java.util.Scanner;

public class homework3 {
    public static void main(String[] args) {
        //某银行推出了整存整取定期储蓄业务，其存期分为一年、两年、三年、五年，到期凭存单支取本息。存款年利率表如下：
        //	存期		年利率（%）
        //
        //	一年		2.25
        //
        //	两年		2.7
        //
        //	三年		3.25
        //
        //	五年		3.6
        //请存入一定金额（1000起存），存一定年限（四选一），计算到期后得到的本息总额。
        //
        //提示：
        //
        //	存入金额和存入年限均由键盘录入
        //
        //	本息计算方式：本金+本金×年利率×年限

        //输入金额与年限
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入存款金额：");
        double money = sc.nextDouble();
        System.out.println("请输入存款年限：");
        int year = sc.nextInt();

        //年限只有四种选择
        if (year == 1) {
            money = money + money * 2.25 / 100 * 1;
        } else if (year == 2) {
            money = money + money * 2.7 / 100 * 2;
        } else if (year == 3) {
            money = money + money * 3.25 / 100 * 3;
        } else if (year == 5) {
            money = money + money * 3.6 / 100 * 5;
        } else {
            System.out.println("输入年限错误");
        }

        System.out.println("本息总金额为：" + money);

    }
}
