package Practice4thFeb;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class Programs {
    public void swap2numbersM1() {

        int num1 = 10;
        int num2 = 20;
        System.out.println("Value of num1 before swapping is " + num1);
        System.out.println("Value of num2 before swapping is " + num2);
        int temp;
        temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("Value of num1 after swapping is " + num1);
        System.out.println("Value of num2 after swapping is " + num2);
    }


    public void swap2numbersM2() {

        int num1 = 30;
        int num2 = 40;
        System.out.println("Value of num1 before swapping is " + num1);
        System.out.println("Value of num2 before swapping is " + num2);
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
        System.out.println("Value of num1 after swapping is " + num1);
        System.out.println("Value of num2 after swapping is " + num2);

    }

    public void swap2numbersM3() {

        int num1 = 50;
        int num2 = 60;
        System.out.println("Value of num1 before swapping is " + num1);
        System.out.println("Value of num2 before swapping is " + num2);
        num1 = num1 * num2;
        num2 = num1 / num2;
        num1 = num1 / num2;
        System.out.println("Value of num1 after swapping is " + num1);
        System.out.println("Value of num2 after swapping is " + num2);

    }

    public void reverseANoM1(int x) {

        int num = x;
        int rev = 0;
        while (num != 0) {
            rev = rev * 10 + num % 10;
            num = num / 10;
        }
        System.out.println("reversed number is " + rev);

    }

    public void reverseANoM2(int x) {

        int num = x;
        StringBuffer sb = new StringBuffer(String.valueOf(num));
        StringBuffer rev = sb.reverse();
        System.out.println("reversed number is " + rev);
    }

    public void reverseANoM3(int x) {

        int num = x;
        StringBuilder sbl = new StringBuilder();
        sbl.append(num);
        StringBuilder rev = sbl.reverse();
        System.out.println("reversed number is " + rev);
    }

    public void reverseAStringM1(String x) {
        String str = x;
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
        System.out.println("reversed string is " + rev);
    }

    public void reverseAStringM2(String x) {
        String str = x;
        String rev = "";
        char a[] = str.toCharArray();
        for(int i=a.length-1;i>=0;i--){
            rev = rev + a[i];
        }
        System.out.println("reversed string is " + rev);
    }

    public void reverseAStringM3(String x) {
        String str = x;
        StringBuffer sb = new StringBuffer(str);
        StringBuffer rev = sb.reverse();
        System.out.println("reversed string is " + rev);
    }

    public void PalindromeNumber(int x) {
        int orgnum = x;
        int num = x;
        int rev = 0;
        while (num != 0) {
            rev = rev * 10 + num % 10;
            num = num / 10;
        }
        System.out.println("reversed number is " + rev);
        if(rev == orgnum){
            System.out.println("Number is a palindrome");
        }
        else{
            System.out.println("Number is NOT a palindrome");
        }
    }

    public void palindromeString(String x){
        String org_str = x;
        String str  = x;
        String rev = "";
        char a[] = str.toCharArray();
        for(int i =a.length-1;i>=0;i--){
            rev = rev + a[i];
        }
        System.out.println("reversed string is "+rev);
        if(rev.equals(org_str)){
            System.out.println("reversed string is palindrome");
        }
        else{
            System.out.println("reversed string is not palindrome");
        }
    }

    public void countNoOfDigits(int x){
        int num =x;
        int count =0;
        while(num!=0){
            num=num/10;
            count++;
        }
        System.out.println("Count of digits is "+count);
    }

    public void OddEvenDigits(int x){
        int num = x;
        int even = 0;
        int odd = 0;
        while(num!=0){
            if(num%2 == 0){
                even++;
            }
            else{
                odd++;
            }
            num = num/10;
        }
        System.out.println("No of even digits are "+even);
        System.out.println("No of odd digits are "+odd);
    }

    public void sumOfDigits(int x){
        int num = x;
        int sum =0;
        while(num!=0){
            sum = sum + num%10;
            num = num/10;
        }
        System.out.println("Sum of digits is "+sum);

    }

    public void fibonacciSeries(){
        int n1=0;
        int n2 =1;
        int sum =0;
        System.out.print(n1+" "+n2);
        for(int i=0;i<=10;i++){
            sum = n1+n2;
            System.out.print(" "+sum);
            n1=n2;
            n2=sum;
        }
    }

    public void primeNumber(int x){
        int num =x;
        int count =0;
        for(int i = 1;i<=num;i++){
            if(num%i == 0){
                count++;
            }
        }
        if(count == 2){
            System.out.println("Prime number");
        }
        else{
            System.out.println("Not a Prime number");
        }
    }

    public void largestOf3Nos(int x,int y,int z){
        int num1 =x;
        int num2=y;
        int num3 = z;
        if(num1>num2 && num1>num3){
            System.out.println("Greatest number is "+num1);
        } else if (num2>num1 && num2>num3) {
            System.out.println("Greatest number is "+num2);
        }
        else{
            System.out.println("Greatest number is "+num3);
        }

    }

    public void factorial(int x){
        int num =x;
        int fact =1;
        for(int i = 1;i<=num;i++){
            fact  = fact * i;
        }
        System.out.println("Factorial of a num is "+fact);
    }

    public void sumOfElementsArray(){
        int arr[] = {1,2,3,4,5,6};
        int sum = 0;
        for(int i =0;i<arr.length;i++){
            sum = sum + arr[i];
        }
        System.out.println("Sum of array is "+sum);
    }

    public void EvenOddElementsArray(){
        int arr[] = {1,2,3,4,5,6};
        boolean b = false;
        System.out.println("Even elements are ");
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2 == 0){
               System.out.println(arr[i]);
            }
        }
    }

    public void equalityOfArrays(){
        int arr1[] = {1,2,2,4,5,6};
        int arr2[] = {1,2,3,4,5,6};
        boolean b = true;

        if(arr1.length==arr2.length){
            for(int i =0;i<arr1.length;i++){
                if(arr1[i]!=arr2[i]){
                    b = false;
                    break;
                }
            }
        }
        else{
            b = true;
        }
        if(b==true){
            System.out.println("Arrays are equal");
        }
        else{
            System.out.println("Arrays not are equal");
        }
    }

    public void maxMinElementArray(){
        int arr[] = {10,20,50,0,6};
        int min = arr[0];
        for(int i = 0;i<arr.length;i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println("Min element is "+min);
    }

    public void duplicatesinArrayM1(){
        int arr[] = {1,2,3,45,34,45,55,55};
        boolean b = false;
        for(int i =0;i<arr.length;i++){
            for(int j = i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    System.out.println("Dupicate element found "+arr[i]);
                    b=true;
                }
            }
            }
        if(b==false){
            System.out.println("No dupicate elements found");
        }
    }

    public void duplicatesinArrayM2() {
        int arr[] = {1, 2, 3,10,10};
        boolean b = false;
        HashSet<Integer> hs = new HashSet();
        for (int i = 0; i < arr.length; i++) {
            if (hs.add(arr[i]) == false) {
                System.out.println("Duplicate element found " + arr[i]);
                b= true;
            }
        }
        if(b==false){
            System.out.println("No dupicate elements found");
        }
    }

    public void linearSearch(){
        int arr[] = {1,2,3,4,5,6,7,8,9};
        int num = 31;
        boolean b = false;
        for(int i = 0;i<arr.length;i++){
            if(arr[i]==num){
                System.out.println("Searched element is present");
                 b = true;
            }
        }
        if(b == false){
            System.out.println("Searched element is not present");
        }
    }

    public void binarySearch(){
        int arr[] = {1,2,3,4,5,6,7,8,9};
        int num = 9;
        boolean b = false;
        int l =0;
        int h = arr.length-1;
        while(l<=h){
        int m = (l+h)/2;
        if(num==arr[m]){
            System.out.println("Searchable element found");
            b=true;
            break;
        }
        else if(num>arr[m]){
            l=m+1;

        } else if (num<arr[m]){
            h=m-1;
        }
        }
        if(b==false){
            System.out.println("Searchable element not found");
        }
    }

    public void bubbleSort(){
        int arr[] = {10,3,20,31,1,5,60};
        System.out.println("Arrays before sorting "+ Arrays.toString(arr));
        for(int i = 0;i<arr.length;i++){
            for(int j = 0;j<arr.length;j++){
                if(arr[i]<arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Arrays after sorting "+Arrays.toString(arr));
    }

    public void builtInSortM1(){
        int arr[] = {10,3,20,31,1,5,61};
        System.out.println("Arrays before sorting "+ Arrays.toString(arr));
        Arrays.parallelSort(arr);
        System.out.println("Arrays before sorting "+ Arrays.toString(arr));
    }

    public void builtInSortM2(){
        int arr[] = {10,3,20,31,1,5,63};
        System.out.println("Arrays before sorting "+ Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("Arrays after sorting "+ Arrays.toString(arr));
    }

    public void descendingOrderSort(){
        Integer arr[] = {10,3,20,31,1,5,63};
        System.out.println("Arrays before sorting "+ Arrays.toString(arr));
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println("Arrays after sorting "+ Arrays.toString(arr));
    }

    public void removeSpecialCharacters(){

        String s = "@@@@@#$@#!@!!@!QWERTY12345445   9999!!!!";
        String s1 = s.replaceAll("[^a-zA-Z0-9]","");
        System.out.println(s1);

    }


}