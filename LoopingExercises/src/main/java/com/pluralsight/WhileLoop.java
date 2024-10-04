package com.pluralsight;

public class WhileLoop {
    public static void main(String[] args) throws InterruptedException{
        int i = 0;

        while(i < 5){
            System.out.println("I love Java");
            Thread.sleep(1000);
            i += 1;
        }

    }

}
