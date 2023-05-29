package ua.hillel.malynka.lessons.lesson14.classes;
import ua.hillel.malynka.lessons.lesson14.interfaces.Runnable;

import java.util.ArrayList;
import java.util.List;

public class Car {

    private String modelName;
    private Engine engine;

    public Car(String modelName, double volume) {
        this.modelName = modelName;
        this.engine = new Engine(volume);
    }

    public Car(String modelName) {
        this.modelName = modelName;
    }


    private void demo2() {

    }


    private void demo() {

        {
            class LocalClass implements Runnable {
                int x;
                int y;
                int z;

                void localClassMethod() {
                    System.out.println("localClassMethod");
                }

                @Override
                public void run() {

                }
            }
            LocalClass localClass = new LocalClass();
            localClass.localClassMethod();



        }



    }




    class Engine {

        double volume;

        public Engine(double volume) {
            this.volume = volume;
        }


        void start() {
            System.out.println(modelName + " start");
            demo();
        }

        void stop() {
            System.out.println(modelName + "stop");
        }

    }

    static class Wheel {

        static double staticObemTusky = 20;
        double obemTusky = 10;

        void demoNonStaticMethod() {
            System.out.println("demoStaticMethod");
        }

        static void demoStaticMethod() {
            System.out.println("demoStaticMethod");
        }

    }

}