package Practice3rdFeb;

public class EvenOddNos
{
    public static void main(String[] args){
        int a[] = {2,4,7,8,9};
        int even = 0;
        int odd = 0;


        System.out.println("Even nos are");

        for(int  i =0;i<a.length;i++){

            if(a[i]%2 == 0){
                System.out.println(a[i]);
            }
        }
    }
}
