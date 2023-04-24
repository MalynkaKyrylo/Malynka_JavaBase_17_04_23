package ua.hillel.malynka.lessons.lesson6;

public class Main {
    public static void main(String[] args) {
//        for (int i=0; i<5; i++) {
//            System.out.println("Hello");
//        }
//        for (int i = 0; i < 5; i++) {
//            System.out.println(i);
//        }
//        for (int i = 10; i >= 0 ; i--) {
//            System.out.println(i);
//        }
//        int i = 10;
//        for (; i >= -10 ; i--) {
//            System.out.println(i);
//        }
//        System.out.println(i);

        for (int i = 0; i < 20 ; i++) {
            if (i>10) {
                break;
            }

            if (i==5||i==6) {
                continue;
            }
            System.out.println(i);

        }








    }
}
