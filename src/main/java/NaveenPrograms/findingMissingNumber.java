package NaveenPrograms;

public class findingMissingNumber {

    public static void main(String[] args) {
        int a[] = {1, 2, 3, 5, 6};
        int sum = 0;
        int sum1 = 0;
        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];
        }
        System.out.println("Required sum is " + sum);

        for (int j = 1; j <= 6; j++) {
            sum1 = sum1 + j;
        }
        System.out.println("Required sum is " + sum1);
        System.out.println("Required missing number is "+(sum1-sum));
    }
}
