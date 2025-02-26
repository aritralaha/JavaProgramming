package NaveenPrograms;

public class PalindromeNumber {
    public PalindromeNumber(int x){
        int org_num  = x;
        int num = x;
        int rev = 0;
        while(num!=0){
            rev = rev*10+num%10;
            num = num/10;
        }
       if(rev == org_num){
           System.out.println("Number is palindromes");
       }
       else{
           System.out.println("Number is not palindromes");
       }
    }

    public static void main(String[] args){
        PalindromeNumber p = new PalindromeNumber(123211);
    }
}
