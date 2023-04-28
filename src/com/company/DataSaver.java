package com.company;

import java.util.Objects;
import java.util.Scanner;

public class DataSaver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        String exit = ">";
        int another = 1;
       while (another==1) {
           System.out.print("The your name here: ");
           String a = sc.next();
           System.out.println("Hello " + a);
           System.out.print("Enter your age: ");
           int age = sc.nextInt();
           System.out.println("Data saved thank you!!");
           System.out.print("Would you like to check your data (press *) if want to exit (press >): ");
           String st = sc.next();
           if (Objects.equals(st, "*"))
           {
               System.out.println("This is your data " + "Name: " + a + "," + " Age: " + age);
           }
           System.out.print("Would you like to add another (press 1) if no (press 0)");
           another = sc.nextInt();
       }
    }

}
