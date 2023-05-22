package ua.hillel.malynka.lessons.lesson12.homework;

public class Main {
    public static void main(String[] args) {
        FitnessTrackerUser user1 = new FitnessTrackerUser("Alex", 10, 12, 1990, "alex@mail.com", "2323232333", "Johnson", 68.2, 120, 5000);
        FitnessTrackerUser user2 = new FitnessTrackerUser("Den", 20, 2, 1998, "den@mail.com", "457456256", "Williamson", 80.6, 125, 4000);
        FitnessTrackerUser user3 = new FitnessTrackerUser("John", 10, 4, 1986, "john@mail.com", "2472467247", "Richardson", 60.1, 110, 7000);
        FitnessTrackerUser user4 = new FitnessTrackerUser("Rick", 10, 6, 1974, "rick@mail.com", "247524624", "Douson", 75.3, 122, 6000);
        FitnessTrackerUser user5 = new FitnessTrackerUser("Will", 10, 8, 2002, "will@mail.com", "24572457247", "Johansson", 94.2, 130, 3000);
        user1.printAccountInfo();
        user2.printAccountInfo();
        user3.printAccountInfo();
        user4.printAccountInfo();
        user5.printAccountInfo();


        user1.setWeight(65.0);
        user1.setPressure(118);
        user1.setStepsPerDayCount(6000);
        user3.setWeight(62.0);
        user3.setPressure(115);
        user3.setStepsPerDayCount(6000);
        user5.setWeight(90.0);
        user5.setPressure(125);
        user5.setStepsPerDayCount(6000);

        System.out.println("\nAfter changes");
        user1.printAccountInfo();
        user2.printAccountInfo();
        user3.printAccountInfo();
        user4.printAccountInfo();
        user5.printAccountInfo();
    }
}
