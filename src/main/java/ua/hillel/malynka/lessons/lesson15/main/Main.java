package ua.hillel.malynka.lessons.lesson15.main;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        System.out.println(CarTypeClass.CAR.getType());
//        System.out.println(CarTypeClass.CAR);
//
//        System.out.println(CarType.CAR.getType());
//        System.out.println(CarType.CAR);

//        CarType[] values = CarType.values();
//        for (CarType value : values) {
//            System.out.println(value.getType());
//        }


//        CarType car = CarType.valueOf("CAR");
//        System.out.println(car);

        CarType[] carTypes = CarType.values();
        Scanner scanner = new Scanner(System.in);
        CarType userCarType = null;
        while (userCarType == null) {
            System.out.println("Please enter car type from list " + Arrays.toString(carTypes));
            String userValue = scanner.nextLine();
            for (CarType carType : carTypes) {
                if (userValue.equals(carType.toString())) {
                    userCarType = CarType.valueOf(userValue);
                    break;
                }
            }
        }



//        while (true) {
//            System.out.println("Please enter car type from list " + Arrays.toString(carTypes));
//            try {
//                String userValue = scanner.nextLine();
//                userCarType = CarType.valueOf(userValue);
//                break;
//            } catch (IllegalArgumentException e) {
//                System.out.println("Wrong data!");
//            }
//        }




        switch (userCarType) {
            case CAR: {
                System.out.println(CarType.CAR.getType());
                break;
            }
            case BUS: {
                System.out.println(CarType.BUS.getType());
                break;
            }
            case TRUCK: {
                System.out.println(CarType.TRUCK.getType());
                break;
            }
            case MOTORCYCLE: {
                System.out.println(CarType.MOTORCYCLE.getType());
                break;
            }
        }


    }
}