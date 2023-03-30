package com.company;

import java.util.Locale;

public class String_Method {
    public static void main(String[] args) {
        String name="Rahul";
       // Rahul's Index Is  01234


        int value=name.length();
        System.out.println(value);

        String Lowerstring= name.toLowerCase();
        System.out.println(Lowerstring);

        String Upperstring= name.toUpperCase();
        System.out.println(Upperstring);

        String nontrimmedString="      Rahul       ";
         // nontrimmedString give output as it is means "      Rahul        "
        System.out.println(nontrimmedString);

        String trimmedString=nontrimmedString.trim();
        System.out.println(trimmedString);

        System.out.println(name.substring(3));
        System.out.println(name.substring(2,5));

        System.out.println(name.replace("ahul","oom"));
         //replace is used replace Some letters it can replace one letter also like given below
        System.out.println(name.replace('a','o'));

        System.out.println(name.startsWith("Rah"));
         // this  method is used to identify
        System.out.println(name.endsWith("Rah"));

        System.out.println(name.charAt(4));

        String stylename="Rahulhulhulhul";
        System.out.println(stylename.indexOf("u",6));
        System.out.println(stylename.indexOf("h"));

        System.out.println(stylename.lastIndexOf("u",8));

        System.out.println(name.equals("Rahul"));
        System.out.println(name.equalsIgnoreCase("RaHuL"));
        //it will give only True if any case is there But If String is change then it will give False

        System.out.println("She Said \"Hello!!\" To Me");
        System.out.println("I Replied Her \"Get Lost Dumb!!\"");





    }
}
