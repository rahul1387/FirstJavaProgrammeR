package com.company;

import java.util.Scanner;
public class Calcutate_Age {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your birth year: ");
        int birthYear = input.nextInt();

        int currentYear = java.time.Year.now().getValue();
        int age = currentYear - birthYear;

        System.out.println("Your age is " + age);


    }
}
