package Package9thFeb;

public class RemoveWhiteSpaces {

    public static void main(String[] args){
       String str = "Dusky the high mountain";
      // String str1 = str.replaceAll("\\s","");
       //System.out.println(str1);

        ///String str2 = str.replace("a","");
       // System.out.println(str2);
       // String str3 = str2.replaceAll("\\s","");
        //System.out.println("No of occurences of letter a is "+(str.length()-str3.length()));
        System.out.println(str.replace("u",""));
        System.out.println("Occurences of u is "+(str.length()-str.replace("u","").length()));




    }
}
