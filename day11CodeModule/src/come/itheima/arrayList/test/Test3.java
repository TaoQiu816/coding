package come.itheima.arrayList.test;

import java.util.ArrayList;

public class Test3 {
    public static void main(String[] args) {
        //集合添加学生对象，并进行遍历
        ArrayList<Student> list = new ArrayList<>();

        //添加学生对象
        list.add(new Student("张三", 22));
        list.add(new Student("李四", 23));
        list.add(new Student("王五", 27));
        list.add(new Student("赵六", 24));

        //遍历
        for (int i = 0; i < list.size(); i++) {
            //集合元素为学生对象，要再使用方法获取对象属性
            System.out.println(list.get(i).getName() + "," + list.get(i).getAge() + "岁");
        }
    }
}
