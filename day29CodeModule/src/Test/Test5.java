package Test;

import cn.hutool.core.io.FileUtil;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Test5 {
    public static void main(String[] args) throws IOException {
        //需求:
        //一个文件里面存储了班级同学的姓名，每一个姓名占一行。
        //要求通过程序实现随机点名器。
        //第三次必定是子云兮同学
        //运行效果:
        //第一次运行程序:随机同学姓名1
        //第二次运行程序:随机同学姓名2
        //第三次运行程序:子云兮

        //要记录点名的次数

        //读取信息
        BufferedReader br = new BufferedReader(new FileReader("day29CodeModule\\info.txt"));
        //将名字存入集合
        ArrayList<String> list = new ArrayList<>();
        String s;

        while ((s=br.readLine())!=null){
            list.add(s.split("-")[0]);
        }


        //随机点名并将点名次数进行记录
        //关联记录次数的文件
        FileInputStream fis = new FileInputStream("day29CodeModule\\count.txt");

        int count;
        count = fis.read();
        count++;//表示又进行了一次点名(就是本次点名)
        fis.close();

        if (count<'3'){

            //随机点名
            Collections.shuffle(list);
            System.out.println(list.get(0));
            FileOutputStream fos = new FileOutputStream("day29CodeModule\\count.txt");
            fos.write(count);
            //改变计数器
        } else if (count == '3') {
            System.out.println("子云兮");
        }

    }
}
