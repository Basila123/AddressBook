package com.bridgelabz_logicalproblems;

import java.util.Scanner;

public class Address {
    public static String firstname = " ";
    public static String secondname = " ";
    static String addressOfCity = " ";
    static int phone= 0;
    static String city=" ";
    static int zip=0;
    static String email=" ";
    static String state=" ";


    public static void main(String[] args) {
        System.out.println("Enter your first name");
        Scanner s = new Scanner(System.in);
        firstname = s.nextLine();
        System.out.println("enter your second name");
        secondname = s.nextLine();
        System.out.println("Enter the address");
        addressOfCity = s.nextLine();
        System.out.println("Enter your city");
        city=s.nextLine();
        System.out.println("Enter your phone number");
        phone=s.nextInt();
        System.out.println("Enter your state");
        state=s.nextLine();





    }
}