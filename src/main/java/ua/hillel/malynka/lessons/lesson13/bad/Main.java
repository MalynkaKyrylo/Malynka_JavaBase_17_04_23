package ua.hillel.malynka.lessons.lesson13.bad;

import ua.hillel.malynka.lessons.lesson13.good.participant.Participant;

public class Main {

    public static void main(String[] args) {

        ObstaclePool obstaclePool = new ObstaclePool();
        ObstacleWall obstacleWall = new ObstacleWall();

//        ParticipantCat participantCat = new ParticipantCat("Tom");
        ParticipantDog participantDog = new ParticipantDog("Bobik");
        ParticipantRabbit participantRabbit = new ParticipantRabbit("Buny");


//        obstaclePool.start(participantCat);
        obstaclePool.start(participantDog);
        obstaclePool.start(participantRabbit);

//        obstacleWall.start(participantCat);
        obstacleWall.start(participantDog);
        obstacleWall.start(participantRabbit);

    }


}