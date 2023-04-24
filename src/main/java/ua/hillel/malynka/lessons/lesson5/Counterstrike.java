package ua.hillel.malynka.lessons.lesson5;

import java.util.Scanner;

public class Counterstrike {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input name team1");
        String nameTeam1 = sc.nextLine();
        System.out.println("Input frags player 1 team1");
        int player1Team1Frags =0;
        if (sc.hasNextInt()) {
            player1Team1Frags = sc.nextInt();
        } else {
            System.out.println("Wrong data! Try again!");
            System.exit(0);
        }
        System.out.println("Input frags player 2 team1");
        int player2Team1Frags =0;
        if (sc.hasNextInt()) {
            player2Team1Frags = sc.nextInt();
        } else {
            System.out.println("Wrong data! Try again!");
            System.exit(0);
        }
        System.out.println("Input frags player 3 team1");
        int player3Team1Frags =0;
        if (sc.hasNextInt()) {
            player3Team1Frags = sc.nextInt();
        } else {
            System.out.println("Wrong data! Try again!");
            System.exit(0);
        }
        System.out.println("Input frags player 4 team1");
        int player4Team1Frags =0;
        if (sc.hasNextInt()) {
            player4Team1Frags = sc.nextInt();
        } else {
            System.out.println("Wrong data! Try again!");
            System.exit(0);
        }
        System.out.println("Input frags player 5 team1");
        int player5Team1Frags =0;
        if (sc.hasNextInt()) {
            player5Team1Frags = sc.nextInt();
        } else {
            System.out.println("Wrong data! Try again!");
            System.exit(0);
        }
        sc.nextLine();
        System.out.println("Input name team2");
        String nameTeam2 = sc.nextLine();
        System.out.println("Input frags player 1 team2");
        int player1Team2Frags =0;
        if (sc.hasNextInt()) {
            player1Team2Frags = sc.nextInt();
        } else {
            System.out.println("Wrong data! Try again!");
            System.exit(0);
        }
        System.out.println("Input frags player 2 team2");
        int player2Team2Frags =0;
        if (sc.hasNextInt()) {
            player2Team2Frags = sc.nextInt();
        } else {
            System.out.println("Wrong data! Try again!");
            System.exit(0);
        }
        System.out.println("Input frags player 3 team2");
        int player3Team2Frags =0;
        if (sc.hasNextInt()) {
            player3Team2Frags = sc.nextInt();
        } else {
            System.out.println("Wrong data! Try again!");
            System.exit(0);
        }
        System.out.println("Input frags player 4 team2");
        int player4Team2Frags =0;
        if (sc.hasNextInt()) {
            player4Team2Frags = sc.nextInt();
        } else {
            System.out.println("Wrong data! Try again!");
            System.exit(0);
        }
        System.out.println("Input frags player 5 team2");
        int player5Team2Frags =0;
        if (sc.hasNextInt()) {
            player5Team2Frags = sc.nextInt();
        } else {
            System.out.println("Wrong data! Try again!");
            System.exit(0);
        }
        sc.nextLine();
        double averageTeam1Frags =(player1Team1Frags+player2Team1Frags+player3Team1Frags+player4Team1Frags+player5Team1Frags)/5D;
        double averageTeam2Frags =(player1Team2Frags+player2Team2Frags+player3Team2Frags+player4Team2Frags+player5Team2Frags)/5D;
        if (averageTeam1Frags > averageTeam2Frags) {
            System.out.println("Перемогла команда "+nameTeam1+" з "+averageTeam1Frags+" середньою кількістю фрагів");
        } else if (averageTeam2Frags > averageTeam1Frags) {
            System.out.println("Перемогла команда "+nameTeam2+" з "+averageTeam2Frags+" середньою кількістю фрагів");
        }else System.out.println("Нічия, обидві команди набрали однакову середню кількисть фрагів "+averageTeam1Frags+averageTeam2Frags);
            }
}
