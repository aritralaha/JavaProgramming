package Practice31stJan;

public class MaxMinArray {

    public static void main(String[] args) {
        int a1[] = {1, 2, 1,0, 500, 6};

        int max = a1[0];

        for(int i =0;i<a1.length;i++){
            if(a1[i]>max){
                max = a1[i];
            }
        }
        System.out.println("Max element is "+max);

    }
}
