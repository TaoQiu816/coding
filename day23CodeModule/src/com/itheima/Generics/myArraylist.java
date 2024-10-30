package com.itheima.Generics;


import java.util.Arrays;

//泛型类
/*
* 当在编写一个类的时候，如果不能确定类型，那么这个类就可以定义为泛型类
* */
public class myArraylist<E> {
    Object[] obj =new Object[10];
    int size;

    /*
    * E:表示不确定的类型，该类型在类名后面已经定义过了
    * e:形参的名字，变量名
    * */
    public boolean add(E e){
        obj[size]=e;
        size++;
        return true;
    }

    public E get(int index){
        //要进行类型转换为（与泛型底层一样，处理时当作object，获取是仍是泛型）
        return (E) obj[index];
    }

    @Override
    public String toString() {
        //将数组拼接成字符串
        return Arrays.toString(obj);
    }
}
