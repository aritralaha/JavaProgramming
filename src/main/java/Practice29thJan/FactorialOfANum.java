package Practice29thJan;

public class FactorialOfANum {

    public static void main(String[] args){
        int num =4;
        int factorial =1;

        for(int i=1; i<=num;i++){
            factorial=factorial*i;
        }
        System.out.println("Factorial of a number is "+factorial);

    }
}
