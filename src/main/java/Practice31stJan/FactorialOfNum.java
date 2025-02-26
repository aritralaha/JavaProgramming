package Practice31stJan;

public class FactorialOfNum {
     public static void main(String[] args){

         int num =4;
         int factorial =1;

         for(int i=1;i<=num;i++){
             factorial = factorial*i;
         }
         System.out.println("Factorial of the number is "+factorial);



     }
}
