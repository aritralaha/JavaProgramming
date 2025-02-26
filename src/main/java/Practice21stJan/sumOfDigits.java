package Practice21stJan;

public class sumOfDigits {

    public static void main(String[] args) {
        int num = 111;
        int sum=0;

        while(num>0){
            sum=sum+num%10;
            num=num/10;
        }
        System.out.println(sum);
    }
}
