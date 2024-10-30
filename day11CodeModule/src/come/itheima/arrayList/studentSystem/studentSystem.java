package come.itheima.arrayList.studentSystem;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class studentSystem {

    //静态方法只能使用静态变量
    private static final String ADD_STUDENT = "1";
    private static final String DELETE_STUDENT = "2";
    private static final String UPDATE_STUDENT = "3";
    private static final String QUERY_STUDENT = "4";
    private static final String EXIT = "5";


    public static void startStudentSystem() {


        //集合存储学生信息
        ArrayList<Student> listStudent = new ArrayList<>();


        Scanner sc = new Scanner(System.in);


        //语句标号loop
        loop2:
        while (true) {
            //处于循环之中可以一直操作
            //初始界面
            System.out.println("--------------------欢迎来到学生管理系统--------------------");
            System.out.println("1.添加学生");
            System.out.println("2.删除学生");
            System.out.println("3.修改学生");
            System.out.println("4.查询学生");
            System.out.println("5.退出");
            System.out.println("请输入您的选择：");

            //输入选择
            String choose = sc.next();


            //根据选择跳转功能
            switch (choose) {
                case ADD_STUDENT -> addStudent(listStudent);
                case DELETE_STUDENT -> deleteStudent(listStudent);
                case UPDATE_STUDENT -> updateStudent(listStudent);
                case QUERY_STUDENT -> queryStudent(listStudent);
                case EXIT -> {
                    System.out.println("退出");//退出
                    break loop2;
                    //若只写break,会只退出switch语句，而无法跳出while循环
                    //方法1.利用语句标号break,将while循环语句标号（标号名称自定义）
                    //方法2.终止虚拟机运行
                    //System.exit(0);
                }
                default -> System.out.println("您输入的选择有误，请重新输入");//选择错误

            }
        }


    }

    //添加学生
    public static void addStudent(ArrayList<Student> list) {
        System.out.println("添加学生");
        Scanner sc = new Scanner(System.in);

        String id = null;


        while (true) {
            System.out.println("请输入学生id:");
            id = sc.next();
            //检查id是否唯一,返回boolean
            //若能唯一则终止输入并提示后返回
            if (contains(id, list)) {
                System.out.println("学号重复，请重新录入");
                //原本学生信息list不变返回
                //return list;
            } else {
                //学号未重复，继续录入其他信息
                break;
            }
        }

        //执行到此说明学号未重复，继续输入
        System.out.println("请输入学生姓名:");
        String name = sc.next();
        System.out.println("请输入学生年龄:");
        int age = sc.nextInt();
        System.out.println("请输入学生家庭住址:");
        String adress = sc.next();

        //添加到学生对象中
        Student stu = new Student(id, name, age, adress);
        //将对象添加进学生信息集合
        list.add(stu);
        //提示添加成功
        System.out.println("添加成功");
        //返回添加后的学生信息集合
        //return list;
    }

    //删除学生
    public static void deleteStudent(ArrayList<Student> list) {
        System.out.println("删除学生");
        System.out.println("请输入要删除的学生id");
        Scanner sc = new Scanner(System.in);
        String id = sc.next();
        int index = getIndex(id, list);
        //检查id是否存在，
        if (index >= 0) {
            //索引非负则存在，则删除相应索引的学生信息
            list.remove(index);
            System.out.println("删除id为" + id + "的学生信息成功");
        } else {
            //输入的id不存在
            System.out.println("您输入的学生id不存在，删除失败");
        }

        //return list;
    }

    //修改学生
    public static void updateStudent(ArrayList<Student> list) {
        System.out.println("修改学生信息");
        System.out.println("请输入要修改的学生id");
        Scanner sc = new Scanner(System.in);
        String id = sc.next();

        int index = getIndex(id, list);
        //检查id是否存在
        if (index == -1) {
            //索引不存在，则提示，并返回主菜单
            System.out.println("您输入的学生id不存在");
            //结束方法，返回主菜单
            return;
        }


        //执行到此说明id存在
        //继续录入其他信息并修改
        System.out.println("请输入修改后的学生姓名:");
        String newName = sc.next();
        list.get(index).setName(newName);
        System.out.println("请输入修改后的学生年龄:");
        int newAge = sc.nextInt();
        list.get(index).setAge(newAge);
        System.out.println("请输入修改后的学生家庭住址:");
        String newAdress = sc.next();
        list.get(index).setAdress(newAdress);

        //成功提示
        System.out.println("学生信息修改成功");


    }

    //查询
    public static void queryStudent(ArrayList<Student> list) {
        System.out.println("查询学生信息");
        //如果没有学生信息，则提示并返回
        if (list.size() == 0) {
            System.out.println("当前无学生信息，请添加后再查询");
            //结束方法
            return;
        }
        //执行到此说明有信息
        //有学生信息，则对齐打印输出
        //制表符补齐与前面的内容有关，补齐8个字符或者8的倍数
        System.out.println("id\t\t姓名\t年龄\t家庭住址");
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println(stu.getId() + "\t" + stu.getName() + "\t" + stu.getAge() + "\t" + stu.getAdress());

        }
    }

    //检查id是否已经存在，即是否唯一
    //返回true为唯一
    public static boolean contains(String id, ArrayList<Student> list) {
        //直接调用getIndex,根据返回值判断是否id已存在
        /*if (getIndex(id, list) >= 0) {
            //索引非负则存在
            return true;
        } else {
            //索引为-1则id不存在
            return false;
        }*/
        return getIndex(id, list) >= 0;
    }

    //通过id获取学生对象索引
    public static int getIndex(String id, ArrayList<Student> list) {
        //遍历list中的每个对象元素
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId().equals(id)) {
                //System.out.println(true);
                return i;
            }
        }
        //System.out.println(false);
        return -1;
    }


}
