package com.itheima.polymorphism.demo3;

public class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

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
/*//饲养狗
    public void keepPet(Dog dog, String something) {
        System.out.println("年龄为" + this.age + "岁的" + this.name + "养了一只" + dog.getColor() + "颜色的" + dog.getAge() + "岁的狗；");
        //System.out.println(dog.getAge()+"岁的"+dog.getColor()+"的狗两只前腿死死的抱住"+something+"猛吃");
        dog.eat(something);
    }
//饲养猫
    public void keepPet(Cat cat, String something) {
        System.out.println("年龄为" + this.age + "岁的" + this.name + "养了一只" + cat.getColor() + "颜色的" + cat.getAge() + "岁的猫；");
        //System.out.println(cat.getAge()+"岁的"+cat.getColor()+"的猫眯着眼睛侧着头吃"+something);
        cat.eat(something);
    }*/

    //若要keepPet方法可以接受所有的动物，包括猫狗
    //方法的形参。可以写为这些类的父类animal
    public void keepPet(Animal animal, String something){
        if (animal instanceof Dog dog){
            dog.lookHome();
            System.out.println("年龄为" + age + "岁的" + name + "养了一只" + animal.getColor()+"颜色的"+animal.getAge()+"岁的狗");

            //调用特有方法
            dog.eat(something);
        } else if (animal instanceof  Cat cat) {
            cat.catchMouse();
            System.out.println("年龄为" + age + "岁的" + name + "养了一只" + animal.getColor()+"颜色的"+animal.getAge()+"岁的猫");
            cat.eat(something);
        }



    }
}
