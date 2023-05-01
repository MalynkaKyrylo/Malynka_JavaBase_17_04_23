package ua.hillel.malynka.lessons.lesson7;

import java.util.Arrays;

public class Regbi {
    public static void main(String[] args) {
        int quantityTeamPlayers = 25;
        int minPlayersAge = 18;
        int maxPlayersAge = 40;
        int sumAgesTeam1 =0;
        int sumAgesTeam2 =0;
        int[] team1Ages = new int[quantityTeamPlayers];
        int[] team2Ages = new int[quantityTeamPlayers];
        for (int i = 0; i < quantityTeamPlayers; i++) {
            team1Ages[i] = (int)((Math.random()*(maxPlayersAge-minPlayersAge+1))+minPlayersAge);
            sumAgesTeam1 = sumAgesTeam1+team1Ages[i];
            team2Ages[i] = (int)((Math.random()*(maxPlayersAge-minPlayersAge+1))+minPlayersAge);
            sumAgesTeam2 = sumAgesTeam2+team2Ages[i];
        }
        System.out.println(Arrays.toString(team1Ages));
        System.out.println(Arrays.toString(team2Ages));
        System.out.println((float)sumAgesTeam1/quantityTeamPlayers);
        System.out.println((float)sumAgesTeam2/quantityTeamPlayers);
    }
}
