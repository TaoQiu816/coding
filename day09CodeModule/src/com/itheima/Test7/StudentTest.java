package com.itheima.Test7;

import java.util.Scanner;

public class StudentTest {
    public static void main(String[] args) {
        //要求1：再次添加一个学生对象，并在添加的时候进行学号的唯一性判断。
        //
        //要求2：添加完毕之后，遍历所有学生信息。
        //
        //要求3：通过id删除学生信息
        //
        //​             如果存在，则删除，如果不存在，则提示删除失败。
        //
        //要求4：删除完毕之后，遍历所有学生信息。
        //
        //要求5：查询数组id为“heima002”的学生，如果存在，则将他的年龄+1岁
        //创建数组
        Student[] arr = new Student[3];
        //创建学生对象并添加到数组当中
        Student stu1 = new Student(001, "张三", 22);
        Student stu2 = new Student(002, "李四", 24);
        Student stu3 = new Student(003, "王五", 26);

        arr[0] = stu1;
        arr[1] = stu2;
        arr[2] = stu3;

        //再次添加一个学生对象，并在添加的时候进行学号的唯一性判断。
        //首先创建学生对象
        Student stu4 = new Student(004, "赵六", 25);
        //判断学号唯一性，若不唯一，则不用添加
        //若唯一，则添加
        //添加新对象时，若数组未满，则直接添加，若数组已满，则创建新数组，
        //新数组长度比原数组长度多1
        int count;
        if (contains(stu4.getId(), arr)){
            //若重复，则不添加
            System.out.println("学号重复");
        }else {
            //未重复，添加对象进数组
            //判断原数组是否已满
            count = getCount(arr);
            if (count == arr.length){
                //创建新数组
                Student[] newArr = creatNewArr(arr);
                //存放新数据
                newArr[count] = stu4;
                printArr(newArr);
                //要求2：添加完毕之后，遍历所有学生信息。
                //此时要判断新添加的学生对象存放在那个数组中，则遍历哪个数组,直接在添加数据后打印
            }else {
                //数组未满，直接存储
                //getcount获取的数字为n，首先表示数组中已经有n个元素
                //还有一层意思，也就是索引0~n-1有元素，索引n没有
                //也就是下一次添加数据，添加到索引为n的地方
                arr[count] = stu4;
                printArr(arr);
                //要求2：添加完毕之后，遍历所有学生信息。
                //此时要判断新添加的学生对象存放在那个数组中，则遍历哪个数组,直接在添加数据后打印

            }
        }

        ////要求3：通过id删除学生信息
        System.out.println("请输入要删除的学生id");
        Scanner sc = new Scanner(System.in);
        int deleteId = sc.nextInt();
        //id如果存在，则删除对应索引的元素，如果不存在，则提示删除失败。
        //因此需要获取索引,并根据索引决定删除还是错误提醒
        int index = getIndex(deleteId, arr);
        if (index < 0){
            //索引不存在，输出错误信息
            System.out.println("学号错误，删除失败");
        }else{
            //索引存在，则将该索引上的元素置为null（数组元素存储的是对象的地址值）
            arr[index] = null;
            //删除完毕之后，遍历所有学生信息。
            printArr(arr);
        }

        ////要求5：查询数组id为“heima002”的学生，如果存在，则将他的年龄+1岁
        int index1 = getIndex(002,arr);
        //判断索引
        if (index1 < 0){
            System.out.println("id不存在，修改失败");
        }else {
            //年龄+1
            Student stu = arr[index1];
            int newAge = stu.getAge()+1;
            stu.setAge(newAge);
            printArr(arr);
        }





    }

    //打印数组信息
    public static void printArr(Student[] arr){
        for (int i = 0; i < arr.length; i++) {
            //数组元素非空才打印
            if (arr[i] != null){
                System.out.println("学号：" + arr[i].getId() + ",姓名：" + arr[i].getName() +
                        ",年龄：" + arr[i].getAge());
            }

        }
    }

    //创建一个新的数组，数度长度为老数组长度+1，并把老数组元素拷贝到新数组
    private static Student[] creatNewArr(Student[] arr) {
        //数组已满,创建长度+1的新数组
        Student[] newArr = new Student[arr.length + 1];
        //存放原有数据
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        return newArr;
    }

    //唯一性判断，判断学号在学生对象数组中是否已经存在
    public static boolean contains(int id, Student[] arr){
        for (int i = 0; i < arr.length; i++) {
            //判断元素是否非空，若存在学生对象，即非空，则获取其id
            if (arr[i] != null){
                if (id == arr[i].getId()){
                    return true;
                    //不唯一，已存在，返回true
                }
            }
            //注意，若元素为空null，则不要再getId,否则会报错，因为null.get时错误的

        }
        return false;
    }
    //定义方法，判断数组中已经存了几个元素
    public static int getCount(Student[] arr){
        //数组动态初始化，若对应位置没有元素，则数组元素未null
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null){
                //若元素非空，则已经存放有元素
                count++;
            }
        }
        return count;
    }

    //获取id在对象数组中的索引
    public static int getIndex(int id, Student[] arr){
       // int index;
        for (int i = 0; i < arr.length; i++) {
            //先获取数组中的每个对象
            Student stu = arr[i];
            //对对象进行非空判断
            if (stu!=null){
                //如果非空，获取id并判断是否id存在
                if (stu.getId()==id){
                    //如果id存在，则返回当前索引
                    return i;
                    //如果不在当前索引，则直接进入下一循环
                }
            }
        }
        //若循环结束还未找到id，则返回不存在的索引-1
        return -1;
    }

}
