package com.company;

public class Methods {
      int logic(int x,int y ){
        int z;
        if (x>y){
            z = x+y;
        }else {
            z = (x+y) *5;
        }
        return z;
    }
    public static void main(String[] args) {
        int a = 5;
        int b = 5;
        int c;
        Methods Read = new Methods();
        c = Read.logic(a,b);

        // Value will as follow
        int A1 = 1;
        int B1 = 2;
        int C1;
        C1 = Read. logic(A1,B1);
        System.out.println(c);
        System.out.println(C1);

    }
}
