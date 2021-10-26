package com.bridgelabz_logicalproblems;

import java.util.Scanner;

public class Address {
    public static String firstname = " ";
    public static String secondname = " ";
    static String addressOfCity = " ";

    public static void main(String[] args) {
        System.out.println("Enter your first name");
        Scanner s = new Scanner(System.in);
        firstname = s.nextLine();
        System.out.println("enter your second name");
        secondname = s.nextLine();
        System.out.println("Enter the address");
        addressOfCity = s.nextLine();


    }
}