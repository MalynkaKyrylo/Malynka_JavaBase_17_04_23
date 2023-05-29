package ua.hillel.malynka.lessons.lesson14.interfaces;

public interface Flyable {
    int DISTANCE = 20;
    void fly();

    default void demoDefaultMethod() {
        System.out.println("demoDefaultMethod");
    }


}
