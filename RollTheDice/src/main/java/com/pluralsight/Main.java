package com.pluralsight;

public class Main {
    public static void main(String[] args) {

        Dice dice = new Dice();

        int roll1, roll2;
        int twoCounter = 0, fourCounter = 0, sixCounter = 0, sevenCounter= 0;

//        System.out.println(dice.roll());

        for(int i = 0; i < 100; i++){

            roll1 = dice.roll();
            roll2 = dice.roll();
            int sum = roll1 + roll2;

            System.out.printf("Roll 1:   %s   -   %s   Sum:   %s\n", roll1,roll2,sum);

            if(sum == 2) twoCounter += 1;
            if(sum == 4) fourCounter += 1;
            if(sum == 6) sixCounter += 1;
            if(sum == 7) sevenCounter += 1;

        }

        System.out.println("------------------------------------------");

        System.out.printf("The total number of times the sum of two rolls was 2 was: %s\n", twoCounter);
        System.out.printf("The total number of times the sum of two rolls was 4 was: %s\n", fourCounter);
        System.out.printf("The total number of times the sum of two rolls was 6 was: %s\n", sixCounter);
        System.out.printf("The total number of times the sum of two rolls was 7 was: %s\n", sevenCounter);
    }
}