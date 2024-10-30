package FunctionDemo;

public class Student {
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    //新增构造方法
    //构造方法的没有返回值也不用管，因为构造方法调用完成时，对象已经创建好了
    //只需保证构造方法生成的对象与抽象方法的返回值一致，以及形参相同即可
    public Student(String string){
        this.name=string.split(",")[0];
        this.age=Integer.parseInt(string.split(",")[1]);
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
}
