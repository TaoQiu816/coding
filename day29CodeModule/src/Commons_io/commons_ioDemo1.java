package Commons_io;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class commons_ioDemo1 {
    public static void main(String[] args) throws IOException {
       /* Fileutils类
            static void copyFile(File srcFile, File destFile)复制文件
            static void copyDirectory(File srcDir, File destDir)复制文件夹
            static void copyDirectoryToDirectory(File srcDir, File destDir)复制文件夹
            static void deleteDirectory(File directory)删除文件夹
            static void cleanDirectory(File directory)清空文件夹
            static string readFileTostring(File file, charset encoding)读取文件中的数据变成成字符申
            static void write(File file, charsequence data, string encoding)写出数据
        IOUtils类
            public static int copy(Inputstream input, outputstream output)复制文件
            public static int copyLarge(Reader input, Writer output)复制大文件
            public static string readLines(Reader input)读取数据
            public static void write(string data, Outputstream output)写出数据
*/
        /*File src = new File("day29CodeModule\\a.txt");
        File dest = new File("day29CodeModule\\copy.txt");
        FileUtils.copyFile(src,dest);//拷贝文件*/


        //拷贝文件夹
        File src = new File("D:\\JAVA_study\\资料\\day29-IO（其他流）\\aaa");
        File dest = new File("D:\\JAVA_study\\资料\\day29-IO（其他流）\\bbb");
        //copyDirectory,将源文件夹中的数据进行拷贝
        FileUtils.copyDirectory(src,dest);
        //copyDirectoryToDirectory,将源文件夹完整的拷贝到目标文件夹中作为子文件夹
        FileUtils.copyDirectoryToDirectory(src,dest);
        //删除文件夹，文件将不再存在
        File file  = new File("D:\\JAVA_study\\资料\\day29-IO（其他流）\\bbb\\aaa");
        FileUtils.deleteDirectory(file);

        //清空文件夹，文件存在，但是数据清空
        FileUtils.cleanDirectory(dest);

    }
}
