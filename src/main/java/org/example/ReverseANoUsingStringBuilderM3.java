package org.example;

import java.util.Scanner;

public class ReverseANoUsingStringBuilderM3 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int x= sc.nextInt();

        StringBuilder sbl = new StringBuilder();
        sbl.append(x);
        StringBuilder rev = sbl.reverse();
        System.out.println("Reversed number is "+rev);


    }
}
