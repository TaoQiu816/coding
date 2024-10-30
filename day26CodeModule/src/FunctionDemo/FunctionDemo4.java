package FunctionDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionDemo4 {
    public static void main(String[] args) {
        //y引用构造方法
        //目的：创建这个类的对象
        //格式  类名：：new

        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"张无忌,15","周芷若,14","赵敏,13","张强,20","张三丰,100","张翠山,40","张良,35","王二麻子,37");

        //构成student对象并添加到list集合中
        //匿名内部类
        /*list.stream().map(new Function<String, Student>() {
            @Override
            public Student apply(String s) {
                String name = s.split(",")[0];
                int age = Integer.parseInt(s.split(",")[1]);
                return new Student(name,age);

            }
        });*/

        //调用新建的构造方法
        List<Student> newlist = list.stream().map(Student::new).collect(Collectors.toList());
        System.out.println(newlist);

    }
}
