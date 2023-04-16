package com.company;

public class MethodsOverloading
{
    static void foo(){

        System.out.println("Good Mourning Bro!!");
    }
    static void foo(int a){
        System.out.println("Good Mourning " + a +" Bro!!");
    }
    static void foo(int a, int b){
        System.out.println("Good Mourning " + a +" Bro!!");
        System.out.println("Good Mourning " + b +" Bro!!");
    }
//    static void change(int a)
//    {
//        a= 52;
//    }
//    static void change2(int arr[])
//    {
//        arr[0]= 52;
//    }
//    static void joke(){
//        System.out.println("I am a joke");
//    }

    public static void main(String[] args)
    {
//        int [] marks={25,65,96,65,84};
        //Case1:Changing the Integer
//        int x=96;
//        change(x);
//        System.out.println(x);
//        change2(marks);
//        System.out.println(marks[0]);

        //Method Overloading
//        foo();
        foo(3000);
        foo(94,96);
        // Arguments are actual!
    }
}
