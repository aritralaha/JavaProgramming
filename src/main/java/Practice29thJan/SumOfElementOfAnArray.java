package Practice29thJan;

public class SumOfElementOfAnArray {

    public static void main(String[] args){
        int a[] = {10,20,30,40};
        int sum = 0;

        for(int i=0;i<a.length;i++){
            sum = sum +a[i];
        }
        System.out.println(sum);
    }
}
