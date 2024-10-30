package com.itheima.regexDemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regexDemo5 {
    public static void main(String[] args) throws IOException {
        //爬取网络中的数据


        //创建URL对象，可以理解为网址对象
        URL url = new URL("https://blog.csdn.net/qq_35917800/article/details/78420278");
        //连接上网址
        //细节：需要保证网络是畅通的
        URLConnection urlConnection = url.openConnection();
        //创建一个对象取读取网络中的数据
        BufferedReader br = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
        String line;

        //获取正确表达式的对象pattern
        String regex = "\\w{5,10}.数量词";
        Pattern p = Pattern.compile(regex);
       // Matcher m = p.matcher();

        //在读取的时候每次读取一整行
        while ((line=br.readLine())!=null){
            //System.out.println(line);
            //拿着文本匹配器的对象matcher按照pattern的规则取读取当前的这一行信息
            Matcher m = p.matcher(line);
            while (m.find()){
                System.out.println(m.group());
            }
        }
        br.close();
    }




}
