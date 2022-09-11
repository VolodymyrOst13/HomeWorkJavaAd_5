package task4;

import java.util.Arrays;

public class Main {

    public static void analyzeClass(Object o){
        Class clazz = o.getClass();
        System.out.println("Name of class: " + clazz);
        System.out.println("Field of class: " + Arrays.toString(clazz.getDeclaredFields()));
        System.out.println("Родительский класс: " + clazz.getSuperclass());
        System.out.println("Методы класса: " +  Arrays.toString(clazz.getDeclaredMethods()));
        System.out.println("Конструкторы класса: " + Arrays.toString(clazz.getConstructors()));
    }
    public static void main(String[] args) {
        analyzeClass(new Cat("Barsik", 5, true));

    }
}
