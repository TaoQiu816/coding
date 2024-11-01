package Reflect;

import java.lang.reflect.Constructor;

public class reflectDemo2 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException {
        //利用反射获取构造方法
        //Class类中用于获取构造方法的方法
        //Constructor<?>[]getConstructors():返回所有公共构造方法对象的数组
        //Constructor<?>[]getDeclaredConstructors():返回所有构造方法对象的数组
        //Constructor<T> getConstructor(Class<?>... parameterTypes): 返ə回单个公共构造方法对象
        //Constructor<T> getDeclaredConstructor(Class<?>... parameterTypes):返回单个构造方法对象
        //Constructor类中用于创建对象的方法
        //T newlnstance(Object...initargs):根据指定的构造方法创建对象
        //setAccessible(boolean flag):设置为true,表示取消访问检查


        //注意：构造方法在字节码文件中，所以仍然要先获得字节码文件

        //获得字节码文件对象
        Class<?> clazz = Class.forName("Reflect.Student");

        //获取所有公共的构造方法,并返回数组
        Constructor[] con1 = clazz.getConstructors();
        for (Constructor<?> con : con1) {
            System.out.println(con);
        }

        //获取所有构造方法，包括私有
        Constructor[] con2 = clazz.getDeclaredConstructors();
        for (Constructor<?> con : con2) {
            System.out.println(con);
        }

        //获取单个的构造方法，参数为class类型，并且要与形参对应
        Constructor con3 = clazz.getConstructor();
        System.out.println(con3);

        Constructor con4 = clazz.getDeclaredConstructor(String.class, int.class);
        System.out.println(con4);
    }
}
