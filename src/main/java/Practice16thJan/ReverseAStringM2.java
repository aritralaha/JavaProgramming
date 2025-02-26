package Practice16thJan;

public class ReverseAStringM2 {
    public static void main(String[] args){
        String str = "barking";
        String rev="";
        char a[] = str.toCharArray();
        for(int i=a.length-1;i>=0;i--){
            rev=rev +a[i];
        }
        System.out.println("reversed string is "+rev);


    }
}
