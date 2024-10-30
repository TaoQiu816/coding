package come.itheima.arrayList.test;

import java.util.ArrayList;

public class Test2 {
    public static void main(String[] args) {
        //list要添加基本数据类型时，需要将基本数据类型转换为对应的包装类
        //byte------Byte
        //short------Short
        //特殊：char-------Character
        //特殊：int--------Integer
        //long,float,double,boolean均为首字母大写

        //创建集合
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Character> list1 = new ArrayList<>();
        //添加整数
        //在JDK5之后，int 和Integer之间可以相互转化
        list.add(1);
        list.add(12);
        list.add(123);
        list.add(1234);
        list.add(12345);

        list1.add('a');
        list1.add('b');
        list1.add('c');
        list1.add('d');
        list1.add('e');
        list1.add('f');

        //按指定格式遍历
        System.out.print("[");
        for (int i = 0; i < list.size(); i++) {
            if (i!=list.size()-1){
                System.out.print(list.get(i)+ ",");
            }else {
                System.out.print(list.get(i));
            }
            //System.out.printf("");
            //souf的使用中可以用%s充当字符串占位

        }
        System.out.println("]");

        //按指定格式遍历
        System.out.print("[");
        for (int i = 0; i < list1.size(); i++) {
            if (i!=list1.size()-1){
                System.out.print(list1.get(i)+ ",");
            }else {
                System.out.print(list1.get(i));
            }
            //System.out.printf("");
            //souf的使用中可以用%s充当字符串占位

        }
        System.out.println("]");

    }
}
