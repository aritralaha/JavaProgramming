package Practice28thJan;

public class PalindromeString {

    public void palindromeStr(String s){
        String org_str  = s;
        System.out.println("Original string is "+org_str);
        String str  = s;
        String rev = "";
        for(int i =str.length()-1;i>=0;i--){
            rev = rev + str.charAt(i);
        }
        System.out.println("Reversed string is "+rev);
        if(org_str.equals(rev)){
            System.out.println("String is a palindrome");
        }
        else{
            System.out.println("String is not a palindrome");
        }

    }
}
