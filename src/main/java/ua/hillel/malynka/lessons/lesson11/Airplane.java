package ua.hillel.malynka.lessons.lesson11;

public class Airplane {
    String type;
    String name;
    int firstClassPassengers;
    int secondClassPassengers;

    //        b. Фабрика випускає три типи літаків:
//        винищувачі: тип + ім'я
//        пасажирські без бізнес класу: тип + ім'я + кільк. пасажирів 2-го класу
//        пасажирські з бізнес класом: тип + ім'я + кільк. пасажирів 1 класу + кільк. пасажирів 2-го класу
    Airplane(String type, String name) {
        this.type = type;
        this.name = name;

        System.out.println("винищувач тип: " + this.type + " " + this.name);
    }

    Airplane(String type, String name, int secondClassPassengers) {
        this.type = type;
        this.name = name;
        this.secondClassPassengers = secondClassPassengers;
        System.out.println("пасажирський без бізнес класу тип: " + this.type
                + " " + this.name
                + " кільк. пасажирів 2-го класу: " + this.secondClassPassengers);
    }

    Airplane(String type, String name, int secondClassPassengers, int firstClassPassengers) {
        this.type = type;
        this.name = name;
        this.secondClassPassengers = secondClassPassengers;
        this.firstClassPassengers = firstClassPassengers;

        System.out.println("пасажирський з бізнес класом: тип: " + this.type
                + " " + this.name
                + " кільк. пасажирів 1 класу: " + this.firstClassPassengers
                + " кільк. пасажирів 2-го класу: " + this.secondClassPassengers);
    }

}
