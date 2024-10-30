package come.itheima.arrayList.demo;

import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        //1.创建集合的对象
        //泛型：限定集合中存储数据的类型
        //再JDK7以后创建集合对象时，等号右边的尖括号不写也可以
        ArrayList<String> list = new ArrayList<>();
        //此时创建的ArrayList的对象，Arraylist是JAVA已经写好的一个类
        //这个类在底层已经做了一些处理
        //打印对象不是地址值，而是集合中存储的数据内容
        //在展示的时候会用[]把所有的数据进行包裹
        System.out.println(list);
    }
}
