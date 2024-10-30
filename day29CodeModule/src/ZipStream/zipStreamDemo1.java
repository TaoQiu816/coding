package ZipStream;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class zipStreamDemo1 {
    public static void main(String[] args) throws IOException {
        //文件夹的压缩
        //压缩本质:把每一个(文件/文件夹)看成ZipEntry对象放到压缩包中
        //zipentry对象的参数：表示文件或文件夹在压缩包中的路径
        //D:\JAVA_study\资料\day29-IO（其他流）\aaa

        //数据源：要压缩的文件
        File src = new File("D:\\JAVA_study\\资料\\day29-IO（其他流）\\aaa");
        //压缩包的存储位置的父级路径。与数据源的父级路径相同(要将压缩包放在哪里)
        File destParent = new File(src.getParent());
        //压缩包的实际存储位置是：父级路径+文件夹名字+zip（压缩包路径）
        File dest = new File(destParent,src.getName()+".zip");
        System.out.println(dest);
        //压缩流对象关联压缩包
        ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(dest));

        System.out.println(src.getName());
        //调用压缩包方法
        toZip(src,zos,src.getName());

        //释放资源
        zos.close();
    }

    /*
    * 作用：创建压缩包
    * 参数一：数据源文件夹
    * 参数二：关联压缩包的压缩流对象
    * 参数三：(压缩包内部的路径)当前所在文件夹名字(下面获取的文件或者文件夹都是在这个路径之下的)，
    *         用于在压缩包中创建相同且对应的entry对象
    * */
    public static void toZip(File src,ZipOutputStream zos,String name) throws IOException {
        //进入数据源
        File[] files = src.listFiles();
        //获取数据源内的每个文件或者文件夹
        for (File file : files) {
            //判断是文件夹还是文件
            if (file.isFile()){
                //如果当前file是文件，那么直接变成entry对象放入压缩包中
                //并且将原文件的数据读取放入entry对象

                //创建entry对象(参数为：文件或文件夹在压缩包中的位置)
                ZipEntry entry = new ZipEntry(name+"\\"+file.getName());
                //将entry对象放入压缩包
                zos.putNextEntry(entry);
                //读取当前文件数据，将文件数据写入压缩包
                FileInputStream fis = new FileInputStream(file);
                int b;
                while ((b=fis.read())!=-1){
                    zos.write(b);
                }
                fis.close();
                zos.closeEntry();//表示当前文件处理完毕
            }else {
                //如果是文件夹，递归调用,此时所在的文件夹是file
                toZip(file,zos,name+"\\"+file.getName());
            }
        }
    }
}
