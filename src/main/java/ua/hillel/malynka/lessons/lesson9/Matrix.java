package ua.hillel.malynka.lessons.lesson9;

import java.util.Arrays;
import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        int m = 0;
        int n = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the number of matrix rows");
        while (true) {
            if (sc.hasNextInt()) {
                m = sc.nextInt();
                if (m < 0) {
                    System.out.println("Please enter positive number");
                } else {
                    break;
                }
                sc.nextLine();
            } else {
                System.out.println("Wrong data, try again");
                sc.nextLine();
            }
        }
        sc.nextLine();
        System.out.println("Input the number of matrix columns");
        while (true) {
            if (sc.hasNextInt()) {
                n = sc.nextInt();
                if (n < 0) {
                    System.out.println("Please enter positive number");
                } else {
                    break;
                }
                sc.nextLine();
            } else {
                System.out.println("Wrong data, try again");
                sc.nextLine();
            }
        }
        sc.nextLine();
        int[][] array = new int[m][n];
        int[][] arrayTranspon = new int[n][m];
        System.out.println("Original random matrix size "+m+"x"+n);
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 101);
                arrayTranspon[j][i] = array[i][j];
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Transposed matrix size "+n+"x"+m);
        for (int i = 0; i < arrayTranspon.length; i++) {
            for (int j = 0; j < arrayTranspon[i].length; j++) {
                System.out.print(arrayTranspon[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
