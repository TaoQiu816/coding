package Test;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test1 {
    public static void main(String[] args) throws IOException {
        //百家姓：https://hanyu.baidu.com/shici/detail?pid=0b2f26d4c0ddb3ee693fdb1137ee1b0d&from=kg0
        //男生名(不带姓氏)：http://www.haoming8.cn/baobao/83651.html
        //女生名(不带姓氏)：http://www.haoming8.cn/baobao/83606.html

        //1.定义变量记录网址
        String familyNameNet = "https://hanyu.baidu.com/shici/detail?pid=0b2f26d4c0ddb3ee693fdb1137ee1b0d&from=kg0";
        String boyNameNet = "http://www.haoming8.cn/baobao/83651.html";
        String girlNameNet = "http://www.haoming8.cn/baobao/83606.html";

        //2.爬取数据，把网址上所有的数据拼接成一个字符串
        String familyName = webCrawler(familyNameNet);
       // System.out.println(familyName);
        String boyName = webCrawler(boyNameNet);
        //System.out.println(boyName);
        String girlName = webCrawler(girlNameNet);
       // System.out.println(girlName);

        //3.通过正则表达式把符合要求的数据获取出来
        //姓氏：任意汉字、每行有逗号，句号,并且四个姓氏为一组，后面跟逗号或者句号
        ArrayList<String> familyNameTempList = getData(familyName, "([\\u4E00-\\u9FA5]{4})(，|。)", 1);//0获取完整数据，组号从1开始
        System.out.println(familyNameTempList);
        //名字：两位数字+顿号+两个字+顿号出现4次+两个汉字
        //第一组：两位数字+顿号
        //第二组：四个名字，中间用顿号链接
        ///^(?:[\u4e00-\u9fa5·]{2,16})$/
        ArrayList<String> boyNameTempList = getData(boyName, "(\\d{2}[、])(([\\u4E00-\\u9FA5]{2}[、]){4}[\\u4e00-\\u9fff]{2})", 2);//0获取完整数据，组号从1开始
        ArrayList<String> girlNameTempList = getData(girlName, "(\\d{2}[、])(([\\u4E00-\\u9FA5]{2}[、]){4}[\\u4e00-\\u9fff]{2})", 2);//0获取完整数据，组号从1开始
        System.out.println(boyNameTempList);
        System.out.println(girlNameTempList);

        //4.处理数据，将需要的数据拆分开，并添加到新的集合中
        //姓氏：何吕施张拆分开
        ArrayList<String> familyNameList = new ArrayList<>();
        for (String s : familyNameTempList) {
            //每个位置是一个长度为四的字符串，获取字符串的每个索引的字符即可,但注意获取的是字符
            for (int i = 0; i < s.length(); i++) {
                familyNameList.add(s.charAt(i)+"");
            }
        }
        System.out.println(familyNameList);
        //男生名字：泓权、益霖、蓉人、楚冰、璟懿，五个一组，并且以顿号分割
        ArrayList<String> boyNameList = new ArrayList<>();
        for (String s : boyNameTempList) {
            String[] arr = s.split("、");
            for (String string : arr) {
                //将拆分后的每个元素添加到集合(保证不重复)
                //如果不重复就添加
                if (boyNameList.contains(string)) {
                    //如果重复就进入下个循环
                    continue;
                }
                boyNameList.add(string);
            }
        }
        System.out.println(boyNameList);

        //女生名字：泓权、益霖、蓉人、楚冰、璟懿，五个一组，并且以顿号分割
        ArrayList<String> girlNameList = new ArrayList<>();
        for (String s : girlNameTempList) {
            String[] arr = s.split("、");
            for (String string : arr) {
                //将拆分后的每个元素添加到集合(保证不重复)
                //如果不重复就添加
                if (girlNameList.contains(string)) {
                    //如果重复就进入下个循环
                    continue;
                }
                girlNameList.add(string);
            }
        }
        System.out.println(girlNameList);

        //5.生成数据
        //姓名（唯一）-性别-年龄
        ArrayList<String> info = getInfo(familyNameList, boyNameList, girlNameList, 70, 30);
        //打乱数据
        Collections.shuffle(info);
        System.out.println(info);
        //6.将生成的数据写到本地文件中
        BufferedWriter bw = new BufferedWriter(new FileWriter("day29CodeModule\\info.txt"));
        for (String s : info) {
            bw.write(s);
            //换行
            bw.newLine();
        }
        bw.close();//必须要关流




    }
    /*作用：根据正则表达式获取字符串中符合要求的数据
     * 参数一：字符串
     * 参数二：正则表达式
     * 参数三：组号，获取正则表达式中的第几组数据（按照左括号分组
     *           0是获取完整数据
     * 返回值：arraylist*/

    /*
    作用：根据爬取到的符合要求的数据生成新数据
    参数一：姓氏集合
    参数二：男生名字集合
    参数三：女生名字集合
    参数四：男生个数
    参数五：女生个数
    返回值：生成的字符串集合
    */

    public static ArrayList<String> getInfo(ArrayList<String> familyName,ArrayList<String> boyName,ArrayList<String> girlName,int boyCount,int girlCount){

        //利用hashSet生成元素不重复的集合
        HashSet<String> boyhs = new HashSet<>();
        while (true){
            //如果生成的男生姓名够了就终止循环(hashset的长度等于boycount时)
            if (boyhs.size()==boyCount){
                break;
            }
            //名字不够继续生成
            //打乱姓氏和名字的集合,获取第一个元素，相当于随机拼接名字
            Collections.shuffle(familyName);
            Collections.shuffle(boyName);
            boyhs.add(familyName.get(0)+boyName.get(0));
        }
        //女生名字同理
        //利用hashSet生成元素不重复的集合
        HashSet<String> girlhs = new HashSet<>();
        while (true){
            //如果生成的女生姓名够了就终止循环(hashset的长度等于boycount时)
            if (girlhs.size()==girlCount){
                break;
            }
            //名字不够继续生成
            //打乱姓氏和名字的集合,获取第一个元素，相当于随机拼接名字
            Collections.shuffle(familyName);
            Collections.shuffle(girlName);
            girlhs.add(familyName.get(0)+girlName.get(0));
        }

        //存储最终信息
        ArrayList<String> list = new ArrayList<>();
        //生成男生的最终信息
        //年龄18-27
        Random r = new Random();
        for (String boyname : boyhs) {
            int age = r.nextInt(10)+18;
            list.add(boyname+"-男-"+age);
        }
        //生成女生的最终信息
        //年龄18-25
        for (String girlname : girlhs) {
            int age = r.nextInt(8)+18;
            list.add(girlname +"-女-"+age);
        }

        return list;

    }

    private static ArrayList<String> getData(String str, String regex, int group) {
        //1.创建集合存放数据
        ArrayList<String> list = new ArrayList<>();
        //2.按照正则表达式的规则获取符合要求的数据
        Pattern pattern = Pattern.compile(regex);//创建正则表达式对象
        Matcher matcher = pattern.matcher(str);//按照pattern的规则，到str中获取数据
        while (matcher.find()) {
            //获取到的数据
            //String s = matcher.group(group);
            //不需要其中的标点符号，去掉数据红的标点符号
            list.add(matcher.group(group));

            //System.out.println(matcher.group(group));
        }
        return list;
    }

    /*
     * 作用：从网络中爬取数据，并把数据拼接成字符串返回
     * 参数：网址
     * 返回值：
     * 爬取到的所有数据*/
    public static String webCrawler(String net) throws IOException {
        //1.定义stringbuilder拼接爬取到的所有数据
        StringBuilder sb = new StringBuilder();
        //2.创建url对象
        URL url = new URL(net);
        //3.连接上这个网址
        //细节：保证网络是畅通的，并且网址是可以连接上的
        URLConnection urlConnection = url.openConnection();
        //4.读取数据
        //创建输入流，由于网站有中文，要使用转换流转换为字节流

        InputStreamReader isr = new InputStreamReader(urlConnection.getInputStream());
        int ch;
        while ((ch = isr.read()) != -1) {
            sb.append((char) ch);
        }

        return sb.toString();
    }
}
