package day06_homework;

import java.util.Random;
import java.util.Scanner;

public class methodHomework5 {
    public static void main(String[] args) {
        //双色球，六红球和一个蓝球，根据猜中的红篮球数目判断奖金
        //红球1-33，唯一不重复，篮球1-16，中奖号码随机生成
        //1.生成中奖号码
        //arr存储中奖号码
        int[] arr = creatNumber();
        /*System.out.println("开奖号码为：");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();*/

        //2.用户输入彩票号码（6红+1蓝）,键盘录入
        int[] userInputArr = userInputNumber();
        System.out.println("用户彩票号码为");
        for (int i = 0; i < userInputArr.length; i++) {
            System.out.print(userInputArr[i] + " ");
        }
        System.out.println();

        //3.判断中奖情况
        //计数变量
        int redCount = 0;
        int blueCount = 0;
        //判断红球猜中个数,只验证前六个数字
        for (int i = 0; i < userInputArr.length-1; i++) {//用户输入的数组
            int redNumber = userInputArr[i];
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[i] == userInputArr[j]) {
                    redCount++;
                    //如果找到了，那么后面的数字就没有必要继续比较了
                    //跳出内循环，继续判断下一个红球号码是否中奖
                    break;
                }
            }
        }
        System.out.println("猜中红球"+ redCount);


        //篮球个数
        if (arr[arr.length - 1] == userInputArr[userInputArr.length - 1]){
            blueCount++;
        }
        System.out.println("猜中蓝球"+ blueCount);

        //判断中奖情况
        System.out.println("开奖号码为：");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        if(redCount == 6 && blueCount == 1){
            System.out.println("恭喜你，中奖1000万");
        }else if(redCount == 6 && blueCount == 0){
            System.out.println("恭喜你，中奖500万");
        }else if(redCount == 5 && blueCount == 1){
            System.out.println("恭喜你，中奖3000");
        }else if((redCount == 5 && blueCount == 0) ||  (redCount == 4 && blueCount == 1)){
            System.out.println("恭喜你，中奖200");
        }else if((redCount == 4 && blueCount == 0) ||  (redCount == 3 && blueCount == 1)){
            System.out.println("恭喜你，中奖10");
        }else if((redCount == 2 && blueCount == 1) ||  (redCount == 1 && blueCount == 1)|| (redCount == 0 && blueCount == 1)){
            System.out.println("恭喜你，中奖5");
        }else{
            System.out.println("谢谢参与，谢谢惠顾");
        }




    }

    public static int[] userInputNumber() {

        int[] userInputArr = new int[7];

        Scanner sc = new Scanner(System.in);
        //输入前六位红色球号码
                      //int[] redAlready = new int[6];//存储已输入的红球号码，判断后续输入是否重复
        for (int i = 0; i < userInputArr.length-1; ) {
            System.out.println("请输入第" + (i + 1) + "个红球号码");
            int redNumber = sc.nextInt();
            //判断是否在1-33之中，符合范围后判断是否重复
            if (redNumber >= 1 && redNumber <= 33) {

                //符合范围后，判断是否重复
                boolean flag = contains(userInputArr, redNumber);
                if (!flag) {
                    //若未重复则保存，并进行下次输入，否则重新输入
                    userInputArr[i] = redNumber;
                    i++;//将i++放在此处，确保只有在输入合法且成功保存后才进行下次输入
                } else {
                    //重复，不合法，重新输入
                    System.out.println("红色球号码重复，重新输入");
                }

            } else {
                //不合法，重新输入
                System.out.println("超出红球号码范围，重新输入");
            }
        }
        //输入第七位，蓝色球号码1-16，符合范围则存储，否则继续输入，使用死循环
        while (true) {
            System.out.println("请输入蓝色球号码");
            int blueNumber = sc.nextInt();
            //判断合法否
            if (blueNumber >= 1 && blueNumber <= 16) {
                //合法则存储并终止
                userInputArr[6] = blueNumber;
                break;
            } else {
                //不合法则重新输入
                System.out.println("蓝色球号码超出范围，请重新输入");
            }
        }
        return userInputArr;

    }

    public static int[] creatNumber() {
        Random r = new Random();
        int[] arr = new int[7];
        //先生成红球号码
        for (int i = 0; i < arr.length-1; ) {
            //获取红球号码,1到33
            int redNumber = r.nextInt(33)+1;
            //验证此号码是否已经给出现过
            if (!contains(arr, redNumber)){
                //若未重复，添加到数组中，并且进行下一次取号
                arr[i] = redNumber;
                i++;
         }
        }
        //获取蓝色球号码
        arr[arr.length-1] = r.nextInt(16) + 1;
        return arr;

    }

    //判断value是否在数组中已经存在,返回true表示已经存在
    public static boolean contains(int[] arr, int value) {
        //标记，默认不存在
        // boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            if (value == arr[i]) {
                return true;
            }
        }
        //未返回true则返回false
        return false;
    }

}
