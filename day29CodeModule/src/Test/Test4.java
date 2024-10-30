package Test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Test4 {
    public static void main(String[] args) throws IOException {
        //需求:
        //一个文件里面存储了班级同学的信息，每一个学生信息占一行
        //格式为:张三-男-23。
        //要求通过程序实现随机点名器
        //运行效果:
        //70%的概率随机到男生
        //30%的概率随机到女生
        //总共随机100万次，统计结果。
        //注意观察:看生成男生和女生的比例是不是接近于7:3

        //读取文件中的学生信息并且存储
        BufferedReader br = new BufferedReader(new FileReader("day29CodeModule\\info.txt"));
        //存储所有男同学与女同学的信息（分别存储）
        ArrayList<String> boyList = new ArrayList<>();
        ArrayList<String> girlList = new ArrayList<>();
        //读取文件并添加
        String str;
        while ((str=br.readLine())!=null){
            //根据性别添加信息
            if (str.split("-")[1].equals("男")){//字符串比较不能用“==”
                boyList.add(str);
            }else {
                girlList.add(str);
            }
        }

        //随机点名
        //利用随机数的范围点名：0~6为男生，7~9为女生
        //计数器
        int boyCount=0;
        int girlCount=0;
        Random r = new Random();
        for (int i = 0; i < 1000000; i++) {
            int x = r.nextInt(10);

            if (x<=6){
                //点男生
                //打乱男生信息的顺序
                Collections.shuffle(boyList);
                System.out.println(boyList.get(0));
                boyCount++;
            }else {
                //点女生
                //打乱信息的顺序
                Collections.shuffle(girlList);
                System.out.println(girlList.get(0));
                girlCount++;
            }
        }

        //统计概率
        System.out.println(boyCount/1000000.0);
        System.out.println(girlCount/1000000.0);


    }
}
