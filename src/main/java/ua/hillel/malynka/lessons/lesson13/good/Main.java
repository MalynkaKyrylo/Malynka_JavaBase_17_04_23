package ua.hillel.malynka.lessons.lesson13.good;

import ua.hillel.malynka.lessons.lesson13.good.obstacle.Obstacle;
import ua.hillel.malynka.lessons.lesson13.good.obstacle.ObstaclePool;
import ua.hillel.malynka.lessons.lesson13.good.obstacle.ObstacleWall;
import ua.hillel.malynka.lessons.lesson13.good.participant.*;
//import ua.hillel.malynka.lessons.lesson13.good.participant.ParticipantRabbit;

public class Main {

    public static void main(String[] args) {

//        ObstaclePool obstaclePool = new ObstaclePool();
//        ObstacleWall obstacleWall = new ObstacleWall();
//
//        ParticipantCat participantCat = new ParticipantCat("Tom");
//        ParticipantDog participantDog = new ParticipantDog("Bobik");
////        ParticipantRabbit participantRabbit = new ParticipantRabbit("Buny");
//
//
//        obstaclePool.start(participantCat);
//        obstaclePool.start(participantDog);
////        obstaclePool.start(participantRabbit);
//
//        obstacleWall.start(participantCat);
//        obstacleWall.start(participantDog);
////        obstacleWall.start(participantRabbit);


        Obstacle[] obstacles = {
                new ObstaclePool(),
                new ObstacleWall()
        };

        Participant[] participants = {
                new ParticipantCat("Tom"),
                new ParticipantRabbit("Buny")
        };


        for (Obstacle obstacle : obstacles) {
            for (Participant participant : participants) {
                obstacle.start(participant);
            }
        }







//        Participant participantCat = new ParticipantCat("Tom");
//        System.out.println(participantCat.getClass());
//
//        demo(participantCat);
    }


    static void demo(Participant participant) {
        participant.getName();

        if (participant instanceof ParticipantCat) {
            ((ParticipantCat) participant).demoMethodCat();
        }


    }

}
