package Practice28thJan;

public class SumOfDigits {

    public SumOfDigits(int x){
        int num =x;
        int sum =0;
        while(num>0){
            sum =sum + num%10;
            num =num/10;
        }
        System.out.println("sum of digits is "+sum);
    }
}
