package com.company;

import java.util.Scanner;

public class Recursion {
    //Factorial(n) = n * n-1 *....1
    //Factorial(4) = 4 * 3 * 2 * 1 = 24
    //Factorial(n) = n * Factorial(n-1)
    //Factorial(0) = 1
    static int factorial(int n){
        if (n==1 || n==0){
            return 1;
        }
        else {
            return n * factorial(n-1);
        }
    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = scanner.nextInt();

        System.out.println("The value of factorial: " + factorial(num));
    }
}
