package NaveenPrograms;

public class Swap2numbers {
    public static void m1(int x,int y){
        System.out.println("Original value is "+x+" & "+y);
        int temp=x;
        x=y;
        y=temp;
        System.out.println("Swapped value is "+x+" & "+y);
    }

    public static void m2(int x,int y) {
        System.out.println("Original value is " + x + " & " + y);
        x = x+y;
        y= x-y;
        x= x-y;
        System.out.println("Swapped value is "+x+" & "+y);
    }

    public static void m3(int x,int y) {
        System.out.println("Original value is " + x + " & " + y);
        x = x*y;
        y = x/y;
        x= x/y;
        System.out.println("Swapped value is "+x+" & "+y);
    }
    public static void main(String[] args){

        //m1(10,20);
        //m2(30,40);
        m3(50,60);

    }
}
