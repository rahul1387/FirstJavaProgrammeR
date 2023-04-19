package com.company;

import java.util.Scanner;

public class PracticeSet1 {
    public static void main(String[] args) {
//        System.out.println(13%2);


        Scanner sc=new Scanner(System.in);
//        int numberedEntered;
//        System.out.print("Enter the end number: ");
//        numberedEntered=sc.nextInt();
//
//        int []evenNumbers= new int[numberedEntered/2];
//        for (int i=1; i<=numberedEntered; i++){
//            if (i%2==0){
//                int arrayLength = evenNumbers.length;
//            }
//        }

        //Example1
//       int Getout = 1;
//       while (Getout==1) {
//           System.out.print("Please enter first integer: ");
//           int a = sc.nextInt();
//           System.out.print("Please enter  second integer: ");
//           int b = sc.nextInt();
//
//           int sum = a + b;
//           System.out.println("The sum of these is: " + sum);
//           System.out.println("The difference is: " + (a - b));
//
//           System.out.println("The product is: " + (a * b));
//
//           System.out.println("The quotient is: " + (a / b));
//
//           System.out.println("Would you like to continue (press 1) or want to exit(press 0)");
//           Getout = sc.nextInt();
//       }
                //Example2
                Scanner input = new Scanner(System.in);
                System.out.print("Please enter a sentence: ");
                String sentence = input.nextLine().toLowerCase();
                int count = 0;
                for (int i = 0; i < sentence.length(); i++) {
                    char c = sentence.charAt(i);
                    if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                        count++;
                    }
                }
                System.out.println("Number of vowels: " + count);

    }

}
