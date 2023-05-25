package ua.hillel.malynka.lessons.lesson13.homework;

public abstract class MusicStyles {
    protected String name;

    public MusicStyles(String name) {
        this.name = name;
    }
    abstract void playMusic();
}
