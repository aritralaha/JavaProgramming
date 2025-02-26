package Practice26thFeb;

import java.util.HashSet;

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
        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
        System.out.println("Reversed string is " + rev);
    }

    public void reverseAStringM2(String x) {
        String str = x;
        String rev = "";
        char a[] = str.toCharArray();
        for (int i = a.length - 1; i >= 0; i--) {
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

    public void palindromeNo(int x) {
        int org_num = x;
        int num = x;
        int rev = 0;
        while (num != 0) {
            rev = rev * 10 + num % 10;
            num = num / 10;
        }
        if (rev == org_num) {
            System.out.println("Number is palindrome");
        } else {
            System.out.println("Number is not a palindrome");
        }
    }

    public void palindromeString(String x) {
        String org_str = x;
        String str = x;
        String rev = "";
        char a[] = str.toCharArray();
        for (int i = a.length - 1; i >= 0; i--) {
            rev = rev + a[i];
        }
        if (rev.equals(org_str)) {
            System.out.println("String is palindrome");
        } else {
            System.out.println("String is not a palindrome");
        }
    }

    public void countDigits(int x) {
        int num = x;
        int count = 0;
        while (num != 0) {
            num = num / 10;
            count++;
        }
        System.out.println("Count of digits is " + count);
    }

    public void oddEvenDigits(int x) {
        int num = x;
        int odd = 0;
        int even = 0;
        while (num != 0) {
            if (num % 2 == 0) {
                even++;
            } else {
                odd++;
            }
            num = num / 10;
        }
        System.out.println("Count of even digits is " + even);
        System.out.println("Count of odd digits is " + odd);
    }

    public void sumOfDigits(int x) {
        int num = x;
        int sum = 0;
        while (num > 0) {
            sum = sum + num % 10;
            num = num / 10;
        }
        System.out.println("sum of digits is " + sum);
    }

    public void fibonacciSeries() {
        //0,1,1,2,3,5,8
        int num1 = 0;
        int num2 = 1;
        int sum = 0;
        System.out.print(num1 + " " + num2);
        for (int i = 0; i <= 10; i++) {
            sum = num1 + num2;
            System.out.print(" " + sum);
            num1 = num2;
            num2 = sum;
        }
    }

    public void primeno(int x) {
        int num = x;
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            System.out.println("Number is prime");
        } else {
            System.out.println("Number is not prime");
        }
    }

    public void factorial(int x) {
        int num = x;
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        System.out.println("Factorial of a number is " + fact);
    }

    public void arraySum() {
        int arr[] = {1, 2, 3, 4, 5, 6};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println("Required sum is " + sum);
    }

    public void extractEvenElements() {
        int arr[] = {1, 2, 3, 4, 5, 6};
        System.out.println("Event elements are: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.println(arr[i]);
            }
        }
    }

    public void equalityOfArrays() {
        int arr1[] = {1, 2, 31, 4, 5, 6};
        int arr2[] = {1, 2, 3, 4, 5, 6};
        boolean b = true;
        if (arr1.length == arr2.length) {
            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i] != arr2[i]) {
                    b = false;
                }
            }
        } else {
            b = false;
        }
        if (b == true) {
            System.out.println("Arrays are equal");
        } else {
            System.out.println("Arrays are not equal");
        }
    }

    public void minElement() {
        int arr[] = {10,2,2,2,31,4,5,6};
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("min element is " + min);
    }

    public void duplicatesInArrayM1(){
        int arr[] = {10,2,2,2,31,4,4,5,6};
        boolean b =false;
        for(int i = 0;i<arr.length;i++){
            for(int j = i+1;i<arr.length;i++){
                if(arr[i] == arr[j]){
                    System.out.println("Repetitive element is "+arr[i]);
                    b=true;
                }
            }
            if(b==false){
                System.out.println("No Repetitive element found");
            }
        }
    }

    public void duplicatesInArrayM2(){
        int arr[] = {10,2,2,2,31,4,4,5,6};
        HashSet<Integer> hs = new HashSet();
        boolean b =false;
        for(int i = 0;i<arr.length;i++){
            if(hs.add(arr[i])==false){
                System.out.println("repetitve element is "+arr[i]);
                b=true;
            }
        }
        if(b==false){
            System.out.println("No Repetitive element found");
        }
    }

    public void linearSearchArray(){
        int arr[] = {1,2,3,4,5,6,7,8,9};
        int num =21;
        boolean b = false;
        for(int i = 0;i<arr.length;i++){
            if(num == arr[i]){
                System.out.println("Searched element is "+arr[i]);
                b=true;
            }
        }
        if(b==false){
            System.out.println("Searched element not found");
        }
    }

    public void binarySearchArray(){
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        boolean b =false;
        int num= 61;
        int l= 0;
        int h = arr.length-1;
        while(l<=h){
            int m =(l+h)/2;
            if(num ==arr[m]){
                System.out.println("Searchable element found");
                b=true;
                break;
            } 
            else if (num<arr[m]) {
                h=m-1;
            } else if (num>arr[m]) {
                l=m+1;
            }
        }
        if(b == false){
            System.out.println("Searched element not found");
        }
    }

    public void bubbleSortArray(){

    }
}
