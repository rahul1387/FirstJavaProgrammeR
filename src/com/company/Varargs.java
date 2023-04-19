package com.company;
public class Varargs {
//    static int sum (int a,int b){
//        return a+b;
//    }
//    static int sum (int a,int b,int c){
//        return a+b+c;
//    }
    static int sum(int ...arr){
        // Available for int []arr;
        int code =0;
        for (int element:arr) {
            code += element;
        }
        return code;
    }
    public static void main(String[] args) {
        System.out.println("The sum of 4,5 and 3 is: " + sum(4,5,3));
        System.out.println("The sum of 9,5 and 6 is: " + sum(9,5,6));
        System.out.println("The sum of 3,5 and 7 is: " + sum(3,5,7));
        System.out.println("The sum of 1,6 and 6 is: " + sum(1,6,6));
        System.out.println("The sum of 2,8 and 6 is: " + sum(2,8,6));

    }
}
