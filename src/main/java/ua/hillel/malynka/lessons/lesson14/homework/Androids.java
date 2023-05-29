package ua.hillel.malynka.lessons.lesson14.homework;

public class Androids implements Smartphones, LinuxOS {
    @Override
    public void startLinuxOS() {
        System.out.println("Start LinuxOS");
    }

    @Override
    public void call() {
        System.out.println("call on Android");
    }

    @Override
    public void sms() {
        System.out.println("sms on Android");
    }

    @Override
    public void internet() {
        System.out.println("internet on Android");
    }
}
