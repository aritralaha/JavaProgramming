package Practice3rdFeb;

public class BinarySearch {

    public static void main(String[] args){

        int a[] = {10,20,30,40,50,60,70,80,90,100};
        int num = 30;
        boolean b = false;
        int l =0;
        int h =a.length-1;
        while(l<=h){
            int m = (l+h)/2;
            if(a[m]==num){
                System.out.println("element found");
                b=true;
                break;
            }
            if(num>a[m]){
                l = m+1;
            }
            if(num<a[m]){
                h=m-1;
            }
        }
        if(b==false){
            System.out.println("Element not found");
        }




    }
}
