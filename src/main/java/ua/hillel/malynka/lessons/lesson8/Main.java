package ua.hillel.malynka.lessons.lesson8;

import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        //        // O(N)
//        for (int i = 0; i < 5; i++) {
//
//        }
//
//
//        int counter = 0;
//        // O(N^2)
//        for (int i = 0; i < 15; i++) {
//            for (int j = 0; j < 12; j++) {
//                counter++;
//            }
//        }
//
//
//        counter = 0;
//        // O(N^3)
//        for (int i = 0; i < 15; i++) {
//            for (int j = 0; j < 12; j++) {
//                for (int k = 0; k < 3; k++) {
//                    counter++;
//                }
//            }
//        }
//
//        System.out.println("counter = " + counter);


//        int[] array = {5, 1, 2, 5, 76, 23, 2, 6, 87};
//        int[] array = {1, 2, 2, 5, 5, 6, 23, 76, 87};

//        int counter = 0;

//        for (int i = 0; i < array.length - 1; i++) {
//            for (int j = 0; j < array.length - 1 - i; j++) {
//                counter++;
//                if (array[j] > array[j + 1]) {
//                    int temp = array[j];
//                    array[j] = array[j + 1];
//                    array[j + 1] = temp;
//                }
//            }
//        }
//
//        System.out.println("counter = " + counter);
//        System.out.println(Arrays.toString(array));

//        int[] array = {5, 1, 2, 5, 76, 23, 2, 6, 87};
//        boolean swapped = true;
//        int start = 0;
//        int end = array.length;
//
//        while (swapped == true) {
//            swapped = false;
//            for (int i = start; i < end - 1; ++i) {
//                counter++;
//                if (array[i] > array[i + 1]) {
//                    int temp = array[i];
//                    array[i] = array[i + 1];
//                    array[i + 1] = temp;
//                    swapped = true;
//                }
//            }
//
//            if (swapped == false) {
//                break;
//            }
//
//            swapped = false;
//
//            end = end - 1;
//
//            for (int i = end - 1; i >= start; i--) {
//                counter++;
//                if (array[i] > array[i + 1]) {
//                    int temp = array[i];
//                    array[i] = array[i + 1];
//                    array[i + 1] = temp;
//                    swapped = true;
//                }
//            }
//
//            start = start + 1;
//        }
//
//        System.out.println("counter = " + counter);
//        System.out.println(Arrays.toString(array));



//        Integer[] array = {5, 1, 2, 5, 76, 23, 2, 6, 87};
//        Arrays.sort(array);
//        System.out.println(Arrays.toString(array));
//
//
//        Arrays.sort(array, Collections.reverseOrder());
//        System.out.println(Arrays.toString(array));



//        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        int element = 9;
//        int index = -1;
//
//        int counter = 0;


//        // O(N) - BAD VERSION
//        for (int i = 0; i < array.length; i++) {
//            counter++;
//            if (array[i] == element) {
//                index = i;
//                break;
//            }
//        }





//        // O(log2N) -> O(logN)
//        int firstIndex = 0;
//        int lastIndex = array.length - 1;
//
//
//        while (firstIndex <= lastIndex) {
//            counter++;
//            int middleIndex = (firstIndex + lastIndex) / 2;
//
//            if (array[middleIndex] == element) {
//                index = middleIndex;
//                break;
//            } else if (array[middleIndex] < element) {
//                firstIndex = middleIndex + 1;
//            } else {
//                lastIndex = middleIndex - 1;
//            }
//        }
//
//        System.out.println("counter = " + counter);
//        System.out.println("index = " + index);


//        int indexArray = Arrays.binarySearch(array, element);
//        System.out.println("index = " + indexArray);


//        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
//        int[] array2 = Arrays.copyOf(array, array.length);
//        System.out.println(Arrays.toString(array2));



        // Дан масив [1, 2, 3].  Додайте йому до кінця елементи 4, 5, 6.

        int[] array = {1, 2, 3};
        int oldLength = array.length;
        array = Arrays.copyOf(array, array.length + 3);

        int number = 4;
        for (int i = oldLength; i < array.length; i++) {
            array[i] = number++;
        }


        System.out.println(Arrays.toString(array));


    }
}
