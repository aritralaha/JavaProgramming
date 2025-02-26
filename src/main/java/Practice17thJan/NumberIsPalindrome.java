package Practice17thJan;

import java.util.Scanner;

public class NumberIsPalindrome {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        int num = sc.nextInt();
        int orgNum = num;
        int rev=0;
        while(num!=0){
            rev= rev*10 +num%10;
            num=num/10;
        }
        System.out.println("Reversed number is "+rev);
        if(orgNum==rev){
            System.out.println("Number is palindrome");
        }
        else{
            System.out.println("Number is not a palindrome");
        }



    }
}
