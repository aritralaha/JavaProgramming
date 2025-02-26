package Practice28thJan;

public class ReverseANo {

    public void reverseANoM1(int x) {
        int num = x;
        int rev = 0;
        System.out.println("the actual number is " + num);
        while (num > 0) {
            rev = rev * 10 + num % 10;
            num = num / 10;
        }
        System.out.println("the reversed number is " + rev);
    }

    public void reverseANoM2(int x) {
        int num = x;
        System.out.println("the actual number is " + num);
        StringBuffer sb = new StringBuffer(String.valueOf(num));
        StringBuffer rev = sb.reverse();
        System.out.println("the reversed number is " + rev);
    }

    public void reverseANoM3(int x) {
        int num = x;
        System.out.println("the actual number is " + num);
        StringBuilder sbl = new StringBuilder();
        sbl.append(num);
        StringBuilder rev = sbl.reverse();
        System.out.println("the reversed number is " + rev);
    }
}