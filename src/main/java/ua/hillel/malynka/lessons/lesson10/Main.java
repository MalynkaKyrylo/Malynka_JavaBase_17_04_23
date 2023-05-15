package ua.hillel.malynka.lessons.lesson10;

public class Main {
    public static void main(String[] args) {
        //        printHelloName("Den");
//        printHelloName("Alex");
//        printHelloName("Mishel");

//        String name = "Den";
//
//        name = name + " ";
//
//        System.out.println("main method name = " + name);
//        demoChangeValue(name);
//        System.out.println("main method name = " + name);


//        int[] array = {1, 2, 3, 4, 5};
//
//        System.out.println(Arrays.toString(array)); // 1, 2, 3, 4, 5
//        changeArray(array);
//        System.out.println(Arrays.toString(array)); // 99, 2, 3, 4, 5


//        int variable = 1;
//        System.out.println(variable);
//        changeVariable(variable);
//        System.out.println(variable);


//        printSum(10, 20);

//        int result = getSum(10, 20);
//        System.out.println(result);

//        System.out.println(getSum(10, 20));

//        demoRecursion(5);


//        5! = 120;
//        5 * 4 * 3 * 2 * 1

//        3!
//        3 * 2 * 1


        int N = 5;
//        int result = 1;
//
//        for (int i = N; i >= 1; i--) {
//            result *= i;
//        }
//
//        System.out.println(result);


//        System.out.println(getFactorial(N));

//        System.out.println(nsdEvclide(64, 48));




    }


    static int nsdEvclide(int n, int m) {
        if (n == m) {
            return n;
        } else if (n > m) {
            return nsdEvclide(n - m, m);
        } else if (n < m) {
            return nsdEvclide(n, m - n);
        }
        return -1;
    }


    static int getFactorial(int N) {
        if (N == 1) {
            return 1;
        }
        return N * getFactorial(N - 1);
    }


//    static void demoRecursion(int x) {
//        System.out.println(x);
//        if (x > 0) {
//            demoRecursion(--x);
//        }
//    }


//    static void badRecursion() {
//        System.out.println("gfsdfgsdfgsd");
//        badRecursion();
//    }


    static double getSum(double a, double b, int c, int d) {
        return a + b + c + d;
    }

    static double getSum(double a, int b, int c, int d) {
        return a + b + c + d;
    }

    static int getSum(int a, int b, int c, int d) {
//        return a + b + c + d;

        return getSum(a, b, c) + d;
    }

    static int getSum(int a, int b, int c) {
//        return a + b + c;

        return getSum(a, b) + c;

    }

    static int getSum(int a, int b) {
//        int sum = a + b;
//        return sum;

        return a + b;
    }


    static void printSum(int a, int b) {
        System.out.println(a + b);
    }

    static void changeArray(int[] array) {
        array[0] = 99;
    }

    static void changeVariable(int variable) {
        variable = 99;
    }

    static void printHello() {
        System.out.println("Hello");
    }

    static void printHelloName(String name) {
        System.out.println("Hello " + name);
    }

    static void demoChangeValue(String name) {
        System.out.println(name);
        name = "Alex";
        System.out.println(name);
    }
}
