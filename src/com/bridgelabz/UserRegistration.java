package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to user registration program using regex");
        System.out.print("Enter First Name :");
        String firstName = scanner.next();
        System.out.println(Pattern.matches("[A-Z][a-z]{3,}", firstName));
        System.out.print("Enter Last Name :");
        String lastName = scanner.next();
        System.out.println(Pattern.matches("[A-Z][a-z]{3,}", lastName));
        System.out.print("Enter Email :");
        String email = scanner.next();
        System.out.println(Pattern.matches("[a-z][A-Z a-z 0-9]+[@][a-z]+[.][a-z]{2,5}", email));
        System.out.println("Enter Mobile Number :");
        String mobileNumber = scanner.next();
        System.out.println(Pattern.matches("[+]\\d{2}-\\d{10}", mobileNumber));
        System.out.println("Enter Password :");
        String password = scanner.next();
        System.out.println(Pattern.matches("[A-Z a-z]{8,}", password));
        System.out.println("At least one Upper case in Password :");
        String password1 = scanner.next();
        System.out.println(Pattern.matches("[A-Z][A-Z a-z 0-9]{8,}", password1));
    }
}
