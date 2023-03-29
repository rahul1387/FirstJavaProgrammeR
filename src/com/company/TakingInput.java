package com.company;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class TakingInput {
    public static void main(String[] args) {
        System.out.println("Taking Input from User");
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Number 1");
        int a = sc.nextInt();
        System.out.println("Enter Number 2");

        int b = sc.nextInt();
        int sum=a+b;
        System.out.println("The Sum These Numbers is");
        System.out.println(sum);


    }
}
