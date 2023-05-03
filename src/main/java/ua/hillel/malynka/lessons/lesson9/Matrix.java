package ua.hillel.malynka.lessons.lesson9;

import java.util.Arrays;
import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        int M = 0;
        int N = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the number of matrix rows");
        while (!sc.hasNextInt()) {
            sc.nextLine();
            System.out.println("Wrong data! Input the number!");
        }
        M = sc.nextInt();
        sc.nextLine();
        System.out.println("Input the number of matrix columns");
        while (!sc.hasNextInt()) {
            sc.nextLine();
            System.out.println("Wrong data! Input the number!");
        }
        N = sc.nextInt();
        sc.nextLine();
        int[][] array = new int[M][N];
        int[][] arrayTranspon = new int[N][M];
        System.out.println("Original random matrix size "+M+"x"+N);
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 101);
                arrayTranspon[j][i] = array[i][j];
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Transposed matrix size "+N+"x"+M);
        for (int i = 0; i < arrayTranspon.length; i++) {
            for (int j = 0; j < arrayTranspon[i].length; j++) {
                System.out.print(arrayTranspon[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
