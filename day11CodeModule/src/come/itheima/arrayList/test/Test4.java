package come.itheima.arrayList.test;

import java.util.ArrayList;
import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        //学生对象的数据来自键盘输入
        //集合添加学生对象，并进行遍历
        ArrayList<Student> list = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        //添加学生信息并存入集合
        for (int i = 0; i < 4; i++) {
            System.out.println("请输入学生姓名");
            String name = sc.next();
            System.out.println("请输入学生年龄");
            int  age = sc.nextInt();

            Student stu = new Student(name,age);
            //学生对象的创建必须再循环内部
            //因为每个学生的属性不同，是不同的对象
            //若放在循环外面，只会创建一个学生对象，那么所有集合元素所存储的都是一个相同的对象的地址
            list.add(stu);


        }

        //遍历
        //遍历
        for (int i = 0; i < list.size(); i++) {
            //集合元素为学生对象，要再使用方法获取对象属性
            System.out.println(list.get(i).getName() + "," + list.get(i).getAge() + "岁");
        }
    }
}
