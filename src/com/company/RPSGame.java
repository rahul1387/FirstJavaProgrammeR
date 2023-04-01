package com.company;

import java.util.Random;
import java.util.Scanner;

public class RPSGame {
    public static void main(String[] args) {
        //0 for Rock
        //1 for Paper
        //2 for Scissor

        Scanner sc = new Scanner(System.in);
        int shouldExist=1;
        while (shouldExist == 1) {
            System.out.print("Enter 0 for Rock,Enter 1 for Paper,Enter 2 for Scissor:");
            int UserInput = sc.nextInt();

            Random rd = new Random();
            int computerInput = rd.nextInt(3);

            if (UserInput == computerInput) {
                System.out.println("Draw");
            } else if (UserInput == 0 && computerInput == 2 || UserInput == 1 && computerInput == 0
                    || UserInput == 2 && computerInput == 1) {
                System.out.println("You Win!");
            } else {
                System.out.println("Computer Win!");
            }
            System.out.println("Computer Choice: " + computerInput);
            System.out.println("Do You Want to Play Again if yes(press 1) to exit (press 0):");
            shouldExist = sc.nextInt();

        }
    }

}
