package Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class Test6 {
    public static void main(String[] args) throws IOException {
        //随机点名器4 (学生独立完成)
        //需求:
        //一个文件里面存储了班级同学的姓名，每一个姓名占一行，
        //要求通过程序实现随机点名器。
        //运行效果:
        //被点到的学生不会再被点到
        //如果班级中所有的学生都点完了，需要自动的重新开启第二轮点名
        //细节1:假设班级有10个学生，每一轮中每一位学生只能被点到一次，程序运行10次，第一轮结束
        //细节2:第11次运行的时候，我们自己不需要手动操作本地文件，要求程序自动开始第二点点名

        //读取学生信息
        BufferedReader br = new BufferedReader(new FileReader("day29CodeModule\\info.txt"));

        //将学生姓名存储在集合中
        ArrayList<String> list = new ArrayList<>();
        //存储已点名学生
        ArrayList<String> already = new ArrayList<>();
        String s;
        while ((s = br.readLine()) != null) {
            list.add(s.split("-")[0]);
        }
        br.close();

        //外循环表示点名多少论
        for (int i = 0; i <= 2; i++) {
            //点名，一轮点名的次数就是所有数据的个数
            for (int j = 0; j < list.size(); j++) {


                Collections.shuffle(list);
                String name = list.get(0);
                System.out.println(name);
                //被点过的放入另一个集合
                already.add(name);
                //在原集合中去掉这个元素
                list.remove(name);

            }
            //如果一轮点名完成，也就是list空了，将另一集合的元素拷贝过来重新点名
            list.addAll(already);
            already.clear();
        }
    }
}
