package MapDemo;

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
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     *
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     *
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "Student{name = " + name + ", age = " + age + "}";
    }


    //键存储的是自定义对象，要重写equals和hashconde方法
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

    @Override
    public int compareTo(Student o) {
        //o为红黑树中已有的对象元素
        //this为当前添加的元素

        //返回值:
//负数:表示当前要添加的元素是小的，存左边
//正数:表示当前要添加的元素是大的，存右边
//0:表示当前要添加的元素已经存在，舍弃
        //获取年龄
        int age1 = this.getAge();
        int age2 = o.getAge();
        int i = age1 - age2;

        //首先按照年龄升序排列，年龄相同时按照姓名字母
        //同名同年龄则认为是同一个人
        i = i == 0 ? this.getName().compareTo(o.getName()) : i;
        return i;
    }
}
