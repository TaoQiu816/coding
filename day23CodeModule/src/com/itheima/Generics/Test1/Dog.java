package com.itheima.Generics.Test1;

public abstract class Dog extends Animal {
    public Dog() {
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public String toString() {
        return "Dog{}";
    }

}
