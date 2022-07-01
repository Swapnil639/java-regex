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
        System.out.print("Enter Mobile Number :");
        String mobileNumber = scanner.next();
        System.out.println(Pattern.matches("[+]91-[0-9]{10}", mobileNumber));
        System.out.print("Enter Password :");
        String password = scanner.next();
        System.out.println(Pattern.matches("[A-Z a-z]{8,}", password));
        System.out.print("Use at least one Upper case in the Password :");
        String password1 = scanner.next();
        System.out.println(Pattern.matches("[A-Z][A-Z a-z]{8,}", password1));
        System.out.print("use at least one numeric number in the password");
        String password2=scanner.next();
        System.out.println(Pattern.matches("[A-z a-z 0-9]{8,}[0-9]{1,}",password2));
        System.out.print("Use at least one special character in the password  :");
        String passWord3=scanner.next();
        System.out.println(Pattern.matches("(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$ %^&*-]).{8,}",passWord3));

        System.out.println("...................................................................");
        System.out.println(" ");

        System.out.println("Valid EmailIDs following below :");
        System.out.println(" ");

        boolean emailSample1 = Pattern.matches("[a-z]{3,}@[a-z]{2,}.[a-z]{3,},", "abc@yahoo.com,");
        System.out.println("EmailID sample1 :" + emailSample1);
        boolean emailSample2 = Pattern.matches("[a-z]{3,}-\\d{2,}@[a-z]{2,}.[a-z]{3,},", "abc-100@yahoo.com,");
        System.out.println("EmailID Sample2 :" +emailSample2);
        boolean emailSample3 = Pattern.matches("[a-z]{3,}.\\d{2,}@[a-z]{2,}.[a-z]{3,}", "abc.100@yahoo.com");
        System.out.println("EmailID Sample3 :" + emailSample3);
        boolean emailSample4 = Pattern.matches("[a-z]{3,}\\d{2,}@[a-z]{2,}.[a-z]{3,}", "abc111@abc.com");
        System.out.println("EmailID Sample4 :" + emailSample4);
        boolean emailSample5 = Pattern.matches("[a-z]{3,}-\\d{2,}@[a-z]{2,}.[a-z]{3,},", "abc-100@abc.net,");
        System.out.println("EmailID Sample5 :" + emailSample5);
        boolean emailSample6 = Pattern.matches("[a-z]{3,}.\\d{2,}@[a-z]{2,}.[a-z]{3,}.[a-z]{2,}", "abc.100@abc.com.au");
        System.out.println("EmailID Sample6 :" + emailSample6);
        boolean emailSample7 = Pattern.matches("[a-z]{3,}@\\d.[a-z]{2,}", "abc@1.com");
        System.out.println("EmailID Sample7 :" + emailSample7);
        boolean emailSample8 = Pattern.matches("[a-z]{3,}@[a-z]{2,}.[a-z]{3,}.[a-z]{3,}", "abc@gmail.com.com");
        System.out.println("EmailID Sample8 :" + emailSample8);
        boolean emailSample9 = Pattern.matches("[a-z]{3,}[+]\\d{2,}@[a-z]{2,}.[a-z]{3,}", "abc+100@gmail.com");
        System.out.println("EmailID Sample9 :" + emailSample9);

        System.out.println("............................................................................");
        System.out.println(" ");

        System.out.println("Invalid EmailIDs following below :");
        System.out.println(" ");

        boolean emailIDSample1 = Pattern.matches("[a-z]{4,}@[a-z].[a-z]{2,}", "abc");  // must contains “@” symbol
        System.out.println("EmailID Sample1 :" + emailIDSample1);
        boolean emailIDSample2 = Pattern.matches("[a-z]{3,}@[a-z]{2,}.[a-z]{2,}", "abc@.com.my"); //tld can not start with dot “.”
        System.out.println("EmailID Sample2 :" + emailIDSample2);
        boolean emailIDSample3 = Pattern.matches("[a-z\\d]{3,}@[a-z]{2,}.[a-z]", "abc123@.gmail.a");// “.a” is not a valid tld, last tld must contain at least two characters
        System.out.println("EmailID Sample3 :" + emailIDSample3);
        boolean emailIDSample4 = Pattern.matches("[a-z\\d]{3,}@[a-z]{2,}.[a-z]{2,}", "abc123@.com"); // tld can not start with dot “.”
        System.out.println("EmailID Sample4 :" + emailIDSample4);
        boolean emailIDSample5 = Pattern.matches("[a-z\\d]{3,}@[a-z]{2,}.[a-z]{2,}", "abc123@.com.com");//tld can not start with dot “.”
        System.out.println("EmailID Sample5 :" + emailIDSample5);
        boolean emailIDSample6 = Pattern.matches("[a-z]{3,}@[a-z]{2,}.[a-z]{2,}", ".abc@abc.com"); //email’s 1st character can not start with “.”
        System.out.println("EmailID Sample6 :" + emailIDSample6);
        boolean emailIDSample7 = Pattern.matches("[a-z]{3,}@[a-z]{3,}.[a-z]{2,}", "abc()*@gmail.com");//email’s is only allow character, digit, underscore and dash
        System.out.println("EmailID Sample7 :" + emailIDSample7);
        boolean emailIDSample8 = Pattern.matches("[a-z]{3,}@[a-z]{3,}.[a-z]{2,}", "abc@%*.com");// email’s tld is only allow character and digit
        System.out.println("EmailID Sample8 :" + emailIDSample8);
        boolean emailIDSample9 = Pattern.matches("[a-z\\d]{3,}@[a-z]{3,}.[a-z]{2,}", "abc..2002@gmail.com");//double dots “.” are not allow
        System.out.println("EmailID Sample9 :" + emailIDSample9);
        boolean emailIDSample10 = Pattern.matches("[a-z]{3,}@[a-z]{2,}.[a-z]{2,}", "abc.@gmail.com");// email’s last character can not end with dot “.”
        System.out.println("EmailID Sample10 :" + emailIDSample10);
        boolean emailIDSample11 = Pattern.matches("[abc]{3,}@[a-z]{2,}.[a-z]{2,}", "abc@abc@gmail.com");//double “@” is not allow
        System.out.println("EmailID Sample11 :" + emailIDSample11);
        boolean emailIDSample12 = Pattern.matches("[a-z]{3,}@[a-z]{2,}.[a-z]{3,}.[a-z]{2,}", "abc@gmail.com.1a");//email’s tld which has two characters can not contains digit
        System.out.println("EmailID Sample12 :" + emailIDSample12);
        boolean emailIDSample13 = Pattern.matches("[abc]{3,}@[a-z]{2,}.[a-z]{3,}.[a-z]{2,}", "abc@gmail.com.aa.au");//cannot have multiple email’s tld
        System.out.println("EmailID Sample13 :" + emailIDSample13);
    }
}
