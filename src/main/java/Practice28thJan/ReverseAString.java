package Practice28thJan;

public class ReverseAString {

    public void reverseAStringM1(String s){
        String str = s;
        System.out.println("Original string is "+str);
        String rev = "";
        for(int i = str.length()-1;i>=0;i--){
            rev = rev + str.charAt(i);
        }
        System.out.println("Reversed string is "+rev);
    }

    public void reverseAStringM2(String s){
        String str = s;
        System.out.println("Original string is "+str);
        String rev = "";
        char a[] = str.toCharArray();
        for(int i=a.length-1;i>=0;i--){
            rev = rev + a[i];
        }
        System.out.println("Reversed string is "+rev);
        }

        public void reverseAStringM3(String s){
            String str = s;
            System.out.println("Original string is "+str);
            StringBuffer sb = new StringBuffer(str);
            StringBuffer rev = sb.reverse();
            System.out.println("Reversed string is "+rev);
        }


}


