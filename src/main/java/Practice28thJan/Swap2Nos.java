package Practice28thJan;

public class Swap2Nos {

    public void using3rdVariable(int x, int y){
       int  x1=x;
       int  y1=y;
       System.out.println("Values before swapping are "+x1+" "+y1);
       int c;
       c= x1;
       x1=y1;
       y1=c;
       System.out.println(" values after swapping are "+x1+" "+y1);
    }

    public void withoutUsing3rdVarM1(int x, int y){
        int x1 = x;
        int y1 = y;
        System.out.println("Values before swapping are "+x1+" "+y1);
        x1 = x1+y1;
        y1= x1-y1;
        x1= x1-y1;
        System.out.println(" values after swapping are "+x1+" "+y1);
    }

    public void withoutUsing3rdVarM2(int x, int y){
        int x1 = x;
        int y1 = y;
        System.out.println("Values before swapping are "+x1+" "+y1);
        x1 = x1*y1;
        y1 = x1/y1;
        x1 = x1/y1;
        System.out.println(" values after swapping are "+x1+" "+y1);
    }
}
