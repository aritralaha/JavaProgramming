package Practice16thJan;

import java.util.Scanner;

public class ReverseANumberM3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        StringBuilder sbl = new StringBuilder();
        sbl.append(num);
        StringBuilder revNum = sbl.reverse();
        System.out.println("Revered number is "+revNum);

    }
}
