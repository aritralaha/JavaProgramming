package Practice23rdJan;

public class ReverseAString {
    String rev = "";
    StringBuffer sb;

    public void reverseAStringM1(){
        String str = "School";
        for(int i=str.length()-1;i>=0;i--){
            this.rev =this.rev + str.charAt(i);
        }
        System.out.println("Reversed String is "+this.rev);
    }

    public String reverseAStringM2(){
        String str = "Tesco";
        char a[] = str.toCharArray();
        for(int i =a.length-1;i>=0;i--){
            this.rev=this.rev + a[i];
        }
        System.out.println("Reversed String is "+this.rev);
        return this.rev;
    }

    public StringBuffer reverseAStringM3(String str){
        sb = new StringBuffer(str);
        StringBuffer rev = sb.reverse();
        System.out.println("Reversed String is "+rev);
        return rev;

    }
}
