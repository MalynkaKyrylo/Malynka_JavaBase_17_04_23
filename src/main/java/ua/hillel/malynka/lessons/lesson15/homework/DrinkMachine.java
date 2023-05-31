package ua.hillel.malynka.lessons.lesson15.homework;

public enum DrinkMachine {

    COFFEE("Кава"),
    TEA("Чай"),
    LEMONADE("Лимонад"),
    MOJITO("Мохіто"),
    MINERAL("Мінеральна вода"),
    COLA("Кока Кола");
    private String drink;

    DrinkMachine(String drink) {
        this.drink = drink;
    }

    public String getDrink() {
        return drink;
    }
}
