package ua.hillel.malynka.lessons.lesson15.homework;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static int totalPrice = 0;

    public static void main(String[] args) {
        runDrink();
        System.out.println("Total drinks count: " + DrinkMaker.counter);
        System.out.println("Check Total. To pay: " + totalPrice);

    }

    private static void runDrink() {
        System.out.println("You can choose a drink: " + Arrays.toString(DrinkMachine.values()));

        while (true) {
            DrinkMachine drinkMachine = getDrink();
            if (drinkMachine == null) {
                return;
            }

            switch (drinkMachine) {
                case COFFEE: {
                    System.out.println(DrinkMachine.COFFEE.getDrink() + " price: " + DrinkPrice.COFFEE_PRICE);
                    totalPrice += DrinkPrice.COFFEE_PRICE;
                    DrinkMaker.makeDrink(drinkMachine);
                    break;
                }
                case TEA: {
                    System.out.println(DrinkMachine.TEA.getDrink() + " price: " + DrinkPrice.TEA_PRICE);
                    totalPrice += DrinkPrice.TEA_PRICE;
                    DrinkMaker.makeDrink(drinkMachine);
                    break;
                }
                case LEMONADE: {
                    System.out.println(DrinkMachine.LEMONADE.getDrink() + " price: " + DrinkPrice.LEMONADE_PRICE);
                    totalPrice += DrinkPrice.LEMONADE_PRICE;
                    DrinkMaker.makeDrink(drinkMachine);
                    break;
                }
                case MOJITO: {
                    System.out.println(DrinkMachine.MOJITO.getDrink() + " price: " + DrinkPrice.MOJITO_PRICE);
                    totalPrice += DrinkPrice.MOJITO_PRICE;
                    DrinkMaker.makeDrink(drinkMachine);
                    break;
                }
                case MINERAL: {
                    System.out.println(DrinkMachine.MINERAL.getDrink() + " price: " + DrinkPrice.MINERAL_PRICE);
                    totalPrice += DrinkPrice.MINERAL_PRICE;
                    DrinkMaker.makeDrink(drinkMachine);
                    break;
                }
                case COLA: {
                    System.out.println(DrinkMachine.COLA.getDrink() + " price: " + DrinkPrice.COLA_PRICE);
                    totalPrice += DrinkPrice.COLA_PRICE;
                    DrinkMaker.makeDrink(drinkMachine);
                    break;
                }
            }
        }
    }

    private static DrinkMachine getDrink() {
        System.out.println("Please choose a drink or type \"EXIT\"");

        while (true) {
            String userValue = scanner.next().toUpperCase();

            if (userValue.equals("EXIT")) {
                return null;
            }

            for (DrinkMachine value : DrinkMachine.values()) {
                if (userValue.equals(value.toString())) {
                    return DrinkMachine.valueOf(userValue);
                }
            }
            System.out.println("Please choose a drink from the list: " + Arrays.toString(DrinkMachine.values()));
        }
    }
}