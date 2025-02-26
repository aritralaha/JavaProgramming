package org.example;

public class Main {
    public static void main(String[] args) {

        //method 1
        int a=10;
        int b =20;
        int c;
        System.out.println("initial value of a is "+a);
        System.out.println("initial value of b is "+b);

        c=a; //c=10
        a=b; // a=20
        b=c; //b=10

        System.out.println("value of a after swapping is "+a);
        System.out.println("value of b after swapping is "+b);


    }
}