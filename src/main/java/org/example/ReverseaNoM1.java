package org.example;

import java.util.Scanner;

public class ReverseaNoM1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        int x = sc.nextInt();

        int rev =0;
        while(x!=0){
            rev = rev*10 + x%10;
            x = x/10;
        }

        System.out.println("Reversed number is "+rev);


    }
}
