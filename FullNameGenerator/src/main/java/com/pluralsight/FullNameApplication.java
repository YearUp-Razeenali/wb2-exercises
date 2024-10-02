package com.pluralsight;

import java.util.*;

public class FullNameApplication {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Please enter your name");
        String first_name = add_one_space(prompt_for_String("First name: ").trim());
        String second_name = add_one_space(prompt_for_String("Middle name: ").trim());
        String last_name = prompt_for_String("Last name: ").trim();
        String suffix = add_one_space(prompt_for_String("Suffix: ").trim());

        System.out.println("Full name: " + full_name(first_name,second_name,last_name,suffix));
    }


    public static String prompt_for_String(String prompt){
        System.out.print(prompt);
        String name = scanner.nextLine();
        return name;
    }

    public static String full_name(String first, String middle, String last, String suf){
        if(!suf.isEmpty()) {
            return first + middle + last + ", " + suf;
        }else return first + middle + last;
    }

    public static String add_one_space(String name){
        if(!name.isEmpty()){
            return name = name + " ";
        }
        return name;
    }
}
