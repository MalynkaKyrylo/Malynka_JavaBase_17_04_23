package ua.hillel.malynka.lessons.lessson11;

public class AirFactory {
    //        Фабрика літаків
//        a. Параметри літаків:
//        String type = "Jet";
//        String name = "F52";
//        int firstClassPassengers = 20;
//        int secondClassPassengers = 250;
//        b. Фабрика випускає три типи літаків:
//        винищувачі: тип + ім'я
//        пасажирські без бізнес класу: тип + ім'я + кільк. пасажирів 2-го класу
//        пасажирські з бізнес класом: тип + ім'я + кільк. пасажирів 1 класу + кільк. пасажирів 2-го класу
//        c. Зробити три конструктори для кожного типу літака
//        AirCraftFactory("Jet", "F52");
//        AirCraftFactory("Boeing", "747", 300);
//        AirCraftFactory("Boeing", "747", 300, 25);
//        d. Пiсля строрення лiтака повинно виводити на екран параметри літака

    public static void main(String[] args) {

        Airplane jetF52 = new Airplane("Jet", "F52");
        Airplane boeing747withoutFirstClass = new Airplane("Boeing", "747", 300);
        Airplane boeing747withFirstClass = new Airplane("Boeing", "747", 300, 25);

    }
}
