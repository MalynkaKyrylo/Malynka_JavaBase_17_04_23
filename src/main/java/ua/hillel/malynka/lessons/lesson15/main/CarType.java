package ua.hillel.malynka.lessons.lesson15.main;

public enum CarType {
    CAR("Автомобiль", Category.B),
    BUS("Автобус"),
    TRUCK("Вантажiвка"),
    MOTORCYCLE("Мотоцикл");

//    CAR(), BUS(), TRUCK(), MOTORCYCLE();

    private String type;
    private int price;
    Category category;

    CarType(String type) {
        this.type = type;
    }

    CarType(String type, int price) {
        this.type = type;
        this.price = price;
    }

    CarType(String type, Category category) {
        this.type = type;
        this.category = category;
    }

    public String getType() {
        return type;
    }

    public int getPrice() {
        return price;
    }
}
