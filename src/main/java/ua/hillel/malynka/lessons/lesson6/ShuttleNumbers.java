package ua.hillel.malynka.lessons.lesson6;

public class ShuttleNumbers {
    public static void main(String[] args) {
        int countShuttle = 1;
        for (int numShuttle = 1; countShuttle <= 100; numShuttle++) {
            if (numShuttle == 4 || numShuttle == 9 || numShuttle % 10 == 4 || numShuttle % 10 == 9 || (numShuttle % 100) / 10 == 4 || (numShuttle % 100) / 10 == 9) {
            continue;
            }
            System.out.println("Порядковий номер шаттла: "+countShuttle+" № шаттла "+numShuttle);
            countShuttle++;
        }
    }
}
