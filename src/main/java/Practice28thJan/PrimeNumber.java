package Practice28thJan;

public class PrimeNumber {
    public void primeno(int x){
        int num =x;
        int count =0;
        if(num>0) {
            for (int i = 1; i <= num; i++) {
                if(num%i ==0){
                    count++;
                }
            }
            if(count==2){
                System.out.println("a prime number");
            }
            else{
                System.out.println("Not a prime number");
            }
        }
        else{
            System.out.println("Not a prime number");
        }
    }
}
