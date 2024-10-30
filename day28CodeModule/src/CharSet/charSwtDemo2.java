package CharSet;

import javax.sound.midi.Soundbank;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class charSwtDemo2 {
    public static void main(String[] args) throws IOException {
        //字符流：字节流+字符集
        //输入流:一次读一个字节，遇到中文时，一次读多个字节
        //输出流:底层会把数据按照指定的编码方式进行编码，变成字节再写到文件中
        //使用场景：对纯文本文件进行操作
        //继承体系：IO流>字符流>Reader  Writer >FileReader  FileWriter

        //public FileReader(File file)创建字符输入流关联本地文件
        //public FileReader(string pathname)创建字符输入流关联本地文件
        //
        //第二步:读取数据
        //public int read()读取数据，读到末尾返回-1
        //public int read(char[] buffer)读取多个数据，读到末尾返回-1
        //
        //
        //第三步:释放资源
        //public void close()释放资源/关流
        //

        //读取
        //创建对象,如果路径对应的文件不存在，会直接报错
        FileReader fr = new FileReader("day28CodeModule\\a.txt");
        ////字符流的底层也是字节流。默认也是一个字节一个字节的读取的。
        ////如果遇到中文就会一次读取多个。GBK一次读两个字节，UTF-8一次读三个字节

        //空参read()读取：
        ////1.read():默认也是一个字节一个字节的读取的,如果遇到中文就会一次读取多个
        ////2.在读取之后，方法的底层还会进行解码并转成十进制。
        //最终把这个十进制作为返回值
        //这个十进制的数据也表示在字符集上的数字
        //英文:文件里面二进制数据 0110 0001
        //read方法进行读取，解码并转成十进制97
        //中文:文件里面的二进制数据 11100110 10110001 10001001
        //read方法进行读取，解码并转成十进制27721
        //// 我想看到中文汉字，就是把这些十进制数据，再进行强转就可以了
       /* int ch;
        while ((ch=fr.read())!=-1){
            System.out.println(ch);
            System.out.println((char) ch);
        }*/
        //有参read(char[] buffer)方法
        //read(chars):读取数据，解码，强转三步合并了，把强转之后的字符放到数组当中
        //相当于空参的read + 强转类型转换
        char[] chars = new char[2];

        int len;
        while ((len= fr.read(chars))!=-1){
            //把数组中的数据变成字符串再进行打印
            //实际读取多少，转换多少，最后一次可能数组装不满
            System.out.println(new String(chars,0,len));
        }

        fr.close();
    }
}
