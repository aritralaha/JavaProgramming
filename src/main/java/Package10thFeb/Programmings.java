package Package10thFeb;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class Programmings {
    public Programmings() throws FileNotFoundException {
    }

    public void swap2NosM1(int x, int y){
            int num1 =x;
            int num2 =y;
            System.out.println("Value of num1 before swapping is "+num1);
            System.out.println("Value of num2 before swapping is "+num2);
            int temp;
            temp = num1;
            num1 =num2;
            num2 = temp;
            System.out.println("Value of num1 after swapping is "+num1);
            System.out.println("Value of num2 after swapping is "+num2);
        }

        public void swap2NosM2(int x, int y){
            int num1 =x;
            int num2 =y;
            System.out.println("Value of num1 before swapping is "+num1);
            System.out.println("Value of num2 before swapping is "+num2);
            num1 = num1+num2;
            num2 = num1 - num2;
            num1 = num1-num2;
            System.out.println("Value of num1 after swapping is "+num1);
            System.out.println("Value of num2 after swapping is "+num2);

        }

    public void swap2NosM3(int x, int y){
        int num1 =x;
        int num2 =y;
        System.out.println("Value of num1 before swapping is "+num1);
        System.out.println("Value of num2 before swapping is "+num2);
        num1 =num1*num2;
        num2 = num1/num2;
        num1 =num1/num2;
        System.out.println("Value of num1 after swapping is "+num1);
        System.out.println("Value of num2 after swapping is "+num2);
    }

    public void reverseANumberM1(int x){
            int num =x;
            int rev = 0;
            while(num!=0){
                rev = rev*10 + num%10;
                num=num/10;
            }
            System.out.println("Reversed number is "+rev);
    }

    public void reverseANumberM2(int x){
        int num =x;
        StringBuffer sb = new StringBuffer(String.valueOf(num));
        StringBuffer rev = sb.reverse();
        System.out.println("Reversed number is "+rev);
    }

    public void reverseANumberM3(int x){
        int num =x;
        StringBuilder sbl = new StringBuilder();
        sbl.append(num);
        StringBuilder rev = sbl.reverse();
        System.out.println("Reversed number is "+rev);
    }

    public void reverseAStringM1(String x){
            String str = x;
            String rev = "";
            for(int i = str.length()-1;i>=0;i--){
                rev = rev + str.charAt(i);
            }
        System.out.println("Reversed string is "+rev);
    }

    public void reverseAStringM2(String x){
        String str = x;
        String rev = "";
        char a[] = str.toCharArray();
        for(int i = a.length-1;i>=0;i-- ){
            rev = rev + a[i];
        }
        System.out.println("Reversed string is "+rev);
    }

    public void reverseAStringM3(String x){
        String str = x;
        String rev = "";
        StringBuffer sb = new StringBuffer(str);
        rev = sb.reverse().toString();
        System.out.println("Reversed string is "+rev);
    }

    public void palindromeNumber(int x){
            int org_num = x;
            int num =x;

            int rev = 0;
            while(num!=0){
                rev = rev*10 + num%10;
                num =num/10;
            }
            System.out.println("Reversed number is "+rev);
            if(rev ==  org_num){
                System.out.println("Number is palindrome");
            }
            else{
                System.out.println("Number is not palindrome");
            }

    }

    public void palindromeString(String x){
            String org_str = x;
            String str = x;
            String rev = "";
            char a[] = str.toCharArray();
            for(int i = a.length-1;i>=0;i--){
                rev = rev + a[i];
            }
            if(org_str.equals(rev)){
                System.out.println("String is palindrome");
            }
            else{
                System.out.println("String is not palindrome");
            }
    }

    public void countNoOfDigits(int x){
            int num =x;
            int count = 0;
            while(num!=0){
                num = num/10;
                count++;
            }
            System.out.println("count of digits is "+count);
    }

    public void OddEvenCounts(int x){
        int num =x;
        int even  = 0;
        int odd  = 0;
        while(num!=0){
            if(num%2 == 0){
                even++;
            }
            else{
                odd++;
            }
            num= num/10;
        }
        System.out.println("Even count is "+even);
        System.out.println("Odd count is "+odd);
    }

    public void sumOfDigits(int x){
            int num =x;
            int sum =0;
            while(num!=0){
                sum  = sum + num%10;
                num = num/10;
            }
            System.out.println("Sum of digits is "+sum);
    }

    public void largestOf3Nos(int x, int y, int z){
            int num1 = x;
            int num2 =y;
            int num3 = z;
            if((num1>num2) && (num1>num3))
        {
                System.out.println("Largest numbr is "+num1);
        } else if ((num2>num1) && (num2>num3))
        {
            System.out.println("Largest numbr is "+num2);
        }
        else{
            System.out.println("Largest numbr is "+num3);
        }
    }

    public void fibonacciSeries(){
         //0,1,1,2,3,5
            int num1 =0;
            int num2 =1;
            int sum = 0;
            System.out.print(num1+" "+num2);

            for(int i =0;i<=10;i++){
                sum = num1 +num2;
                System.out.print(" "+sum);
                num1=num2;
                num2 = sum;
            }
    }

    public void primeNumber(int x){
            int num =x;
            int count =0;
            for(int i =1;i<=num;i++){
                if(num%i == 0){
                    count++;
                }
            }

            if(count == 2){
                System.out.println("Number is prime");
            }
            else{
                System.out.println("Number is NOT a prime");
            }
    }

    public void factoriaOfANum(int x){
            int num  = x;
            int fact  = 1;
            for(int i = 1;i<=num;i++){
                fact = fact *i;
            }
            System.out.println("Factorial of a number is "+fact);
    }

    public void sumOfElementsOfArray(){
            int arr[] = {1,2,3,4,5,6};
            int sum  = 0;
            for(int i = 0; i<arr.length;i++){
                sum = sum +arr[i];
            }
            System.out.println("Sum of array is "+sum);
    }

    public void EvenOddElementArray(){
        int arr[] = {1,2,3,4,5,6};
        int even = 0;
        int odd = 0;
        System.out.println("Even elements are: ");
        for(int i = 0;i<arr.length;i++){
            if(arr[i]%2 == 0){
                System.out.println(arr[i]);
            }
        }
    }

    public void equalityOfArray(){
        int arr1[] = {1,2,3,4,5,6};
        int arr2[] = {1,21,3,4,5,6};
        boolean  b =true;
        if(arr1.length == arr2.length){
            for(int i = 0;i<arr1.length;i++){
                if(arr1[i]!=arr2[i]){
                    b= false;
                }
            }
        }
        else{
            b  = true;
        }
        if(b == true){
            System.out.println("Arrays are equal");
        }
        else{
            System.out.println("Arrays are not equal");
        }
    }

    public void minElementOfAnArray(){
        int arr[] = {11,1,3,4,5,61};
        int min = arr[0];
        for(int i =0;i<arr.length;i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println("Minimum element is "+min);

    }

    public void duplicatesInArrayM1(){
            int arr[] = {10,20,30,30,50,60,10};
            boolean b = false;
            for(int i = 0; i < arr.length;i++){
                for(int j = i+1;j<arr.length;j++) {
                    if (arr[i] == arr[j]) {
                        System.out.println("Duplicate element found " + arr[i]);
                        b = true;
                    }
                }
            }
            if(b == false){
                System.out.println("No duplicate elements found");
            }

    }

    public void duplicatesInArrayM2(){
            int arr[] = {10,20,10,20,30,40,40,50,60};
            boolean b = false;
            HashSet<Integer> hs = new HashSet();
            for(int i = 0;i<arr.length;i++){
                if(hs.add(arr[i]) == false){
                    System.out.println("Duplicate element found "+arr[i]);
                    b=true;

                }
            }
        if(b == false){
            System.out.println("No duplicate elements found");
        }
    }

    public void linearSearch(){
            int arr[]={10,20,30,40,50,60};
            int num = 21;
            boolean b  =false;

            for(int i = 0;i<arr.length;i++){
                if(arr[i] == num){
                    System.out.println("Number is present");
                    b= true;
                    break;
                }
            }
            if(b == false){
                System.out.println("Number not present");
            }
    }

    public void binarySearchM1(){
        int arr[]={10,20,30,40,50,60};
        int num = 25;
        boolean b  =false;
        int l = 0;
        int h = arr.length-1;

        while(l<=h){
            int m=(l+h)/2;

            if(num==arr[m])
            {
                System.out.println("Searchable number found");
                b=true;
                break;
            }
            else if(num>arr[m]){
                l=m+1;
            }
            else if (num<arr[m])
            {
              h=m-1;
            }

        }
        if(b==false){
            System.out.println("Searchable number not found");
        }
    }

    public void binarySearchM2(){
        int arr[]={10,20,30,40,50,60};
        System.out.println(Arrays.binarySearch(arr,60));
    }

    public void bubbleSort(){
        int arr[]={10,5,15,20,18,40,50,60};
        System.out.println("Arrays before sorting "+Arrays.toString(arr));
        for(int i  =0; i<arr.length-1;i++){
            for(int j = 0;j<arr.length-1;j++){
                if(arr[j]>arr[j+1]){
                   int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }

        }
        System.out.println("Arrays after sorting "+Arrays.toString(arr));
    }

    public void ArraySortM1(){
        int arr[]={10,5,15,20,18,40,50,60};
        System.out.println("Arrays before sorting "+Arrays.toString(arr));
        Arrays.parallelSort(arr);
        System.out.println("Arrays after sorting "+Arrays.toString(arr));
    }

    public void ArraySortM2(){
        int arr[]={10,5,15,20,18,40,50,60};
        System.out.println("Arrays before sorting "+Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("Arrays after sorting" +Arrays.toString(arr));
    }

    public void ArraySortDescendingOrder(){
        Integer arr[]={10,5,15,20,18,40,50,60};
        System.out.println("Arrays before sorting "+Arrays.toString(arr));
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println("Arrays before sorting "+Arrays.toString(arr));
    }

  public void removeJunKSpaces(){
            String str = "#@21!231@1@2!@@2!!@eqwweewew$@@#23@#@";
            String s1 = str.replaceAll("[^a-zA-Z0-9]","");
            System.out.println("New string is "+s1);
  }

  public void removeWhiteSpaces(){
            String str = "Welcome to TESCO group Aritra Laha";
            String s1  = str.replace(" ","");
            System.out.println("New string is: "+s1);
  }

  public void OccurenceOfCharInAStringM1(){

            String str = "aritraLaha is a good guy";
            char a = 'a';
            int count = 0;
            boolean  b  =false;
            for(int i =0;i<str.length();i++){
                if(str.charAt(i) == 'a'){
                    count++;
                    b = true;
                }
            }
            System.out.println("reptitions are "+count);
            if(b==false){
                System.out.println("No repetitions found");
            }
  }

  public void OccurenceOfCharInAStringM2(String str){
            System.out.println("Occurences of a in the string is "+(str.length()-str.replace("a","").length()));

  }

  public void countWordsInAString(){

            String str = "Aritra Laha is alaways  a good guy";
            int count =0;
            boolean b = false;
            for(int i = 0;i<str.length()-1;i++){
                if(str.charAt(i)!=' ' && str.charAt(i+1)==' '){
                    count++;
                    b= true;
                }

            }
      System.out.println("No of words in string are "+(count+1));
      if(b==false){
          System.out.println("No words found");
      }
  }

  public void readDataFromFile() throws IOException {
        FileInputStream file = new FileInputStream("C:\\Users\\INE12400939\\Downloads\\git clone\\JavaProgramming\\src\\main\\java\\Package10thFeb\\file11.xlsx");
      XSSFWorkbook workbook = new XSSFWorkbook(file);
      XSSFSheet sheet = workbook.getSheet("Sheet1");
      int getTotalrows = sheet.getLastRowNum();
      int totalColumns = sheet.getRow(0).getLastCellNum();

      for(int row =0;row<=getTotalrows;row++){
          XSSFRow particularRow = sheet.getRow(row);
          for(int  cell = 0;cell<totalColumns;cell++){
              XSSFCell getCellData = particularRow.getCell(cell);
              System.out.println(getCellData.toString());
          }
      }
      workbook.close();
      file.close();




    }

}
