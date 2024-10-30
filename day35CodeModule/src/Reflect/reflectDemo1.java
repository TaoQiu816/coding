package Reflect;

public class reflectDemo1 {
    public static void main(String[] args) throws ClassNotFoundException {
        //获取字节码文件class对象的三种方式
        //1.class.forName("全类名");
        //2.类名.class
        //3.对象.getclass();
        //三种方式获取的class对象都是一样的

        //1;
        //全类名：包名+类名
        //最常使用
        Class clazz1 = Class.forName("Reflect.Student");
        System.out.println(clazz1);

        //2.
        //一般更多的是当作参数进行传递，比如synchronized
        Class clazz2 = Student.class;
        System.out.println(clazz2);

        //3.
        //只有创建了这个类的对象时才可以使用
        Student student= new Student();
        Class clazz3 = student.getClass();
        System.out.println(clazz3);

        System.out.println(clazz1==clazz2);
        System.out.println(clazz3==clazz2);

    }
}
