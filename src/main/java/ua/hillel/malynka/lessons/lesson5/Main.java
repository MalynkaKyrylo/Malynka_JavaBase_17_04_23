package ua.hillel.malynka.lessons.lesson5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        int a =5;
//        int b =10;
//        boolean result = a > b;
//        System.out.println(result);

//        String str1="Hello";
//        String str2="Hello";
//        String str3=new String("Hello");
//
//        System.out.println(str1==str2);
//        System.out.println(str1==str3);
//        System.out.println(str1.equals(str2));
//        System.out.println(str1.equals(str3));
//
//        int a=5;
//        int b=10;
//        int c=15;
//
////        boolean result = a<b && b<c;
//        boolean result = a>b || b>c;
//        System.out.println(result);

//        int a=20;
//        int b=20;
//        if (a>b) {
//            System.out.println("a > b");
//        } else {
//            System.out.println("a <= b");
//        }
//
//        if (a>b) {
//            System.out.println("a > b");
//        } else if (a<b) {
//            System.out.println("a < b");
//        } else {
//            System.out.println("a = b");
//        }

//        int a=20;
//        int b=20;

//        if (a<=b) {
//            System.out.println("a<=b");
//            if (a<b) {
//                System.out.println("a<b");
//            } else {
//                System.out.println("a=b");
//            }
//        } else {
//            System.out.println("a>b");
//        }

        // BAD version
//        if (a !=b)  System.out.println("1");
//            System.out.println("2");
//            System.out.println("3");
//            System.out.println("4");

        //(умова) ? вираз 1 : вираз 2
//
//        int a=20;
//        int b=20;
//
//        System.out.println((a>b)?"YES":"NO");

        // SWITCH Case




        // SWITCH Case String
//
//        String str = "QWE";
//
//        switch (str) {
//            case "qwe": {
//                System.out.println("1");
//                break;
//            }
//            case "Qwe": {
//                System.out.println("2");
//                break;
//            }
//            case "QWe": {
//                System.out.println("3");
//                break;
//            }
//            case "QWE": {
//                System.out.println("4");
//                break;
//            }
//        }
//        System.out.println(str.equalsIgnoreCase("QWE"));

        Scanner sc = new Scanner(System.in);


//        String userValue = sc.nextLine();
//        System.out.println("User Value = "+ userValue);
//        String userValue2 = sc.nextLine();
//        System.out.println("User Value = "+ userValue2);

       int integerUserValue = 0;
        if (sc.hasNextInt()) {
            integerUserValue = sc.nextInt();
                    } else {
            System.out.println("Wrong Data. Try again!");
            System.exit(0);
        }
        System.out.println("integerUserValue = " + integerUserValue);



    }
}
