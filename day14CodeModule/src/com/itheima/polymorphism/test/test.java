package com.itheima.polymorphism.test;

//导其他包中的类
import com.itheima.polymorphism.domain.Student;
import com.itheima.polymorphism.domain.Teacher;

public class test {
    public static void main(String[] args) {
       /* //1.使用同一个包中的类不需要导包
        Student s = new Student("张三", 23);

        System.out.println(s.getName()+","+s.getAge());
*/
        /*//2.使用java.lang包中的类时，不需要导包
        String s = "abc";
        System.out.println(s);*/

        //使用其他包的类
        Teacher t = new Teacher("张三",65);

        Student stu1 = new Student("lisi",24,"uestc");
        com.itheima.polymorphism.test.Student stu2 = new com.itheima.polymorphism.test.Student("wangwu",22);


    }
}
