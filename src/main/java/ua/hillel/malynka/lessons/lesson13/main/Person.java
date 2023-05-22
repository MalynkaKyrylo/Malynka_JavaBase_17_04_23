package ua.hillel.malynka.lessons.lesson13.main;

public class Person {

    static String name;
    int age;
    String lastName;

    public Person(int age, String lastName) {
        this.age = age;
        this.lastName = lastName;
    }

    static void staticMethod() {
        System.out.println("Person do something");
    }

    void nonStaticMethod() {
        System.out.println("Person do something");
    }
}