package Practice31stJan;

import java.util.HashSet;

public class DuplicatElementArray2 {

    public static void main(String[] args){

        String a[] = {"Aritra","Laha","Kasturi","Dhoni","Aritra","Aritra","Laha"};
        HashSet <String>hs = new HashSet();
        boolean  b =false;

        for(int i =0;i<a.length;i++){
            if(hs.add(a[i])==false){
                System.out.println("Duplicate element is: "+a[i]);
                b=true;
            }
        }
        if(b==false){
            System.out.println("No Duplicate element found");
        }
    }
}
