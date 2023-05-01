package ua.hillel.malynka.lessons.lesson8;

import java.util.Arrays;

public class Lottery {
    public static void main(String[] args) {
        int quantityLotteryNumbers = 7;
        int maxLotteryNumber = 9;
        int[] randomLottery = new int[quantityLotteryNumbers];
        int[] randomPlayer = new int[quantityLotteryNumbers];
        for (int i = 0; i < quantityLotteryNumbers; i++) {
            randomLottery[i] = (int)(Math.random()*(maxLotteryNumber+1));
            randomPlayer[i] = (int)(Math.random()*(maxLotteryNumber+1));
        }
        System.out.println("Загаданные числа до сортировки");
        System.out.println("Загаданные числа лотереи: "+Arrays.toString(randomLottery));
        System.out.println("Загаданные числа игроком: "+Arrays.toString(randomPlayer));
        Arrays.sort(randomLottery);
        Arrays.sort(randomPlayer);
        System.out.println("Загаданные числа лотереи по возрастанию: "+Arrays.toString(randomLottery));
        System.out.println("Загаданные числа игроком по возрастанию: "+Arrays.toString(randomPlayer));
        int countEquals = 0;
        for (int i = 0; i < quantityLotteryNumbers; i++) {
            if (randomPlayer[i] == randomLottery[i]) {
                countEquals++;
            }
        }
        if (countEquals==0) {
            System.out.println("Совпадений нет");
        } else {
            System.out.println("Количество совпадений: "+countEquals);
            int[] indexNumEquls = new int[countEquals];
            int j=0;
            for (int i = 0; i < quantityLotteryNumbers; i++) {
                if (randomPlayer[i] == randomLottery[i]) {
                    indexNumEquls[j]=i+1;
                    j++;
                }
            }
            System.out.println("Совпадают числа: "+Arrays.toString(indexNumEquls));
        }
    }
}
