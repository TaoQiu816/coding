package BufferedStreamDemo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferStreamDemo4 {
    public static void main(String[] args) throws IOException {
        //字符缓冲输出流：自带8192个字符的缓冲区（字符数组，java中一个字符(char)两个字节，所以是16k的缓冲区）
        //构造方法:
        //public Bufferedwrite(writer r)
        //特有方法:
        //public void newline()跨平台的换行
        //
        //细节：
        //如果要写出的文件不存在，则会创建一个当前路径对应的文件，但要保证父级路径存在（同前）
        //默认清空目标文件夹，如果不想清空可以打开续写开关，但是要在参数里面新建writer对象打开续写开关

        BufferedWriter bw = new BufferedWriter(new FileWriter("day29CodeModule\\writer.txt"));

        //写出数据
        bw.write("123");
        bw.newLine();//跨平台的换行
        bw.write("123");
        bw.newLine();//跨平台的换行

        bw.close();

    }
}
