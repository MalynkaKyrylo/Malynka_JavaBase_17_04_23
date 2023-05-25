package ua.hillel.malynka.lessons.lesson13.homework;

public class RockMusic extends MusicStyles{
    public RockMusic(String name) {
        super(name);
    }
    @Override
    public void playMusic() {
        System.out.println("Play rock music, band: "+name);
    }
}
