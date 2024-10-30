package come.itheima.arrayList.test;

import java.util.ArrayList;

public class Test1 {
    public static void main(String[] args) {
        //集合的遍历方式
        //定义集合，添加字符串，遍历
        ArrayList<String> list = new ArrayList<>();

        //添加元素
        list.add("哈哈哈");
        list.add("啦啦啦");
        list.add("中秋之夜");
        list.add("月圆之时");
        list.add("每逢佳节倍思亲");

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
    }
}
