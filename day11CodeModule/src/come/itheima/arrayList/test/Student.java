package come.itheima.arrayList.test;

public class Student {
    //标准JAVA BEAN类
    //成员属性：学生姓名，年龄
    //私有化成员变量
    private String name;
    private int age;
//空参
    public Student() {
    }
//全参
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
//get和set
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
