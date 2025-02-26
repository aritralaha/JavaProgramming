package NaveenPrograms;

public class StringOnlyDigits {

     public static void main(String[] args){
         String s ="1A2";
         boolean b = false;
         for(int i=0;i<s.length();i++){
            if(Character.isDigit(s.charAt(i))==true){
                b= true;
            }
         }
         if(b==false){
             System.out.println("no digits found");
         }
         else{
             System.out.println("digits found");
         }
     }

}
