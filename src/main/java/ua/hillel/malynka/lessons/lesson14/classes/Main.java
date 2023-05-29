package ua.hillel.malynka.lessons.lesson14.classes;

public class Main {
    public static void main(String[] args) {
        AbstractClassDemo abstractClassDemo = new AbstractClassDemo() {
            @Override
            void abstractMethod() {

            }
        };


        MyInterface myInterface = new MyInterface() {
            @Override
            public void myMethod() {

            }
        };

        myInterface.myMethod();

    }
}
