package Practice3rdFeb;

public class SumOfElements {

    public static void main(String[] args){

        int a[] ={1,2,4,5,68,8};
        int sum = 0;
        for(int i =0;i<a.length;i++){
            sum  = sum +a[i];
        }
        System.out.println("Sum of array is "+sum);

    }
}
