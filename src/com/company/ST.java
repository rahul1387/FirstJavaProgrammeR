package com.company;

import java.util.Scanner;

public class ST{
    public static void main(String[] args) {

           // String name=new String("Rahul");
          // java.lang.String name="Rahul";
         // System.out.println("The Name is: ");
        // System.out.format(name);

        int a = 6;
        float b = 5.363f;
        System.out.printf("The value of a is %d and value of b is %8.3f",a,b);

       // System.out.format("The value of a is %d and value of b is %f",a,b); USED FOR SAME
        //%d indicates Format Specifier
        //%f Is Used For Float

        Scanner sc = new Scanner (System.in);
        String st=sc.nextLine();
        System.out.println(st);

    }
}
