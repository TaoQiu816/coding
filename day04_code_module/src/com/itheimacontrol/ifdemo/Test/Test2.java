package com.itheimacontrol.ifdemo.Test;

public class Test2 {
    public static void main(String[] args) {
        //十字路口遇红绿灯的行为判断
        //红灯停，绿灯行，黄灯慢

        //定义变量表示等的状态,true为亮，false为灭
        boolean isLightGreen = false;
        boolean isLightRed = false;
        boolean isLightYellow = true;


        //对灯光进行判断
        if (isLightRed){
            System.out.println("Stop!!");
        }
        if (isLightGreen){
            System.out.println("go!!");
        }
        if (isLightYellow){
            System.out.println("slow!!");
        }





    }
}
