package Practice23rdJan;

import java.util.Scanner;

public class Swapping2Numbers extends MainClass {

    public int num1;
    public int num2;
    public Scanner sc = new Scanner(System.in);

    public void using3rdVariable(){
        System.out.println("Enter first number");
        num1 = sc.nextInt();
        System.out.println("Enter first number");
        this.num2=sc.nextInt();
        int c;
        c=num1;
        num1=num2;
        num2=c;
        System.out.println("first number after swapping is "+num1);
        System.out.println("second number after swapping is "+num2);
    }

    public void withoutUsing3rdVarM1(int x, int y){
        System.out.println("Enter 1st number "+x);
        System.out.println("Enter 2nd number "+y);
        x =x+y; //30 = 10+20
        y=x-y;
        x=x-y;
        System.out.println("first number after swapping is "+x);
        System.out.println("second number after swapping is "+y);
    }

    public void withoutUsing3rdVarM2(int x, int y){
        System.out.println("Enter 1st number "+x);
        System.out.println("Enter 2nd number "+y);

        x=x*y; //200=10*20
        y = x/y;// 200/20
        x=x/y;
        System.out.println("first number after swapping is "+x);
        System.out.println("second number after swapping is "+y);

    }

}
