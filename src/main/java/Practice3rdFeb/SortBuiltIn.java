package Practice3rdFeb;

import java.util.Arrays;
import java.util.Collections;

public class SortBuiltIn {

    public static void main(String[] args){
        int a[] = {10,14,5,1,30,16,2};
        System.out.println("Before Sorting"+ Arrays.toString(a));
        Arrays.parallelSort(a);
        System.out.println("After Sorting" +Arrays.toString(a));

        Arrays.sort(a);
        System.out.println("After Sorting" +Arrays.toString(a));

        Integer a1[] ={10,14,5,1,30,16,2};
        System.out.println("Before Sorting"+ Arrays.toString(a1));
        Arrays.sort(a1, Collections.reverseOrder());
        System.out.println("After Sorting" +Arrays.toString(a1));

    }


}
