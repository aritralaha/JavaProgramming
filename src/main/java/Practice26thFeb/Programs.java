package Practice26thFeb;

public class Programs {

    public void swapM1(int x, int y) {
        int num1 = x;
        int num2 = y;
        System.out.println("value of numbers before swapping are " + num1 + " " + num2);
        int c = num1;
        num1 = num2;
        num2 = c;
        System.out.println("value of numbers after swapping are " + num1 + " " + num2);
    }

    public void swapM2(int x, int y) {
        int num1 = x;
        int num2 = y;
        System.out.println("value of numbers before swapping are " + num1 + " " + num2);
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
        System.out.println("value of numbers after swapping are " + num1 + " " + num2);
    }

    public void swapM3(int x, int y) {
        int num1 = x;
        int num2 = y;
        System.out.println("value of numbers before swapping are " + num1 + " " + num2);
        num1 = num1 * num2;
        num2 = num1 / num2;
        num1 = num1 / num2;
        System.out.println("value of numbers after swapping are " + num1 + " " + num2);
    }

    public void reverseANoM1(int x) {
        int num = x;
        int rev = 0;
        while (num != 0) {
            rev = rev * 10 + num % 10;
            num = num / 10;
        }
        System.out.println("Reversed number is " + rev);
    }

    public void reverseANoM2(int x) {
        int num = x;
        StringBuffer sb = new StringBuffer(String.valueOf(num));
        StringBuffer rev = sb.reverse();
        System.out.println("Reversed number is " + rev);
    }

    public void reverseANoM3(int x) {
        int num = x;
        StringBuilder sbl = new StringBuilder();
        sbl.append(num);
        StringBuilder rev = sbl.reverse();
        System.out.println("Reversed number is " + rev);
    }

    public void reverseAStringM1(String x) {
        String str = x;
        String rev = "";
        for (int i = str.length()-1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
        System.out.println("Reversed string is " + rev);
    }

    public void reverseAStringM2(String x) {
        String str = x;
        String rev = "";
        char a[] = str.toCharArray();
        for (int i = a.length-1; i >= 0; i--) {
            rev = rev + a[i];
        }
        System.out.println("Reversed string is " + rev);
    }

    public void reverseAStringM3(String x) {
        String str = x;
        StringBuffer sb = new StringBuffer(str);
        StringBuffer rev = sb.reverse();
        System.out.println("Reversed string is " + rev);
    }

    public void palindromeNo(int x){
        int org_num=x;
        int num=x;
        int rev = 0;
        while(num!=0){
            rev = rev*10 + num%10;
            num =num/10;
        }
        if(rev == org_num){
            System.out.println("Number is palindrome");
        }
        else{
            System.out.println("Number is not a palindrome");
        }
    }

    public void palindromeString(String x){
        String org_str = x;
        String str =x;
        String rev = "";
        char a[] = str.toCharArray();
        for(int i = a.length -1;i>=0;i--){
            rev = rev + a[i];
        }
        if(rev.equals(org_str)){
            System.out.println("String is palindrome");
        }
        else{
            System.out.println("String is not a palindrome");
        }
    }

    public void countDigits(int x){
        int num =x;
        int count = 0;
        while(num!=0){
            num = num/10;
            count++;
        }
        System.out.println("Count of digits is "+count);
    }

    public void oddEvenDigits(int x){
        int num = x;
        int odd = 0;
        int even = 0;
        while(num!=0){
            if(num%2==0){
                even++;
            }
            else{
                odd++;
            }
            num=num/10;
        }
        System.out.println("Count of even digits is "+even);
        System.out.println("Count of odd digits is "+odd);
    }

    public void sumOfDigits(int x){
        int num = x;
        int sum =0;
        while(num>0){
            sum = sum + num%10;
            num = num/10;
        }
        System.out.println("sum of digits is "+sum);
    }

    public void fibonacciSeries(){
        //0,1,1,2,3,5,8
        int num1=0;
        int num2 =1;
        int sum = 0;
        System.out.print(num1+" "+num2);
        for(int i =0;i<=10;i++){
            sum = num1+num2;
            System.out.print(" "+sum);
            num1=num2;
            num2=sum;
        }
    }

    public void primeno(int x){
        int num = x;
        int count = 0;
        for(int i =1;i<=num;i++){
            if(num%i==0){
                count++;
            }
        }
        if(count==2){
            System.out.println("Number is prime");
        }
        else{
            System.out.println("Number is not prime");
        }
    }
}
