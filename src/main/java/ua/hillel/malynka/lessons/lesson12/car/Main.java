package ua.hillel.malynka.lessons.lesson12.car;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Mercedes-Benz");
        car.start();


        System.out.println(car.getModelName());

        Car car2 = new Car("bmw");
        Car car3 = new Car("bmw");
    }

}
