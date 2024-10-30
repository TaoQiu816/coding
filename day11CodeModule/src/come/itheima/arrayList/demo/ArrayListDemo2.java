package come.itheima.arrayList.demo;

import java.util.ArrayList;

public class ArrayListDemo2 {
    public static void main(String[] args) {
        ///集合的基本操作
        /*boolean add(E e)         增

          boolean remove(E e)       删除
          E  remove(int   index)

          E   set(int index,E   element) 改

          E   get(int   index)        查
          int size()                  获取长度
                */
        //创建集合
        ArrayList<String> list = new ArrayList<>();

        //添加元素
        //不管添加什么都可以添加成功，所以一般不管返回值
//        boolean result = list.add("abc");
//        System.out.println(result);
        list.add("abc");
        list.add("def");
        list.add("ghi");
        list.add("xyz");
        list.add("hfue");
        list.add("conbe");
        System.out.println(list);

        //删除元素
        //删除指定元素，返回是否删除成功，在list中没有要删除的元素时返回false
        boolean result1 = list.remove("def");
        System.out.println(result1);
        System.out.println(list);
        System.out.println();
        //删除指定索引位置的元素，返回被删除的元素
        String remove = list.remove(1);
        System.out.println(remove);
        System.out.println(list);
        System.out.println();

        //修改元素
        //将指定索引位置的元素修改成指定元素，返回被覆盖的元素
        String set = list.set(0, "settt");
        System.out.println(set);
        System.out.println(list);
        System.out.println();

        //查找元素
        //获取指定索引位置的元素并返回
        String get = list.get(0);
        System.out.println(get);
        System.out.println(list);
        System.out.println();

        //获取长度
        int size = list.size();
        System.out.println(size);
        //遍历list.fori
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
