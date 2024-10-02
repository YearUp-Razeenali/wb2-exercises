package com.pluralsight;

import java.util.*;

public class FullNameParser {

    static Scanner scanner = new Scanner(System.in);

   public static void main(String[] args) {

       System.out.print("Please enter you name: ");
       String full_name = scanner.nextLine().trim();

       String[]  names = full_name.split("\\s+");

       if(names.length == 2){
           System.out.println("First name: " + names[0]);
           System.out.println("Middle name: None" );
           System.out.println("Last name: " + names[1]);
       }else{
           System.out.println("First name: " + names[0]);
           System.out.println("Middle name: " + names[1] );
           System.out.println("Last name: " + names[2]);
       }


    }
}
