package ua.hillel.malynka.lessons.lesson15.homework;

public class DrinkMaker {
    static int counter = 0;

    public static void makeDrink (DrinkMachine drinksMachines){
        System.out.println("Please, wait... " + drinksMachines.getDrink() + " is preparing ");
        System.out.println("Please take your " + drinksMachines.getDrink());
        counter++;
    }

}
