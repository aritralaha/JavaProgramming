package Practice28thJan;

public class CountOddEvenDigits {

    public void countOddEven(int x){
        int org_num = x;
        int num =x;
        int e = 0;
        int o = 0;
        while(num!=0){
            if(num%2 ==0){
                e++;
            }
            else{
                o++;
            }
            num=num/10;
        }

        System.out.println("no of even digits is "+e);
        System.out.println("no of even digits is "+o);
    }
}
