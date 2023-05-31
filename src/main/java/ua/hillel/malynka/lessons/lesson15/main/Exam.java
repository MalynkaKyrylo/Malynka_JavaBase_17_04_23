package ua.hillel.malynka.lessons.lesson15.main;

import java.util.Arrays;
import java.util.Scanner;

    /*
        створіть клас Exam, у ньому попросіть користувача ввести тип
        транспортного засобу:
        MOTORCYCLE, CAR, BUS, TRUCK
        b. залежно від вибраного виду, виведіть літеру категорії прав, яка
        необхідна для керування цим транспортним засобом.
        приклад: MOTO = A, CAR = B
        c. виведіть у консоль букву категорії:
        "Для керування CAR необхідна категорія В"
        d. для кожної категорії створіть метод, який приймає на вхід
        кількість років досвіду водіння (вводимо з консолі), в якому рахуйте
        чи достатньо в людини досвіду щоб водити це транспортне
        засіб. З такими параметрами:
        А: від 3 років досвіду водіння
        В: від 0 років досвіду
        C: від 5 років досвіду
        D: від 7 років досвіду
        e. викликайте відповідний метод у switch
        f. введіть з консолі типу т.с. і років досвіду в циклі, щоб можна було
        перевіряти та видавати багато прав. цикл повинен працювати поки користувач
        не введе "no"
        g. створіть клас DriverLicense і якщо користувач може отримати права -
        створюйте йому екземпляр прав
        h. рахуйте кількість виданих прав і виведіть на екран після того як
        введено команду "no":
        Всього видано: 12 ліцензій
 */

    public class Exam {
        public static void main(String[] args) {
            runApp();
            System.out.println("count driver license = " + DriverLicense.counter);
        }

        static void runApp() {
            Scanner scanner = new Scanner(System.in);
            CarType[] carTypes = CarType.values();
            CarType userCarType = null;
            int years = -1;
            while (userCarType == null) {
                System.out.println("Please enter transport type from list: " + Arrays.toString(carTypes));
                String userValue = scanner.nextLine().toUpperCase();
                for (CarType carType : carTypes) {
                    if (userValue.equals(carType.toString())) {
                        userCarType = CarType.valueOf(userValue);
                        break;
                    }
                }
//            if (userCarType != null) {
//                break;
//            }
            }

            while (true) {
                System.out.println("Please enter drive experience");
                if (scanner.hasNextInt()) {
                    years = scanner.nextInt();
                    if (years >= 0) {
                        break;
                    } else {
                        System.out.println("Please enter positive number");
                    }
                } else {
                    System.out.println("Please enter correct value");
                }
            }


            boolean ok = false;
            switch (userCarType) {
                case MOTORCYCLE: {
                    System.out.println("for " + CarType.MOTORCYCLE + " need category " + Category.A);
                    ok = checkYears(years, Category.A);
                    break;
                }
                case CAR: {
                    System.out.println("for " + CarType.CAR + " need category " + Category.B);
                    ok = checkYears(years, Category.B);
                    break;
                }
                case TRUCK: {
                    System.out.println("for " + CarType.TRUCK + " need category " + Category.C);
                    ok = checkYears(years, Category.C);
                    break;
                }
                case BUS: {
                    System.out.println("for " + CarType.BUS + " need category " + Category.D);
                    ok = checkYears(years, Category.D);
                    break;
                }
            }

            if (ok) {
                System.out.println("Take your driver license");
                new DriverLicense();
            } else {
                System.out.println("You need more drive experience");
            }


        }


        static boolean checkYears(int years, Category category) {

//        boolean ok = false;
//
//        switch (category) {
//            case A: {
//                if (years >= 3) {
//                    ok = true;
//                }
//                break;
//            }
//            case B: {
//                if (years >= 0) {
//                    ok = true;
//                }
//                break;
//            }
//            case C: {
//                if (years >= 5) {
//                    ok = true;
//                }
//                break;
//            }
//            case D: {
//                if (years >= 7) {
//                    ok = true;
//                }
//                break;
//            }
//        }
//
//        return ok;


            switch (category) {
                case A: {
                    return years >= 3;
                }
                case B: {
                    return years >= 0;
                }
                case C: {
                    return years >= 5;
                }
                case D: {
                    return years >= 7;
                }
                default: {
                    return false;
                }

            }

        }
}
