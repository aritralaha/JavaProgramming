package org.example;

import java.util.Scanner;

public class reverseUsingStringBufferM2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        int x =sc.nextInt();

        StringBuffer sb = new StringBuffer(String.valueOf(x));
        StringBuffer  rev=sb.reverse();
        System.out.println("Reversed number is "+rev);




    }
}
