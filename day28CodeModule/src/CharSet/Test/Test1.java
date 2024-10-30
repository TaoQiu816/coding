package CharSet.Test;

import java.io.*;

public class Test1 {
    public static void main(String[] args) throws IOException {
        //拷贝文件夹，并且考虑子文件夹
        //"D:\\JAVA_study\\资料\\day28-IO（字节流&字符流）\\笔记"

        //源文件夹
        File src = new File("D:\\aaa");
        //目的文件夹
        File dest = new File("D:\\copy");

        //调用自定义方法拷贝文件夹
        copyDir(src,dest);
    }

    private static void copyDir(File src, File dest) throws IOException {
        //递归套路
        //进入数据源，获取数据源的所有内容，获取数组
        //遍历数组
        //判断文件，如果是文件，直接拷贝
        //判断文件夹，如果是文件夹，递归调用

        //创建文件夹
        //原因：FileOutputStream只会创建文件而不会创建文件夹
        //要在写入文件之前，确保目标路径的所有父目录已经创建。
        //如果写入的文件的父级路径不存在，会出现异常
        dest.mkdirs();


        File[] files = src.listFiles();
        for (File file : files) {
            //判断文件
            if (file.isFile()){
                //如果是文件，直接拷贝
                //细节：拷贝是从文件开始，文件结束，要创建新的文件并且同名
                //字节流读取源文件(当前循环的文件)
                FileInputStream fis =  new FileInputStream(file);
                //字节流写出到目的文件(目的文件夹中相同位置的同名文件)
                FileOutputStream fos = new FileOutputStream(new File(dest,file.getName()));
                int len;
                byte[] bytes = new  byte[1024];
                while ((len=fis.read(bytes))!=-1){
                    fos.write(bytes,0,len);
                    //最终还是拷贝每个文件，出口也在拷贝文件的代码处
                    //因此在这里释放资源

                }
                fos.close();
                fis.close();
            }else {
                //如果是文件夹，递归调用,并拷贝子文件夹.目的地子文件夹为当前文件夹(父级路径)+当前要拷贝的文件夹名字
                copyDir(file,new File(dest,file.getName()));
            }
        }
    }


}
