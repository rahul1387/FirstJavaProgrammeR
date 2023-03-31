package com.company;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args) {
            int age;
        Scanner sc = new Scanner (System.in);
//        System.out.println("Enter Your Age:");
//        age=sc.nextInt();
//        boolean condition = (age>19);

//            if(age<1 || age>140){
//                System.out.println("Invalid Age!");
//            } else if (age>19) {
//                System.out.println("Yes boy You can drive!");
//
//            } else {
//                System.out.println("No Boy You Can't Drive!");
//            }

            boolean a = true;
            boolean b = false;

            //condition should be True if not then it will print False

        //FOR AND--->(&&)
            if (a&&b) {
                System.out.println("Y");//Y is True
            }
            else {
                System.out.println("N");//N is False
            }

        //FOR OR-->(||)
        if (a || b) {
            System.out.println("Y");//Y is True
        }
        else {
            System.out.println("N");//N is False
        }

        //FOR NOT-->(!)
        System.out.print("Not (A)...");
        System.out.println(!a);
        System.out.print("Not (B)...");
        System.out.println(!b);

    }
}
