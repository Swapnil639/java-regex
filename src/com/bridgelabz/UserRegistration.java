package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to user registration program using regex");
        System.out.print("Enter First Name :");
        String firstName=scanner.next();
        System.out.println(Pattern.matches("[A-Z][a-z]{3,}",firstName));
        System.out.print("Enter Last Name :");
        String lastName=scanner.next();
        System.out.println(Pattern.matches("[A-Z][a-z]{3,}",lastName));
    }
}
