package ua.hillel.malynka.lessons.lesson13.good.obstacle;

import ua.hillel.malynka.lessons.lesson13.good.participant.Participant;

public class ObstaclePool extends Obstacle {

    @Override
    public void start(Participant participant) {
        System.out.println(participant.getName() + " start swim");
    }
}