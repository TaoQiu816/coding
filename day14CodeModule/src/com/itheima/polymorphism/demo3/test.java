package com.itheima.polymorphism.demo3;



public class test {
    public static void main(String[] args) {
        Dog d = new Dog(2,"黑");
        Cat c = new Cat(3,"灰");

        Person p1 = new Person("老王",30);
        Person p2 = new Person("老李",25);

        //p1.keepPet(d,"骨头");

        //p2.keepPet(c,"鱼");
        p1.keepPet(d, "骨头");
        p2.keepPet(c, "鱼");
    }
}
