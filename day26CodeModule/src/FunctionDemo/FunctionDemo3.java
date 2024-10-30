package FunctionDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Predicate;

public class FunctionDemo3 {
    public static void main(String[] args) {
        //引用成员方法
        //格式  对象：：成员方法
        //以前也是通过对象调用

        //其他类：   其他类对象：：方法名
        //本类       this::方法名
        //父类：     super::方法名
        //引用本类和父类的成员方法的前提：引用处不是静态方法

        //集合中有一些名字，按照要求过滤数据
        //数据:"张无忌""周芷若","赵敏","张强”"张三丰·
        //要求:只要以张开头，而且名字是3个字的

        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"张无忌","周芷若","赵敏","张强","张三丰");

        //数据过滤
        //list.stream().filter(s -> s.startsWith("张")).filter(s -> s.length()==3).forEach(s -> System.out.println(s));

        //匿名内部类,Predicate是函数式接口
        list.stream().filter(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.startsWith("张") && s.length()==3;
            }
        }).forEach(s -> System.out.println(s));

        //方法引用，自己写一个同作用的方法
        //引用成员方法要通过对象进行调用
        //new StringOperation()创建对象
        //其他类
       list.stream().filter(new StringOperation()::stringJuge).forEach(s -> System.out.println(s));

        //本类
        //注意：静态方法中没有this也没有super关键字
        //因为 this 代表当前对象的实例，而静态方法属于类而不是类的实例。
        //静态方法可以在没有创建对象的情况下被调用，因此没有上下文来引用 this。
        //list.stream().filter(this::stringJuge).forEach(s -> System.out.println(s));


    }
    public boolean stringJuge(String s){
        return s.startsWith("张") && s.length()==3;
    }

}
