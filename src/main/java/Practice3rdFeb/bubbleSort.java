package Practice3rdFeb;

import com.google.inject.Key;

import java.util.Arrays;

public class bubbleSort {

    public static void main(String[] args){

        int a[] = {10,14,5,1,30,16,2};
        System.out.println("Before sorting " +Arrays.toString(a));
        int x = a.length;
        for(int i =0;i<x-1;i++){
            for(int j = 0;j<x-1;j++){
                if(a[j]>a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }

        System.out.println("After sorting " +Arrays.toString(a));
    }
}
