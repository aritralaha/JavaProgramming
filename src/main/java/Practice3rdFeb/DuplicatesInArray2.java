package Practice3rdFeb;

import java.util.HashSet;

public class DuplicatesInArray2 {

    public static void main(String[] args){
        int a[] = {15,20,16,21,40};
        HashSet<Integer> hs = new HashSet();
        boolean b = false;

        for(int i = 0;i<a.length;i++){

            if(hs.add(a[i])==false){
                System.out.println("Duplicate element is "+a[i]);
                b=true;
            }
        }
        if(b==false){
            System.out.println("No Duplicate element");
        }

    }
}
