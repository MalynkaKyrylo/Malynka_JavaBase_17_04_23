package ua.hillel.malynka.lessons.lesson6;

public class Main {
    public static void main(String[] args) {
        //        FOR

        /*
        for(  БЛОК ІНІЦІАЛІЗАЦІЇ ІТЕРАТОРА;
              БЛОК УМОВИ ВИХОДУ З ЦИКЛУ;
              БЛОК ЗМІНИ ІТЕРАТОРА (++ або --)
              )
              {
                  код
              }
         */


//        -- BREAK --
//        ОБРИВАННЯ ВСЬОГО ЦИКЛУ

//        -- CONTINUE --
//        ОБРИВАЄ ПОТОЧНУ ІТЕРАЦІЮ


//        for (int i = 1; ; i++) {
//
//            if (i > 10) {
//                break;
//            }
//
//            if (i > 10) {
//                continue;
//            }
//
//            System.out.println(i);
//
//        }






//        1)
//        виведення лише парних за допомогою циклу FOR
//        0 2 4 6 8 10 12 14 16 18 20

        // version 1
//        for (int i = 0; i <= 20; i += 2) {
//            System.out.println(i);
//        }


        //version 2
//        for (int i = 0; i <= 20; i++) {
//
//            if (i % 2 != 0) {
//                continue;
//            }
//
//            System.out.println(i);
//        }








//        2)
//        Виведіть на екран перші 11 членів послідовності Фібоначчі
//        1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89

//        int num1 = 1;
//        int num2 = 1;
//        int sum;
//
//        System.out.print(num1 + " " + num2 + " ");
//
//        for (int i = 0; i < 9; i++) {
//            sum = num1 + num2;
//            System.out.print(sum + " ");
//
//            num1 = num2;
//            num2 = sum;
//        }




//        for (int i = 0, j = 10; i < 10 && j > 5; i++, j--) {
//            System.out.println("i = " + i);
//            System.out.println("j = " + j);
//            System.out.println();
//            System.out.println();
//        }


        // WHILE


//        int i = -1;
//        while (true) {
//            i++;
//
//            if (i == 5) {
//                continue;
//            }
//
//            if (i > 10) {
//                break;
//            }
//
//            System.out.println(i);
//
//        }

//        int i = 0;
//
//        do {
//            System.out.println(i);
//            i++;
//        } while (false);


//        Scanner scanner = new Scanner(System.in);

//        System.out.println("Please enter integer from 10 to 20");


//        while (true) {
//            if (scanner.hasNextInt()) {
//                int userValue = scanner.nextInt();
//                if (userValue >= 10 && userValue <= 20) {
//                    System.out.println("user value = " + userValue);
//                    break;
//                } else {
//                    System.out.println("Enter integer from 10 to 20");
//                }
//            } else {
//                System.out.println("Wrong data! Try again");
//            }
//            scanner.nextLine();
//        }


//        1)
//        a. Зробіть бомбу зі зворотним відліком від 10 до 0 за допомогою циклу WHILE
//        b. додайте до вашої бомби умову, якщо бомба розмінована, вона не вибухне (85 - 100) - win


//        int time = 10;
//
//        while (true) {
//            int random = (int) (Math.random() * 101);
//            System.out.println("random = " + random);
//
//            if (random >= 85 && random <= 100) {
//                System.out.println("WIN!!!!!!");
//                break;
//            }
//
//            System.out.println(time);
//
//            if (time == 0) {
//                System.out.println("BOOOOOOOOOOOM!!!!!!");
//                break;
//            }
//
//            time--;
//        }

//        int chance = 101;
//        int j = 0;
//
//        for (int i = 0; i < 100; i++) {
//            j++;
//            int random = (int) (Math.random() * chance);
//            System.out.println("random = " + random);
//
//            if (random == 0 || random == 1) {
//                System.out.println("JACKPOT WIN!!!!!!");
//                break;
//            }
//
//            if (j == 10) {
//                chance -= 10;
//                j = 0;
//            }
//        }


//        for (int i = 10; i <= 300; i++) {
//            if (i == 4 || i == 9 || i / 10 == 4) {
//                continue;
//            }
//            System.out.println(i);
//        }
//          14 19 24 29 40 41 42 79 90 91
//    }
//
//}
    }
}
