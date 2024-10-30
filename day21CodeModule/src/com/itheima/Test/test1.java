package com.itheima.Test;

import java.util.Arrays;
import java.util.Comparator;

public class test1 {
    public static void main(String[] args) {
        //定义数组并存储一些女朋友对象，利用Arrays中的sort方法进行排序
        //要求1:属性有姓名、年龄、身高。
        //要求2:按照年龄的大小进行排序，年龄一样，按照身高排序，身高一样按照姓名的字母进行排序。
        //(姓名中不要有中文或特殊字符，会涉及到后面的知识)

        //compareTo(字符串)，字符串比较，如果小于括号中的字符串则返回-1,大于则返回1,相等则返回0*（从前往后依次比较字符的ASCII值）
        System.out.println("b".compareTo("b"));

        //新建对象
        girlFriend gf1 = new girlFriend("zhangsan", 20, 1.65);
        girlFriend gf2 = new girlFriend("lisi", 18, 1.80);
        girlFriend gf3 = new girlFriend("anny", 20, 1.60);
        girlFriend gf4 = new girlFriend("polly", 26, 1.60);
        girlFriend gf5 = new girlFriend("jeffny", 22, 1.70);

        //数组
        girlFriend[] gfArr = {gf1, gf2, gf3, gf4, gf5};

        //排序：先年龄，再身高，再按照姓名字母顺序
        // o1-o2为升序
        Arrays.sort(gfArr,

                (o1, o2) -> {
               /*//年龄不同按年龄排序
                if (o1.getAge()!=o2.getAge()){
                    return o1.getAge()-o2.getAge();
                }
                //到此说明年龄一样，身高不同则按照身高排序
                if (o1.getHeight()!=o2.getHeight()){
                    return o1.getHeight()-o2.getHeight();
                }
                //到此说明年龄身高都一样，按照姓名的字母进行排序
                return o1.getName().compareTo(o2.getName());*/
                    //使用三元运算符简化
                    double temp = o1.getAge() - o2.getAge();
                    temp = temp == 0 ? o1.getHeight() - o2.getHeight() : temp;
                    temp = temp == 0 ? o1.getName().compareTo(o2.getName()) : temp;

                    //temp的值是小数，根据正负返回
                    if (temp>0){
                        return 1;
                    } else if (temp < 0) {
                        return -1;
                    }else {
                        return 0;
                    }

                }
        );

        System.out.println(Arrays.toString(gfArr));
    }
}

//一个文件只能有一个 public 类，并且文件名必须与这个 public 类的名称相同
class girlFriend {
    private String name;
    private int age;
    private double height;

    public girlFriend() {
    }

    public girlFriend(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
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
     * @return height
     */
    public double getHeight() {
        return height;
    }

    /**
     * 设置
     *
     * @param height
     */
    public void setHeight(int height) {
        this.height = height;
    }

    public String toString() {
        return "girlFriend{name = " + name + ", age = " + age + ", height = " + height + "}";
    }
}
