package org.example;

public class Swappingin1statement {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("initial value of a is "+a);
        System.out.println("initial value of b is "+b);
        b = a + b - (a = b);
        System.out.println("value of a after swapping is "+a);
        System.out.println("value of b after swapping is "+b);


    }

}
