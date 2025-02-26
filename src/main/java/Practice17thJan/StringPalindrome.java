package Practice17thJan;

public class StringPalindrome {

    public static void main(String[] args) {

        String str = "QweewQ";
        String rev ="";
        char a[]= str.toCharArray();

        for(int i=a.length-1;i>=0;i--){
            rev = rev+a[i];
        }
        System.out.println("reversed string is "+rev);

        if(str.equals(rev)){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not a palindrome");
        }









    }
}
