package com.company;

import java.util.Scanner;

public class percentageconverter {
    public static void main(ST[] args) {
        Scanner scanner= new Scanner(System.in);
        int Science;
        int Maths;
        int SocialScience;
//        int English;
        int Marathi;
        int Hindi;

         Science= scanner.nextInt();
         Maths= scanner.nextInt();
         SocialScience=scanner.nextInt();
//        English=scanner.nextInt();
        Marathi=scanner.nextInt();
        Hindi=scanner.nextInt();

         int sum=Science+Maths+SocialScience+Marathi+Hindi;
        System.out.println(sum);
        System.out.println(sum*100/500);

    }
}
