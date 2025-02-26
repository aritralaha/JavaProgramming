package org.example;

public class SwappingWithMultiplication {

    public static void main(String[] args){

        int a=10;
        int b =20;
        System.out.println("initial value of a is "+a);
        System.out.println("initial value of b is "+b);
        a=a*b; //10*20
        b=a/b; //10*20/20 b=10
        a=a/b; //10*20/10 a=20
        System.out.println("value of a after swapping is "+a);
        System.out.println("value of b after swapping is "+b);


    }
}
