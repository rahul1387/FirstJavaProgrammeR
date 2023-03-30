package com.company;

import java.util.Scanner;

public class TakingInput {
    public static void main(ST[] args) {
        System.out.println("Taking Input from User");
        Scanner sc =new Scanner(System.in);
//        System.out.println("Enter Number 1");
//        int a = sc.nextInt();
//        System.out.println("Enter Number 2");
//        int b = sc.nextInt();
//        int sum=a+b;
//        System.out.println("The Sum These Numbers is");
//        System.out.println(sum);
        boolean b1 = sc.hasNextInt();
        System.out.println(b1);
        //hasnextint detemines that the value is int or not\
        //if not then boolean will give output like true or Flase
//        int i=7;
//        while (i<8) {
//            ;
//            System.out.println("Please Enter Greater Number");
//
//        }
//        String str= sc.nextLine();
//        System.out.println(str);


    }
}
