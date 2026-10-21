package com.pluralsight;

import java.util.Scanner;

public class AddressBuilder {
    public static void main(String[] args) {
        System.out.println("====Please provide the following information====");
        Scanner input =new Scanner(System.in);
        System.out.println("Full name: ");
        String fullName = input.nextLine();

        // billing address
        System.out.println("Billing Street: ");
        String billingStreet = input.nextLine();

        System.out.println("Billing City: ");
        String billingCity = input.nextLine();

        System.out.println("Billing State: ");
        String billingState = input.nextLine();

        System.out.println("Billing zip: ");
        String billingZip = input.nextLine();


        // Shipping address
        System.out.println("Shipping Street: ");
        String shippingStreet = input.nextLine();

        System.out.println("Shipping City: ");
        String shippingCity = input.nextLine();

        System.out.println("Shipping State: ");
        String shippingState = input.nextLine();

        System.out.println("Shipping zip: ");
        String shippingZip = input.nextLine();


        //using sting builder
        StringBuilder address = new StringBuilder();
        address.append("Billing Address: \n\n");
        address.append("Street:").append(billingStreet).append("\n");
        address.append("City:").append(billingCity).append("\n");
        address.append("State:").append(billingState).append("\n");
        address.append("Zip:").append(billingZip).append("\n\n");


        address.append("Shipping Address: \n\n");
        address.append("Street:").append(shippingStreet).append("\n");
        address.append("City:").append(shippingCity).append("\n");
        address.append("State:").append(shippingState).append("\n");
        address.append("Zip:").append(shippingZip).append("\n\n");

        String finalAddress = address .toString();
        System.out.println(finalAddress);

    }
}
