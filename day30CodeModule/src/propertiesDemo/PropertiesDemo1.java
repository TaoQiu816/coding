package propertiesDemo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo1 {
    public static void main(String[] args) throws IOException {
        //properties是map集合的一种
        //properties是一个双列集合集合，拥有Map集合所有的特点。
        //重点:有一些特有的方法，可以把集合中的数据，按照键值对的形式写到配置文件当中，配置文件后缀为properties
        //也可以把配置文件中的数据，读取到集合中来，
        //没有泛型，可以添加任意类型的数据，但一般化石添加字符串类型

        //创建集合对象
        Properties prop = new Properties();

        //添加数据

        prop.put("aaa","123");
        prop.put("bbb","321");
        prop.put("ccc","523");
        prop.put("ddd","123");
        prop.put("eee","123");

        //打印
        System.out.println(prop);

        //写入文件，特有方法
        //第一个参数是输出流，要关闭
        //第二个参数为注释
        FileOutputStream fos = new FileOutputStream("day30CodeModule\\a.properties");
        prop.store(fos,"test");
        fos.close();

        //读取文件
        Properties prop1 = new Properties();
        FileInputStream fis = new FileInputStream("day30CodeModule\\a.properties");
        prop1.load(fis);//读取键值对并存放在集合中
        fis.close();
        System.out.println(prop1);

    }
}
