package Practice16thJan;

import java.util.Scanner;

public class Swap2NumbersM1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number");
        int num1 = sc.nextInt();
        System.out.println("Enter 2nd number");
        int num2 = sc.nextInt();

        int c;

        c=num1;
        num1=num2;
        num2=c;

        System.out.println("Value of 1st number after swapping is "+num1);
        System.out.println("Value of 2nd number after swapping is "+num2);
















    }

}
