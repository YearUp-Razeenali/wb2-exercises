package com.pluralsight;

public class DoWhileLoop {
    public static void main(String[] args) throws InterruptedException{
    int i = 0;

    do{
        System.out.println("I love Java");
        Thread.sleep(1000);
        i += 1;
    }
    while(i < 5);

    }


}
