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
        String BillingStreet = input.nextLine();

        System.out.println("Billing City: ");
        String BillingCity = input.nextLine();

        System.out.println("Billing State: ");
        String BillingState = input.nextLine();

        System.out.println("Billing zip: ");
        String BillingZip = input.nextLine();


        // Shipping address
        System.out.println("Shipping Street: ");
        String shippingStreet = input.nextLine();

        System.out.println("Shipping City: ");
        String shippingCity = input.nextLine();

        System.out.println("Shipping State: ");
        String ShippingState = input.nextLine();

        System.out.println("Shipping zip: ");
        String shippingZip = input.nextLine();
    }
}
