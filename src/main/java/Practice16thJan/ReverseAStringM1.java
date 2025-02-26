package Practice16thJan;

public class ReverseAStringM1 {

    public static void main(String[] args){
        String str = "Dog";
        String rev ="";
        for(int i=str.length()-1;i>=0;i--){
            rev = rev+ str.charAt(i);
        }
        System.out.println("Reversed string is "+rev.toLowerCase());



    }
}
