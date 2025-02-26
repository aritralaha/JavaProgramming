package Practice28thJan;

public class FactoriaOfANum {

    public void factoriaNum(int x){
        long num =x;
        long fact = 1;
        for(long i =1;i<=num;i++){
            fact = fact*i;
        }
        System.out.println("Factorial of a number is "+fact);
    }
}
