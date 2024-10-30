package BufferedStreamDemo.Test;

import java.io.*;
import java.util.*;

public class Test3 {
    public static void main(String[] args) throws IOException {
        //回复文本顺序
        //每行有个序号

        //1.取读（纯文本文件，所以用字符流，又要对每行进行排序，可逐行读取，redline）
        //字符缓冲流
        BufferedReader br = new BufferedReader(new FileReader("day29CodeModule\\a.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("day29CodeModule\\acopy2.txt"));
        ArrayList<String> list = new ArrayList<>();
        //排序方法2：利用集合的自动排序
        TreeMap<Integer,String> map = new TreeMap<>();
        //逐行读取并获取序号以及后续内容
        String line;
        while ((line=br.readLine())!=null){
            String[] split = line.split("\\.");//要加上转义字符
            map.put(Integer.parseInt(split[0]),line);
        }
        System.out.println(map);
        //按照键值对写入
        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        for (Map.Entry<Integer, String> entry : entries) {
            //bw.write(entry.getKey()+"");
            bw.write(entry.getValue());
            bw.newLine();
        }


        br.close();
        bw.close();


    }
}
