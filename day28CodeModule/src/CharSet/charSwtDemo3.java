package CharSet;

import java.io.FileWriter;
import java.io.IOException;

public class charSwtDemo3 {
    public static void main(String[] args) throws IOException {
        //Filewriter
        //
        //1.创建字符输出流对象
            //细节1:参数是字符串表示的路径或者File对象都是可以的
            //细节2:如果文件不存在会创建一个新的文件，但是要保证父级路径是存在的
            //细节3:如果文件已经存在，则会清空文件，如果不想清空可以打开续写开关

        //2.写数据
            //细节: 如果write方法的参数是整数，但是实际上写到本地文件中的是整数在字符集上对应的字符
        //3.关流

        //- `FileWriter(File file)`： 创建一个新的 FileWriter，给定要读取的File对象。
        //- `FileWriter(String fileName)`： 创建一个新的 FileWriter，给定要读取的文件的名称。

        //- `void write(int c)` 写入单个字符。
        //- `void write(char[] cbuf) `写入字符数组。
        //- `abstract  void write(char[] cbuf, int off, int len) `写入字符数组的某一部分,off数组的开始索引,len写的字符个数。
        //- `void write(String str) `写入字符串。
        //- `void write(String str, int off, int len)` 写入字符串的某一部分,off字符串的开始索引,len写的字符个数。
        //- `void flush() `刷新该流的缓冲。
        //- `void close()` 关闭此流，但要先刷新它。

        //传递已有的文件夹,不续写
        FileWriter fr1 = new FileWriter("day28CodeModule\\a.txt");
        //传递已有的文件夹,续写
        FileWriter fr2 = new FileWriter("day28CodeModule\\b.txt",true);
        //传递不存在的文件夹
        FileWriter fr3 = new FileWriter("day28CodeModule\\c.txt");

        //写数据
        //传递整数
        fr1.write(256315);
        fr2.write(256315);
        fr3.write(256315);
        //写入字符数组，数组要new,还可以写入单个字符
        fr1.write(new char[]{'d', 's', 'a', '我', '你', '他'});
        fr2.write(new char[]{'d', 's', 'a', '我', '你', '他'});
        fr3.write(new char[]{'d', 's', 'a', '我', '你', '他'});
        //传递字符串
        fr1.write("nincduw我他");
        fr2.write("nincduw我他");
        fr3.write("nincduw我他");
        //写入字符数组的某一部分,off数组的开始索引,len写的字符个数
        fr1.write(new char[]{'d', 's', 'a', '我', '你', '他'},1,3);
        fr2.write(new char[]{'d', 's', 'a', '我', '你', '他'},1,3);
        fr3.write(new char[]{'d', 's', 'a', '我', '你', '他'},1,3);
        fr1.close();
        fr2.close();
        fr3.close();
    }
}
