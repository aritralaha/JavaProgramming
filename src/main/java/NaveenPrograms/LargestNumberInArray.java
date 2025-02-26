package NaveenPrograms;

public class LargestNumberInArray {
    public static void main(String[] args){
        int a[] = {10,3,4,11,15,1,2};
        int max = a[0];
        for(int i =0;i<a.length;i++){
            if(a[i]>max){
                max = a[i];
            }
        }
        System.out.println("Maximum number is "+max);
    }
}
