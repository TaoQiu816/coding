package MapDemo;

import java.security.Key;
import java.util.Comparator;
import java.util.Map;
import java.util.StringJoiner;
import java.util.TreeMap;
import java.util.function.BiConsumer;

public class TreeMapDemo2 {
    public static void main(String[] args) {
        //统计个数
        //需求:字符串“aababcabcdabcde”
        //请统计字符串中每一个字符出现的次数，并按照以下格式输出
        //输出结果:
        //a(5)b(4)c(3)d(2)e(1)

        //新的统计思想:利用map集合进行统计
        //如果题目中没有要求对结果进行排序，默认使用HashMap
        //如果题目中要求对结果进行排序，请使用TreeMap
        //键:表示要统计的内容
        //值:表示次数


        String str = "aababcabcdabcde";

        //trrmap:可排序
        //重新定义排序规则，通过创建集合时集合时传递Comparator比较器对象，指定比较规则
        TreeMap<Character, Integer> tm = new TreeMap<>();

        //遍历字符串添加键值对（统计）
        for (int i = 0; i < str.length(); i++) {
            //判断当前字符是否已经被统计过
            //若已被统计过，值+1
            char c = str.charAt(i);
            if (tm.containsKey(c)) {
                tm.put(c, tm.get(c) + 1);
            } else {
                //若未被统计过，则添加键值对，值为1
                tm.put(c, 1);
            }
        }
        System.out.println(tm);
        //遍历，并按照指定的格式进行拼接
        //拼接方式1：stringbuilder
        StringBuilder sb = new StringBuilder();
        tm.forEach((key, value) -> sb.append(key).append('(').append(value).append(')').append(" "));
        System.out.println(sb);

        //拼接方式2：stringjoiner.只能添加字符串
        StringJoiner sj = new StringJoiner("","","");
        tm.forEach((key, value) -> sj.add(key+"").add("(").add(value+"").add(")").add(" "));
        System.out.println(sj);


    }
}
