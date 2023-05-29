package ua.hillel.malynka.lessons.lesson14.interfaces;

public interface FlyableAndRunnableChild extends Flyable, Runnable{
    @Override
    void fly();

    @Override
    void run();

    @Override
    default void demoDefaultMethod() {
        Flyable.super.demoDefaultMethod();
    }
}
