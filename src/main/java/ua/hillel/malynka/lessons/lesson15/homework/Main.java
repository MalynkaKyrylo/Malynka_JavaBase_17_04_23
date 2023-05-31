package ua.hillel.malynka.lessons.lesson15.homework;

import ua.hillel.malynka.lessons.lesson15.main.CarType;

import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static int totalPrice =0;

    public static void main(String[] args) {
        runDrink();

        System.out.println("Count drinks = " + DrinkMaker.counter);
        System.out.println("Check Total. To pay: " + totalPrice);

    }
    private static void runDrink() {
        DrinkMachine[] drinkMachines = DrinkMachine.values();
        Scanner scanner = new Scanner(System.in);
        DrinkMachine userDrink = null;
        while (userDrink == null) {
            System.out.println("Please enter a drink from the list: " + Arrays.toString(drinkMachines));
            String userValue = scanner.nextLine().toUpperCase();
            for (DrinkMachine drinkMachine : drinkMachines) {
                if (userValue.equals(drinkMachine.toString())) {
                    userDrink = DrinkMachine.valueOf(userValue);
                    break;
                }
            }
        }




        switch (userDrink) {
            case COFFEE: {
                System.out.println(DrinkMachine.COFFEE.getDrink() + " price: " + DrinkPrice.COFFEE_PRICE);
                totalPrice = totalPrice +DrinkPrice.COFFEE_PRICE;
                DrinkMaker.makeDrink(userDrink);
                break;
            }
            case TEA: {
                System.out.println(DrinkMachine.TEA.getDrink() + " price: " + DrinkPrice.TEA_PRICE);
                totalPrice += DrinkPrice.TEA_PRICE;
                DrinkMaker.makeDrink(userDrink);
                break;
            }
            case LEMONADE: {
                System.out.println(DrinkMachine.LEMONADE.getDrink() + " price: " + DrinkPrice.LEMONADE_PRICE);
                totalPrice += DrinkPrice.LEMONADE_PRICE;
                DrinkMaker.makeDrink(userDrink);
                break;
            }
            case MOJITO: {
                System.out.println(DrinkMachine.MOJITO.getDrink() + " price: " + DrinkPrice.MOJITO_PRICE);
                totalPrice += DrinkPrice.MOJITO_PRICE;
                DrinkMaker.makeDrink(userDrink);
                break;
            }
            case MINERAL: {
                System.out.println(DrinkMachine.MINERAL.getDrink() + " price: " + DrinkPrice.MINERAL_PRICE);
                totalPrice += DrinkPrice.MINERAL_PRICE;
                DrinkMaker.makeDrink(userDrink);
                break;
            }
            case COLA: {
                System.out.println(DrinkMachine.COLA.getDrink() + " price: " + DrinkPrice.COLA_PRICE);
                totalPrice += DrinkPrice.COLA_PRICE;
                DrinkMaker.makeDrink(userDrink);
                break;
            }
        }



    }

}
