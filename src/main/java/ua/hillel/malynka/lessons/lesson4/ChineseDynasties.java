package ua.hillel.malynka.lessons.lesson4;

public class ChineseDynasties {
    public static void main(String[] args) {
        int attackPowerWarriorLi = 13;
        int attackPowerArcherLi = 24;
        int attackPowerRiderLi = 46;
        int attackPowerWarriorMing = 9;
        int attackPowerArcherMing = 35;
        int attackPowerRiderMing = 12;
        int quantityEachTypeWarLi = 860;
        double quantityEachTypeWarMing = quantityEachTypeWarLi*1.5;
        double attackPowerArmyLi = (attackPowerWarriorLi+attackPowerArcherLi+attackPowerRiderLi)*quantityEachTypeWarLi;
        double attackPowerArmyMing = (attackPowerWarriorMing+attackPowerArcherMing+attackPowerRiderMing)*quantityEachTypeWarMing;
        System.out.println("Загальний показник атаки армії Лі = "+attackPowerArmyLi);
        System.out.println("Загальний показник атаки армії Мінь = "+attackPowerArmyMing);

    }
}
