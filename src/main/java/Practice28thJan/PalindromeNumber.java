package Practice28thJan;

public class PalindromeNumber {

    public void palindromeNum(int x){
        int orgNum =x;
        System.out.println("Original number is "+orgNum);
        int num =x;
        int rev =0;
        while(num>0){
            rev = rev*10 + num%10;
            num = num/10;
        }
        System.out.println("reversed number is "+rev);
        if(orgNum == rev){
            System.out.println("Number is a palindrome");
        }
        else{
            System.out.println("Number is NOT a palindrome");
        }
    }


}
