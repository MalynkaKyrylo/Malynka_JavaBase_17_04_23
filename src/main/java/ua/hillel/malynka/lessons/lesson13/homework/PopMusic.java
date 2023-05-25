package ua.hillel.malynka.lessons.lesson13.homework;

public class PopMusic extends MusicStyles{

    public PopMusic(String name) {
        super(name);
    }
    @Override
    void playMusic() {
        System.out.println("Play pop music band: "+name);
    }
}
