package com.itheima.SetDemo;

import java.util.Comparator;

public class StudentSet implements Comparable<StudentSet> {
    private String name;
    private int age;
    private int Chinese;
    private int Math;
    private int English;

    public StudentSet() {
    }

    public StudentSet(String name, int age, int Chinese, int Math, int English) {
        this.name = name;
        this.age = age;
        this.Chinese = Chinese;
        this.Math = Math;
        this.English = English;
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

    /**
     * 获取
     *
     * @return Chinese
     */
    public int getChinese() {
        return Chinese;
    }

    /**
     * 设置
     *
     * @param Chinese
     */
    public void setChinese(int Chinese) {
        this.Chinese = Chinese;
    }

    /**
     * 获取
     *
     * @return Math
     */
    public int getMath() {
        return Math;
    }

    /**
     * 设置
     *
     * @param Math
     */
    public void setMath(int Math) {
        this.Math = Math;
    }

    /**
     * 获取
     *
     * @return English
     */
    public int getEnglish() {
        return English;
    }

    /**
     * 设置
     *
     * @param English
     */
    public void setEnglish(int English) {
        this.English = English;
    }

    //加上总分
    public String toString() {
        return "StudentSet{name = " + name + ", age = " + age + ", Chinese = " + Chinese + ", Math = " + Math + ", English = " + English + ",Sum = " + (Chinese + Math + English)
        +"}";
    }

    @Override
    public int compareTo(StudentSet o) {
        int sum1 = this.getChinese() + this.getMath() + this.getEnglish();
        int sum2 = o.getChinese() + o.getMath() + o.getEnglish();
        int i = sum1 - sum2;
        //总分相同则按照语文成绩来
        i = i == 0 ? this.getChinese() - o.getChinese() : i;
        //语文成绩相同按数学来
        i = i == 0 ? this.getMath() - o.getMath() : i;
        //数学相同按照英语来
        i = i == 0 ? this.getEnglish() - o.getEnglish() : i;
        //英语一样按年龄来
        i = i == 0 ? this.getAge() - o.getAge() : i;//实际上此行可写可不写语文数学和总分一样，英语一定一样
        //年龄一样按照姓名字母来
        //按照字母来直接调用compareTo
        i = i == 0 ? this.getName().compareTo(o.getName()) : i;
        return i;

    }
}
