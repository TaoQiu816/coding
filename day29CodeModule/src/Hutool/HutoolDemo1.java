package Hutool;

import cn.hutool.core.io.FileUtil;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HutoolDemo1 {
    public static void main(String[] args) {
        //Hutool
        //之FileUtil

        //file:根据参数创建一个file对象,可传递可变参数
        //touch:根据参数创建文件，即使父级路径不存在也能创建
        //writeLines:把集合中的数据写出到文件中，盖式。
        //appendLines:把集合中的数据写出到文件中，续写模式。
        //readLines:指定字符编码，把文件中的数据，读到集合中。
        //readutf8Lines:按照UTF-8的形式，把文件中的数据，读到集合中
        //copy:拷贝文件或者文件夹

      /*  //创建file对象
        File file = FileUtil.file("D:\\", "aaa", "bbb", "ccc", "a.txt");//可传递可变参数
        System.out.println(file);

        //创建文件即使父级路径不存在也能创建,并且同时将父级路径进行创建
        File touch = FileUtil.touch(file);
        System.out.println(touch);
*/
        //把集合中的数据写出到文件中，盖式。可自己开启追加模式
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"aaa","bbb","ccc","ddd");
        System.out.println(list);
        File file = FileUtil.writeLines(list, "day29CodeModule\\b.txt", "UTF-8");
        System.out.println(file);

        //续写模式
        FileUtil.appendLines(list,"day29CodeModule\\a.txt","UTF-8");
        //读取,一次读取一行，并且这一行作为集合中的一个元素
        List<String> list1 = FileUtil.readLines("D:\\JAVA_study\\java_study_code\\day29CodeModule\\a.txt", "UTF-8");
        System.out.println(list1);
    }
}
