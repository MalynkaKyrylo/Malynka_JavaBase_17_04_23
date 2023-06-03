package ua.hillel.malynka.lessons.lesson16;

public class HomeworkTask18 {
    public static void main(String[] args) {
        int array1[][] = {{1, 2}, {3, 4}};
        int array2[][] = {{1, 2}, {3, 4},{5,6}};
        int array3[][] = null;
        int array4[][] = new int [0][0];
        boolean check1 = squareMatrixCheck(array1);
        boolean check2 = squareMatrixCheck(array2);
        boolean check3 = squareMatrixCheck(array3);
        boolean check4 = squareMatrixCheck(array4);
        System.out.println(check1);
        System.out.println(check2);
        System.out.println(check3);
        System.out.println(check4);

        if (check1 == true) {
            System.out.println("Матрица квадратная 1");
            System.out.println(arrayAverage(array1));
        }
        if (check2 == true) {
            System.out.println("Матрица квадратная 1");
            System.out.println(arrayAverage(array2));
        }
        if (check3 == true) {
            System.out.println("Матрица квадратная 1");
            System.out.println(arrayAverage(array3));
        }
        if (check4 == true) {
            System.out.println("Матрица квадратная 1");
            System.out.println(arrayAverage(array4));
        }
        System.out.println(arrayAverage(array1));
        System.out.println(arrayAverage(array2));
        System.out.println(arrayAverage(array3));
        System.out.println(arrayAverage(array4));




    }
    public static double arrayAverage(int[][] array) {
        double sum = 0.0;
        int count = 0;
        double arrayAverage = 0.0;
        if (array == null) {
            return arrayAverage = 0.0;
        }
        if (array.length == 0) {
            return arrayAverage = 0.0;
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
                count++;
            }
        }
        arrayAverage = sum/ count;
        return arrayAverage;

    }
    public static boolean squareMatrixCheck(int[][] array) {

        if (array == null) {
            return false;
        }
        if (array.length == 0) {
            return false;
        }
        int rows = array.length;
        for (int i = 0; i < array.length; i++) {
            if (array[i].length != rows) {
                return false;
            }

        } return true;


    }

}


