package BufferedStreamDemo.Test;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Test2 {
    public static void main(String[] args) throws IOException {
        //回复文本顺序
        //每行有个序号

        //1.取读（纯文本文件，所以用字符流，又要对每行进行排序，可逐行读取，redline）
        //字符缓冲流
        BufferedReader br = new BufferedReader(new FileReader("day29CodeModule\\a.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("day29CodeModule\\acopy.txt"));
        ArrayList<String> list = new ArrayList<>();
        //逐行读取
        String line;
        while ((line=br.readLine())!=null){
            System.out.println(line);
            list.add(line);
        }

        //2.排序需要容器，arraylist对第一个数字进行排序
        //o1为当前字符串，o2为已有字符串
        ////按照第一个数字进行从小到大排序
        //（类似Arrays中的排序）
        //或者根据分隔符号分割然后获取序号
        Collections.sort(list, ( o1,  o2)-> Integer.parseInt(o1.substring(0,1))
                        -Integer.parseInt(o2.substring(0,1)));
        //3.将排序后的字符串写出到文件中
        for (String s : list) {
            bw.write(s);
            bw.newLine();
        }


        br.close();
        bw.close();


    }
}
