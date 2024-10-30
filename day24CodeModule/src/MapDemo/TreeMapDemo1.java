package MapDemo;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapDemo1 {
    public static void main(String[] args) {
        //TreeMap:

        //TreeMap跟TreeSet底层原理一样，都是红黑树结构的。
        //由键决定特性:不重复、无索引、可排序
        //可排序:对键进行排序。

        //注意:默认按照键的从小到大进行排序，也可以自己规定键的排序规则

        //排序规则代码书写两种排序规则
        //1.实现Comparable接口，指定比较规则。
        //
        //2.创建集合时传递Comparator比较器对象，指定比较规则。
        //两者都写了则以第二种方式为准

        //需求1:
        //键:整数表示id
        //值:字符串表示商品名称
        //要求:按照id的升序排列、按照id的降序排列

        //定义treemap
        TreeMap<Integer,String> tm = new TreeMap<>(new Comparator<Integer>() {

           //o1为当前元素的键
            //o2为红黑树中已有的元素的键
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        //添加元素
        //自定义对象不重新定义排序规则时会报错
        tm.put(9,"薯片");
        tm.put(2,"瓜子");
        tm.put(1,"香蕉");
        tm.put(3,"书");
        tm.put(5,"铅笔");

        //按照id的升序排序,默认对键进行升序排序
        ////Integer Double 默认情况下都是按照升序排列的
        ////string 按照字母再ASCII码表中对应的数字升序进行排列
        //// abcdefg
        //:::
        System.out.println(tm);

        //id降序排序，此时要在创建集合时传递Comparator比较器对象，指定比较规则。


        ///需求2:
        //键:学生对象
        //值:籍贯
        //要求:按照学生年龄的升序排列，年龄一样按照姓名的字母排列，同姓名年龄视为同一个人。

        //学生对象创建
        //创建学生对象
        Student s1 = new Student("zhangsan",23);
        Student s2 = new Student("lisi",22);
        Student s3 = new Student("wangwu",21);
        Student s4 = new Student("zhaoliu",22);
        Student s5 = new Student("qianqi",23);

        //在javabean中实现conparable接口，指定排序方法
        TreeMap<Student,String> tmStu = new TreeMap<>();
        tmStu.put(s1,"陕西");
        tmStu.put(s2,"云南");
        tmStu.put(s3,"辽宁");
        tmStu.put(s4,"四川");
        tmStu.put(s5,"江西");

        System.out.println(tmStu);

    }
}
