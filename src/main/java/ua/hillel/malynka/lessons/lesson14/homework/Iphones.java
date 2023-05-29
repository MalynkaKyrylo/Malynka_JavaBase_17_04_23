package ua.hillel.malynka.lessons.lesson14.homework;

public class Iphones implements Smartphones, IOS {
    @Override
    public void startIOS() {
        System.out.println("Start iOS");
    }

    @Override
    public void call() {
        System.out.println("call on iPhone");
    }

    @Override
    public void sms() {
        System.out.println("sms on iPhone");
    }

    @Override
    public void internet() {
        System.out.println("internet on iPhone");
    }
}
