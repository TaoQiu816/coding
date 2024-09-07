package day04_homework;

import java.util.Scanner;

public class homework5 {
    public static void main(String[] args) {
        //2019年1月1日起，国家推出新的个人所得税政策，起征点上调值5000元。
        //也就是说税前工资扣除三险一金（三险一金数额假设是税前工资的10%）后如果不足5000元，则不交税。
        //如果大于5000元，那么大于5000元的部分按梯度交税，具体梯度比例如下：
        //0 ~ 3000元的部分，交税3%
        //
        //​	3000 ~ 12000元的部分，交税10%
        //
        //​	12000 ~ 25000的部分 ， 交税20%
        //
        //​	25000 ~ 35000的部分，交税25%
        //
        //​	35000 ~ 55000的部分，交税30%
        //
        //​	55000 ~ 80000的部分，交税35%
        //
        //​	超过80000的部分，交税45%
        //比如：黑马某学员入职一家企业后，税前工资是15000，则他每月该交个税的部分是15000-1500-5000=8500元，
        //个税缴纳数额是3000×3%+5500×10%=640元。税后工资12860元。
        //
        //请完成一个个税计算程序，在用户输入税前工资后，计算出他对应的纳税数额，以及税后工资为多少？

        //输入税前工资
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入税前工资：");
        double money = sc.nextDouble();

        //if语句判断所在区间
        if (money*0.9 >=0 && money*0.9 < 5000){
            //不用交税
            System.out.println("不用缴个税，税后工资为" + (money*0.9));
        } else if (money*0.9 >=5000) {
            double texPart = money*0.9 - 5000;
            //需要交税,分区间讨论
            if (texPart >= 0 && texPart <3000){
                //第一区间
                double tex = texPart *0.03;
                //money = money - tex;
                System.out.println("交税金额为" + tex + ",税后工资为" + ((money*0.9) - tex));
            } else if (texPart >= 3000 && texPart < 12000) {
                //第二区间
                //double texPart2 = texPart1 - 3000;
                double tex = 3000*0.03 + (texPart - 3000)*0.1;
                System.out.println("交税金额为" + tex + ",税后工资为" + ((money*0.9) - tex));
            } else if (texPart >= 12000 && texPart < 25000) {
                //第三区间
                double tex = 3000*0.03 + (12000 - 3000)*0.1 + (texPart - 12000)*0.2;
                System.out.println("交税金额为" + tex + ",税后工资为" + ((money*0.9) - tex));
            }else if (texPart >= 25000 && texPart < 35000) {
                //第四区间
                double tex = 3000*0.03 + (12000 - 3000)*0.1 + (25000 - 12000)*0.2 + (texPart - 25000)*0.25;
                System.out.println("交税金额为" + tex + ",税后工资为" + ((money*0.9) - tex));
            }else if (texPart >= 35000 && texPart < 55000) {
                //第五区间
                double tex = 3000*0.03 + (12000 - 3000)*0.1 + (25000 - 12000)*0.2 + (35000 - 25000)*0.25 + (texPart - 35000)*0.3;
                System.out.println("交税金额为" + tex + ",税后工资为" + ((money*0.9) - tex));
            }else if (texPart >= 55000 && texPart < 80000) {
                //第六区间
                double tex = 3000*0.03 + (12000 - 3000)*0.1 + (25000 - 12000)*0.2 + (35000 - 25000)*0.25 + (55000 - 35000)*0.3 + (texPart -55000)*0.35;
                System.out.println("交税金额为" + tex + ",税后工资为" + ((money*0.9) - tex));
            }else if (texPart >= 80000) {
                //第七区间
                double tex = 3000 * 0.03 + (12000 - 3000) * 0.1 + (25000 - 12000) * 0.2 + (35000 - 25000) * 0.25 + (55000 - 35000) * 0.3 + (80000 - 55000) * 0.35 + (texPart - 80000) * 0.45;
                System.out.println("交税金额为" + tex + ",税后工资为" + ((money*0.9) - tex));
            }
        }else {
            System.out.println("税前工资输入错误");
        }
    }
}
