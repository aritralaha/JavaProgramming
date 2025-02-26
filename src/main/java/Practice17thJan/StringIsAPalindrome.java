package Practice17thJan;

public class StringIsAPalindrome {

    public static void main(String[] args) {

        String str = "dsdds";
        String revStr="";
        char a[] = str.toCharArray();

        for (int i=a.length-1;i>=0;i--){
            revStr = revStr + a[i];
        }
        System.out.println("reversed string is "+revStr.toLowerCase());

        if(str.toLowerCase().equals(revStr.toLowerCase())){
            System.out.println("String is palindrom");
        }
        else{
            System.out.println("String is not a palindrom");
        }

    }
}
