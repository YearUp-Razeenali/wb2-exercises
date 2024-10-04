package com.pluralsight;

import java.text.SimpleDateFormat;
import java.util.*;

public class TheaterReservations {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        String[] name = prompt_for_string("Please enter your name: ").split(" ");
        String date_entered = prompt_for_string("What date will you be coming (MM/dd/yyyy): ");
        int tickets = Integer.parseInt(prompt_for_string("How many tickets would you like? "));

        // Format the date to yyyy-MM-dd
        SimpleDateFormat inputDateFormat = new SimpleDateFormat("MM/dd/yyyy");
        SimpleDateFormat outputDateFormat = new SimpleDateFormat("yyyy-MM-dd");

        String formattedDate = reformatDate(date_entered);

        //System.out.println(formattedDate);

        String lastName = name[1];
        String firstName = name[0];

        System.out.printf("%d tickets reserved for %s under %s, %s%n", tickets, formattedDate, lastName, firstName);

    }

    public static String prompt_for_string(String prompt){
        System.out.print(prompt);
        return scanner.nextLine();
    }

    public static String reformatDate(String date) {
        String[] dateParts = date.split("/"); // Split date by "/"
        return dateParts[2] + "-" + dateParts[0] + "-" + dateParts[1]; // Return in yyyy-MM-dd format
    }

}

