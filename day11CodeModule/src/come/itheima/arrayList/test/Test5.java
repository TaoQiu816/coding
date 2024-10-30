package come.itheima.arrayList.test;

import java.util.ArrayList;
import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        //集合存入三个用户对象
        //定义一个方法，根据id查找对应的用户信息，存在则返回true

        //创建集合对象
        ArrayList<User> list = new ArrayList<>();

        //存入三个用户对象
        list.add(new User("uestc001", "zhangsan", "123456"));
        list.add(new User("uestc002", "lisi", "321456"));
        list.add(new User("uestc002", "wangwu", "865478"));

        /*//遍历
        for (int i = 0; i < list.size(); i++) {
            //集合元素为学生对象，要再使用方法获取对象属性
            System.out.println(list.get(i).getId() + "," + list.get(i).getUserName() + "," + list.get(i).getPassWord());
        }*/
        Scanner sc = new Scanner(System.in);
        System.out.println("输入要查找的id");
        String id = sc.next();
        System.out.println(contains(id, list));

    }

    //根据id查找对应用户信息
    //参考下一个返回索引的方法，可根据返回的索引直接返回true或者false
    public static boolean contains(String id, ArrayList<User> list) {

        /*//遍历查找
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId().equals(id)) {
                //字符串的对比用equls
                return true;
            }
        }
        //循环结束表示所有的元素都不符合
        return false;*/

        return getIndex(id, list) >= 0;
    }

    //查找并返回索引
    public static int getIndex(String id, ArrayList<User> list) {
        //遍历查找
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId().equals(id)) {
                //字符串的对比用equls
                return i;
            }
        }
        //循环结束表示所有的元素都不符合
        return -1;
    }
}
