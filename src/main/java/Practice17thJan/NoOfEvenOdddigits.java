package Practice17thJan;

import java.util.Scanner;

public class NoOfEvenOdddigits {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        int oddCount=0;
        int evenCount=0;
        while(num>0){
           int rem = num%10;
            if(rem%2 == 0){
            evenCount++;
            }
            else{
                oddCount++;
            }
            num=num/10;
        }
        System.out.println("No of even digits "+evenCount);
        System.out.println("No of odd digits "+oddCount);
    }
}
