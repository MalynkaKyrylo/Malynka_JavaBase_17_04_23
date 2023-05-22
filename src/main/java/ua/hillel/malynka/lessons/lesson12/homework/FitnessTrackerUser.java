package ua.hillel.malynka.lessons.lesson12.homework;

public class FitnessTrackerUser {

    private final String name;
    private final int dayBirth;
    private final int monthBirth;
    private final int yearBirth;
    private final String email;
    private final String telNumber;
    private String surName;
    private double weight;
    private int pressure;
    private int stepsPerDayCount;
    private int age;

    public FitnessTrackerUser(String name, int dayBirth, int monthBirth, int yearBirth, String email, String telNumber,
                              String surName, double weight, int pressure, int stepsPerDayCount) {
        this.name = name;
        this.dayBirth = dayBirth;
        this.monthBirth = monthBirth;
        this.yearBirth = yearBirth;
        this.email = email;
        this.telNumber = telNumber;
        this.surName = surName;
        this.weight = weight;
        this.pressure = pressure;
        this.stepsPerDayCount = stepsPerDayCount;
        age = 2023 - yearBirth;
    }
    public String getName() {
        return name;
    }
    public int getDayBirth() {
        return dayBirth;
    }
    public int getMonthBirth() {
        return monthBirth;
    }
    public int getYearBirth() {
        return yearBirth;
    }
    public String getEmail() {
        return email;
    }public String getTelNumber() {
        return telNumber;
    }
    public String getSurName() {
        return surName;
    }
    public double getWeight() {
        return weight;
    }
    public int getPressure() {
        return pressure;
    }
    public int getStepsPerDayCount() {
        return stepsPerDayCount;
    }
    public int getAge() {
        return age;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }
    public void setWeight(double weight) {
        if (weight <= 0) {
            System.out.println("Wrong data! Weight must be >0");
        } else {
            this.weight = weight;
        }
    }
    public void setPressure(int pressure) {
        if (pressure <= 0) {
            System.out.println("Wrong data! Weight must be >0");
        } else {
            this.pressure = pressure;
        }
    }
    public void setStepsPerDayCount(int stepsPerDayCount) {
        if (stepsPerDayCount < 0) {
            System.out.println("Wrong data! Steps per day must be >=0");
        } else {
            this.stepsPerDayCount = pressure;
        }
    }
    void printAccountInfo() {
        System.out.println("Name: '" + getName() + '\'' +
                ", day of birth: " + getDayBirth() +
                ", month of birth: " + getMonthBirth() +
                ", year of birth: " + getYearBirth() +
                ", age: " + getAge() +
                ", email: " + getEmail() +
                ", telephone number: " + getTelNumber() +
                ", Surname: '" + getSurName() + '\'' +
                ", weight: " + getWeight() +
                ", pressure: " + getPressure() +
                ", Steps per day: " + getStepsPerDayCount());
    }

}
