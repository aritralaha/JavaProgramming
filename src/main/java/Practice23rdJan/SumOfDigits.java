package Practice23rdJan;

public class SumOfDigits {

    int num = 123456;
    int sum = 0;

    public int sumofDigitsM1(){
        while(this.num>0){
            this.sum = this.sum + this.num%10;
            this.num = this.num/10;
        }
        System.out.println("total sum of the digits is "+this.sum);
        return this.sum;
    }
}
