package ua.hillel.malynka.lessons.lesson6;

import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int randomNumber = (int) (Math.random()*11);
        System.out.println("Вгадай число від 0 до 10 за 3 спроби");
        for (int i = 1; i < 4; i++) {
            System.out.println("Введи число від 0 до 10");
            while (true) {
                if (scanner.hasNextInt()) {
                    int userNumber = scanner.nextInt();
                    if (userNumber >= 0 && userNumber <= 10) {
                        if (randomNumber == userNumber) {
                            System.out.println("Ви вгадали загадане число = " + randomNumber);
                            i = 4;
                        } else if (i == 3) {
                            System.out.println("Ви не вгадали. Загадане число"+randomNumber);
                        } else {
                            System.out.println("Ви не вгадали. Спробуйте ще");
                        }
                    break;
                    } else {
                        System.out.println("Введи число від 0 до 10");
                    }
                } else {
                    System.out.println("Невірні дані. Введи число від 0 до 10");
                }
                scanner.nextLine();
            }

        }
    }
}
