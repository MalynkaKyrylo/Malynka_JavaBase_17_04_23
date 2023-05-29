package ua.hillel.malynka.lessons.lesson14.homework;

public class Main {
    public static void main(String[] args) {
        Androids android = new Androids();
        Iphones iphone = new Iphones();

        android.startLinuxOS();
        android.call();
        android.sms();
        android.internet();

        System.out.println();

        iphone.startIOS();
        iphone.call();
        iphone.sms();
        iphone.internet();
    }
}
