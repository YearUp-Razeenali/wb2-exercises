package com.pluralsight;

import java.util.*;

public class AddressBuilder {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        System.out.println("Please provide the following information: ");
        String full_name = prompt_for_string("Full name: ");

        StringBuilder Billing_address = new StringBuilder();
        Billing_address.append(prompt_for_string("Billing Street: ").trim()).append(" ");
        Billing_address.append(prompt_for_string("Billing City: ").trim()).append(", ");
        Billing_address.append(prompt_for_string("Billing State: ").trim()).append(" ");
        Billing_address.append(prompt_for_string("Billing Zip: ").trim());

        System.out.println();

        StringBuilder shipping_address = new StringBuilder();
        shipping_address.append(prompt_for_string("Shipping Street: ").trim()).append(" ");
        shipping_address.append(prompt_for_string("Shipping City: ").trim()).append(", ");
        shipping_address.append(prompt_for_string("Shipping State: ").trim()).append(" ");
        shipping_address.append(prompt_for_string("Shipping Zip: ").trim());

        System.out.println();

        String myBillAddress = Billing_address.toString();
        String myShipAddress = shipping_address.toString();

        System.out.println("---------------------------------");

        System.out.println(full_name);
        System.out.println();

        System.out.println("Billing Address: \n" + myBillAddress);
        System.out.println();
        System.out.println("Shipping Address: \n" + myShipAddress);
    }

    public static String prompt_for_string(String prompt){
        System.out.print(prompt);
        return scanner.nextLine();
    }

}
