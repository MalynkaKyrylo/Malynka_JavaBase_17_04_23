package ua.hillel.malynka.lessons.lesson7;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//      //        int[] array = new int[5];
////
////
////        array[0] = 9;
////        array[1] = 1;
////        array[2] = 2;
////        array[3] = 3;
////        array[4] = 4;
//
//
////        System.out.println(array[0]);
////        System.out.println(array[1]);
////        System.out.println(array[2]);
////        System.out.println(array[3]);
////        System.out.println(array[4]);
//
////        System.out.println(array.length);
//
////        for (int i = 0; i < array.length; i++) {
////            if (array[i] == 3 || array[i] == 4) {
////                array[i] = 77;
////            }
////            System.out.println(array[i]);
////        }
//
////        for (int value : array) {
////            System.out.println(value);
////        }
//
//
////        System.out.println(Arrays.toString(array));
//
//
//
//
////        int[] array = new int[5];
//////        int array2[] = new int[5];
////        int[] array3 = {1, 2, 6, 8, 11, 546, 56, 34};
//////        int[] array4 = new int[] {1, 2, 6, 8, 11, 546, 56, 34};
//////        int[] array5 = new int[-1]; // NegativeArraySizeException
////        int[] array5 = new int[0];
//
//
////          BAD VERSION!!!!!!!!!!!!!!!!!!!
////        int[] array1 = {1, 2, 3, 4, 5};
////        int[] array2 = array1;
////
////        System.out.println(Arrays.toString(array1));
////        System.out.println(Arrays.toString(array2));
////
////        array2[0] = 99;
////        System.out.println();
////
////        System.out.println(Arrays.toString(array1));
////        System.out.println(Arrays.toString(array2));
//
//        int[] array1 = {1, 2, 3, 4, 5};
//        int[] array2 = new int[array1.length];
//
//        for (int i = 0; i < array1.length; i++) {
//            array2[i] = array1[i];
//        }
//
//        System.out.println(Arrays.toString(array1));
//        System.out.println(Arrays.toString(array2));
//
//        array2[0] = 99;
//        System.out.println();
//
//        System.out.println(Arrays.toString(array1));
//        System.out.println(Arrays.toString(array2));
//
//
//
//    }
//
//
//
//    static void task1() {
//        //   створити масив на 10 елементів та заповнити його випадковими цифрами від 0 до 10
////   вивести на екран в один рядок усі цифри, розділивши їх комою, але у
////   останнього символу не виводити кому
//
//
//        int[] array = new int[10];
//
////        array[0] = (int) (Math.random() * 11);
////        array[1] = (int) (Math.random() * 11);
////        array[2] = (int) (Math.random() * 11);
////        array[3] = (int) (Math.random() * 11);
////        array[4] = (int) (Math.random() * 11);
////        array[5] = (int) (Math.random() * 11);
////        array[6] = (int) (Math.random() * 11);
////        array[7] = (int) (Math.random() * 11);
////        array[8] = (int) (Math.random() * 11);
////        array[9] = (int) (Math.random() * 11);
//
//        for (int i = 0; i < array.length; i++) {
//            array[i] = (int) (Math.random() * 11);
//        }
//
//
//        for (int i = 0; i < array.length; i++) {
//
////            System.out.println("index = " + i);
////            System.out.println("value = " + array[i]);
////            System.out.println();
//
//            if (i == array.length - 1) {
//                System.out.print(array[i]);
//            } else {
//                System.out.print(array[i] + ", ");
//            }
//        }
//    }
//
//    static void task2() {
//        /*
//     У вбивстві Кеннеді є 10 підозрюваних. Для кожного підозрюваного
//     встановлено ймовірність того, що він був убивцею. Всі ці ймовірності
//     записані як масив чисел. Написати функцію, яка і визначить
//     номер підозрюваного, якого треба ув'язнити.
//*/
//
////        int[] people = {11, 44, 98, 44, 22, 33, 55, 22, 98, 6};
//
//
////        int[] people = new int[10];
//
////        for (int i = 0; i < people.length; i++) {
////            people[i] = (int) (Math.random() * 101);
////        }
//
////        System.out.println(Arrays.toString(people));
////
////
//
//        // version 1
////        int max = people[0];
////        for (int i = 1; i < people.length; i++) {
//////            if (max < people[i]) {
//////                max = people[i];
//////            }
////
//////            max = (max >= people[i]) ? max : people[i];
////            max = Math.max(max, people[i]);
////        }
////
////        System.out.println("max chance = " + max);
//
//
//        //version 2
//        int[] people = {11, 44, 98, 64, 22, 33, 55, 22, 98, 6};
//        int max = people[0];
//        for (int i = 1; i < people.length; i++) {
//            max = Math.max(max, people[i]);
//        }
//
//        for (int i = 0; i < people.length; i++) {
//            if (max == people[i]) {
//                System.out.println("chance " + max + ", index: " + i);
//            }
//        }
//
//
//    }
//
//
//    static void task3() {
//        /*
//     У вашій баскетбольній команді 10 людей. Очки гравців основного
//     складу записані в парні комірки масиву, а запасних гравців - у
//     непарні. Написати функцію, яка знайде наскільки більше балів
//     заробив основний склад щодо запасних гравців.
//*/
//
////        int[] team = new int[10];
////
////        for (int i = 0; i < team.length; i++) {
////            team[i] = (int) (Math.random() * 11);
////        }
////        System.out.println(Arrays.toString(team));
////
////        int[] array1 = new int[team.length / 2];
////        int[] array2 = new int[team.length / 2];
////
////        int iterator1 = 0;
////        int iterator2 = 0;
////
////        for (int i = 0; i < team.length; i++) {
////            if (i % 2 == 0) {
////                array1[iterator1] = team[i];
////                iterator1++;
////            } else {
////                array2[iterator2] = team[i];
////                iterator2++;
////            }
////        }
////
////        System.out.println(Arrays.toString(array1));
////        System.out.println(Arrays.toString(array2));
////
////        int sumTeam1 = 0;
////        int sumTeam2 = 0;
////
////        for (int i = 0; i < array1.length; i++) {
////            sumTeam1 += array1[i];
////        }
////
////        for (int i = 0; i < array2.length; i++) {
////            sumTeam2 += array2[i];
////        }
////
////
////        System.out.println(sumTeam1);
////        System.out.println(sumTeam2);
////
////        if (sumTeam1 > sumTeam2) {
////            System.out.println("TEAM 1 WIN");
////        } else if (sumTeam1 < sumTeam2) {
////            System.out.println("TEAM 2 WIN");
////        } else {
////            System.out.println("DRAW");
////        }
//
//
//        int[] team = new int[10];
//
//        for (int i = 0; i < team.length; i++) {
//            team[i] = (int) (Math.random() * 11);
//        }
//        System.out.println(Arrays.toString(team));
//        int sumTeam1 = 0;
//        int sumTeam2 = 0;
//
//        for (int i = 0; i < team.length; i++) {
//            if (i % 2 == 0) {
//                sumTeam1 += team[i];
//            } else {
//                sumTeam2 += team[i];
//            }
//        }
//
//        System.out.println("sumTeam1 = " + sumTeam1);
//        System.out.println("sumTeam2 = " + sumTeam2);
//
//        if (sumTeam1 > sumTeam2) {
//            System.out.println("TEAM 1 WIN");
//        } else if (sumTeam1 < sumTeam2) {
//            System.out.println("TEAM 2 WIN");
//        } else {
//            System.out.println("DRAW");
//        }
    }
}
