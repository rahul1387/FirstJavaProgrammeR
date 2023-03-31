package com.company;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {

        int shouldExit = 1;
        int age;
        Scanner sc=new Scanner(System.in);


        String name;

        System.out.print("Enter your Age:");
        age=sc.nextInt();

//            System.out.println("What is your name?");

           switch (age){

                case 18:
                    System.out.println("You are Going To become Adult!");
                    break;
                case 23:
                    System.out.println("You are going To join a Job");
                    break;
                case 60:
                    System.out.println("You are going to get retired!");
                    break;
                case 100:
                    System.out.println("You are going to Die!!");

                default:
                    System.out.println("You Enjoy Your Life!!");

                    System.out.print(" Would u  like to continue if yes(press 1) to exit (press 0): ");
                    shouldExit=sc.nextInt();

        }

    }

    }

