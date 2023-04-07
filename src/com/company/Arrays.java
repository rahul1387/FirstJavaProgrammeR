package com.company;

public class Arrays {
    public static void main(String[] args) {

        /*Classroom of 500 students - You have to store marks of these 500 students
        You have two Options;
        1. Create 500 Variables
        2. Use Arrays (recommended)
         */
//        int [] marks = new int[5];
//        marks[0] = 100;
//        marks[1] = 66;
//        marks[2] = 70;
//        marks[3] = 80;
//        marks[4] = 96;
//        //marks[5] = 96; ---> It Will give error
//        System.out.println(marks[4]);


        //
        // String [] students ={"Rahul","Neeraj","Raj","Rohan"};
//        System.out.println(students.length);
//        System.out.println(students[2]);

        int [] marks = {12,52,26,96,89};
//        System.out.println(marks.length);
//        System.out.println(marks[2]);

        //Displaying the Array (Naive way)
        System.out.println("Printing using Naive way");
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);

        //Displaying the Array (for loop)
        System.out.println("Printing using for loop");
        for (int i=0; i<marks.length; i++)
        {
            System.out.println(marks[i]);
        }

        //Quick Quiz: Displaying the Array in Reverse Order (for loop)
        System.out.println("Printing using for loop in Reverse Order ");
        for (int i=marks.length-1; i>=0; i--)
        {
            System.out.println(marks[i]);
        }
        //Displaying the Array (for-each loop)
        System.out.println("Printing using for-each loop");
        for (int element: marks)
        {
            System.out.println(element);
        }
    }
}
