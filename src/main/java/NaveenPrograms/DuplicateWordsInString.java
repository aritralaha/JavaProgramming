package NaveenPrograms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class DuplicateWordsInString {

    public static void main(String[] args){

        String str = "I love love India India";
        String x[] = str.split(" ");
        HashSet<String> hs = new HashSet();
        for(int i = 0;i<x.length;i++){
            if(hs.add(x[i])==false){
                System.out.println("Repititive word is "+x[i]);
            }
        }





    }
}
