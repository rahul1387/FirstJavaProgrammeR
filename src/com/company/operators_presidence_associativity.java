package com.company;

public class operators_presidence_associativity {
    public static void main(ST[] args) {
        //Presidence
//        Highest Presedence goes to * and /.they are then evaluated on the basis of
//        Left to Right associativity
//        int a =6*5-34/2;
//        System.out.println(a);
        /*
        =30-34/2
        =30-17
        =13
         */
         // Associativity
//        int s=60/5-34*2;
//        System.out.println(s);
        /*
        =12-68
        =-56
         */
       //QUICK QUIZ
//        int x =1;
//        int y= 6;
//        int k=x*y/2;

        int b=1;
        int c=6;
        int a=5;
//        int k=b*b- 4*a*c/2*a;
        int k=b*b- (4*a*c)/(2*a);

        System.out.println(k);


    }
}
