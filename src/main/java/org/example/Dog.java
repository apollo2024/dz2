package org.example;

public class Dog extends Animal{
    String name;
    int age;
    String color;

    public Dog(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }
    public void voice(){
        System.out.println("Гаф");
    }
}
