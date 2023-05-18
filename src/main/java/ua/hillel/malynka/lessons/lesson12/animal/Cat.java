package ua.hillel.malynka.lessons.lesson12.animal;

public class Cat extends Animal {
    void meow() {
        System.out.println(name + " meow");
    }


    @Override
    void eat() {
        meow();
        meow();
        System.out.println(name + " eating!!!");
    }

    @Override
    void demoDefaultMethod() {
        super.demoDefaultMethod();
        System.out.println("FROM CAT");
    }
}
