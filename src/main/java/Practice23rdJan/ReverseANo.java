package Practice23rdJan;

public class ReverseANo {

    int num = 123456;
    int rev = 0;
    StringBuffer sb;
    StringBuilder sbl;

    public void reverseANoM1(){

        while(this.num!=0){
            this.rev = this.rev*10 + num%10;
            this.num = this.num/10;
        }
        System.out.println("Reversed number is "+this.rev);
    }

    public StringBuffer reverseANoM2(){
        sb = new StringBuffer(String.valueOf(this.num));
        StringBuffer rev =sb.reverse();
        System.out.println("Reversed number is "+rev);
        return rev;
    }

    public StringBuilder reverseANoM3(){
        sbl =new StringBuilder();
        sbl.append(this.num);
        StringBuilder rev = sbl.reverse();
        System.out.println("Reversed number is "+rev);
        return rev;
    }

}
