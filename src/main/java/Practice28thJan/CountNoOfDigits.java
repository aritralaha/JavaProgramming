package Practice28thJan;

public class CountNoOfDigits {

    public void countdigits(int x){
        int num =x;
        int count =0;
        while(num!=0){
            num = num/10;
            count++;
        }
        System.out.println("count of digits in the entered number is "+count);
    }

}
