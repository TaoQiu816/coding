package com.itheima.SetDemo;

import java.util.Comparator;
import java.util.Objects;

public class Student implements Comparable<Student> {
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "Student{name = " + name + ", age = " + age + "}";
    }

    //还未重写hashcode方法



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    //实现comparable接口，重写排序方法
    @Override
    public int compareTo(Student o) {
        //指定排序规则
        //只看年龄，按照年龄的升序进行排列
        System.out.println("this:"+this);
        System.out.println("o:"+o);
        System.out.println("====================");
        return this.getAge()-o.getAge();
        /*
        *  this:表示当前要添加的元素
        *  o:表示已经存在的元素（已经在红黑树中）
        * 返回值：
        *    负数：认为要添加的元素是小的，存在左边
        *    正数：认为要添加的元素是大的，存再右边
        *    0：认为要添加的元素已经存在，舍弃*/
    }
}
