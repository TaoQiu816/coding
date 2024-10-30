package Test;

import cn.hutool.core.io.FileUtil;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test3 {
    public static void main(String[] args) throws IOException {
        //需求:
        //有一个文件里面存储了班级同学的信息，每一个信息占一行。
        //格式为:张三-男-23
        //要求通过程序实现随机点名器。
        //运行效果:
        //第一次运行程序:随机同学姓名1(只显示名字)
        //第二次运行程序:随机同学姓名2(只显示名字)
        //第三次运行程序:随机同学姓名3(只显示名字)


        /*//首先读取文件中的所有学生信息
        ArrayList<String> list = (ArrayList<String>) FileUtil.readLines("D:\\JAVA_study\\java_study_code\\day29CodeModule\\info2.txt", "UTF-8");
        //打乱数据
        Collections.shuffle(list);
        //获取第一个索引的学生数据并打印
        System.out.println(list.get(0).split("-")[0]);*/

        //常规读取，不使用工具包,创建缓冲流对象
        BufferedReader br = new BufferedReader(new FileReader("day29CodeModule\\info.txt"));
        ArrayList<String> list = new ArrayList<>();
        //循环读取每行并存入List
        String s;
        while ((s=br.readLine())!=null){
            list.add(s);
        }
        //打乱
        Collections.shuffle(list);
        //获取第一个索引的学生
        System.out.println(list.get(0).split("-")[0]);
    }
}
