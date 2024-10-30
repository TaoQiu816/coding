package BufferedStreamDemo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferStreamDemo3 {
    public static void main(String[] args) throws IOException {
        //字节缓冲流（包装了基本流）
        //字符缓冲输入流:
        //构造方法:
        //public BufferedReader(Reader r)
        //特有方法:
        //public string readLine()读一整行（跨平台读取，不同系统结果一样）
                //读取结束返回null

        BufferedReader br = new BufferedReader(new FileReader("day29CodeModule\\a.txt"));
        //读取一行数据
        //细节：readLine方法在读取的时候。一次读取一整行，遇到回车换行结束
                //但是不会将旧车和换行读取到内存当中（要自己加回车换行）
       /* String line = br.readLine();
        System.out.println(line);*/

        //读取所有数据
        String line;
        while ((line=br.readLine())!=null){
            System.out.println(line);//自带换行
        }

        //只需要关掉缓冲流
        br.close();
    }
}
