package ua.hillel.malynka.lessons.lesson13.homework;

public class ClassicMusic extends MusicStyles{

    public ClassicMusic(String name) {
        super(name);
    }
    @Override
    void playMusic() {
        System.out.println("Play classic music composer: " + name);
    }
}
