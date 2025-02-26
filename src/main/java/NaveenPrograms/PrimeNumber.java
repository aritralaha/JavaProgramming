package NaveenPrograms;

public class PrimeNumber {
    public PrimeNumber(int x){
        int num = x;
        int count =0;
        for(int i = 1; i<=num;i++){
            if(num%i==0){
                count++;
            }
        }
        if(count==2){
            System.out.println("Prime number");
        }
        else{
            System.out.println("Not a Prime number");
        }
    }

    public static void main(String[] args){
        PrimeNumber p = new PrimeNumber(12);
    }
}
