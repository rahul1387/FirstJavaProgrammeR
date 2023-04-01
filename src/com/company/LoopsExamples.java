package com.company;

import java.util.Scanner;

public class LoopsExamples {
    public static void main(String[] args) {

        //This Will Print All Odd Numbers Till 100
//        for (int i=0; i<50; i++)
//        {
//            System.out.println(2*i+1);
//        }
        Scanner sc = new Scanner(System.in);
        int input;
        int shouldExist=1;

        while (shouldExist==1) {
            do {
                System.out.print("Please enter an integer: ");
            }while (!sc.hasNextInt()); {
                    System.out.print("That's not a valid integer. Please enter another integer: ");
                    sc.next(); // discard invalid input
                }
                input = sc.nextInt();
            while (input < 0 || input > 100);

            System.out.println("You entered the integer " + input + ".");
            System.out.println("Would you like continue If yes (press 1) If no then(press 2)");
            shouldExist= sc.nextInt();
        }

    }
}
