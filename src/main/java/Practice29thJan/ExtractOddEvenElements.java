package Practice29thJan;

public class ExtractOddEvenElements {

    public static void main(String[] args){
        int a[] = {10,20, 21,23};

        for(int i=0;i< a.length;i++){
            if(a[i]%2==0){
                System.out.println("Even elements are "+a[i]);
            }
            else{
                System.out.println("Odd elements are "+a[i]);
            }
        }
    }
}
