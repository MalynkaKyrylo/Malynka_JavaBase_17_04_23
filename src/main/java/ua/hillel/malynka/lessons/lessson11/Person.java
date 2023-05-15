package ua.hillel.malynka.lessons.lessson11;

public class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(int age) {
        this.age = age;
    }

    public Person() {
    }

    void sayHello() {
        System.out.println(name + " say hello!");
    }

    void printAge() {
        System.out.println("age = " + age);
    }

    void demoNPE() {
        name.toUpperCase();
    }


    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", age=" + age;
    }
}
