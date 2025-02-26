package org.example;

public class Without3rdVariable {

    public static void main(String[] args){

        int a =10;
        int b=20;
        System.out.println("initial value of a is "+a);
        System.out.println("initial value of b is "+b);
        a=a+b; //a=30
        b=a-b; //b=10
        a=a-b; //b=10
        System.out.println("value of a after swapping is "+a);
        System.out.println("value of b after swapping is "+b);




    }
}
