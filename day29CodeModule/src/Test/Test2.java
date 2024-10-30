package Test;

import cn.hutool.core.io.FileUtil;
import cn.hutool.core.util.ReUtil;
import cn.hutool.http.HttpUtil;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Test2 {
    public static void main(String[] args) throws IOException {
        //利用糊涂包的工具完成test1
        //百家姓：https://hanyu.baidu.com/shici/detail?pid=0b2f26d4c0ddb3ee693fdb1137ee1b0d&from=kg0
        //男生名(不带姓氏)：http://www.haoming8.cn/baobao/83651.html
        //女生名(不带姓氏)：http://www.haoming8.cn/baobao/83606.html

        //1.定义变量记录网址
        String familyNameNet = "https://hanyu.baidu.com/shici/detail?pid=0b2f26d4c0ddb3ee693fdb1137ee1b0d&from=kg0";
        String boyNameNet = "http://www.haoming8.cn/baobao/83651.html";
        String girlNameNet = "http://www.haoming8.cn/baobao/83606.html";

        //2.爬取数据，可用糊涂包中的工具类
        //爬取数据,并拼接成字符串
        String familyNameStr = HttpUtil.get(familyNameNet);
        String boyNameStr = HttpUtil.get(boyNameNet);
        String girlNameStr = HttpUtil.get(girlNameNet);

        //3.按照正则表达式获取符合要求的数据
        ArrayList<String> familyNameTempList = (ArrayList<String>) ReUtil.findAll("([\\u4E00-\\u9FA5]{4})(，|。)", familyNameStr, 1);
        ArrayList<String> boyNameTempList = (ArrayList<String>) ReUtil.findAll("(\\d{2}[、])(([\\u4E00-\\u9FA5]{2}[、]){4}[\\u4e00-\\u9fff]{2})", boyNameStr, 2);
        ArrayList<String> girlNameTempList = (ArrayList<String>) ReUtil.findAll("(\\d{2}[、])(([\\u4E00-\\u9FA5]{2}[、]){4}[\\u4e00-\\u9fff]{2})", girlNameStr, 2);



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
       /* BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\JAVA_study\\java_study_code\\day29CodeModule\\info2.txt"));
        for (String s : info) {
            bw.write(s);
            //换行
            bw.newLine();
        }
        bw.close();//必须要关流*/
        //
        //糊涂包的相对路径不是相对于当前目录而言的。是相对于Class而言的
        FileUtil.writeLines(info,"D:\\JAVA_study\\java_study_code\\day29CodeModule\\info2.txt","UTF-8");


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
}
