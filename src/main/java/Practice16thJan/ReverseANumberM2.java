package Practice16thJan;

import java.util.Scanner;

public class ReverseANumberM2 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number");
    int num = sc.nextInt();
    StringBuffer sb = new StringBuffer(String.valueOf(num));
    StringBuffer revNum=sb.reverse();
    System.out.println("Revered number is "+revNum);
}
}
