package ua.hillel.malynka.lessons.lesson14.interfaces;

public class Bird implements Flyable, Runnable {
    public void fly() {
        System.out.println("Bird fly");
    }
    public void run() {
        System.out.println("Bird run");
    }
}
