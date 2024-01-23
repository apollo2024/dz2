package org.example;

public class Cat extends Animal {
    String name;
    int age;
    String color;

    public Cat(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }
    public void lunchTime(){
        System.out.println("Кушааать");
    }
}
