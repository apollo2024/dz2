package org.example;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException {
        Animal[] animals = new Animal[3];
        animals[0] = new Dog("Шарик", 1, "White");
        animals[1] = new Cat("Мишка", 3, "White");
        animals[2] = new Cat("гав", 5, "White");

        for (Animal animal : animals) {
            Class clazz = animal.getClass();
            Field[] fields = clazz.getDeclaredFields();
            Method[] methods = clazz.getDeclaredMethods();
            System.out.println("Класс объекта: " + clazz.getName());
            System.out.println("Поля обекта:");
            for (Field field : fields) {
                System.out.println(field.getName() + ": " + field.get(animal));
            }
            System.out.println("Доступные методы: ");
            for (Method method : methods) {
                String methodName = method.getName();
                System.out.println(methodName);
                if (methodName == "lunchTime") {
                    method.invoke(animal);
                }
            }

        }

    }
}