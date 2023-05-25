package ua.hillel.malynka.lessons.lesson13.homework;


public class Main {
    public static void main(String[] args) {
        MusicStyles[] musicBands = {
                new ClassicMusic("Beethoven"),
                new ClassicMusic("Tchaikovskiy"),
                new PopMusic("N Sync"),
                new PopMusic("BsB"),
                new RockMusic("Queen"),
                new RockMusic("Nirvana"),
        };
        for (MusicStyles musicBand : musicBands ) {
            musicBand.playMusic();
        }
    }
}
