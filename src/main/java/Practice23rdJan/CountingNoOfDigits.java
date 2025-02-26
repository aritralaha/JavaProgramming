package Practice23rdJan;

public class CountingNoOfDigits {

    int num = 123;
    int count = 0;

    public void counttheDigits(){
        while(this.num>0){
            this.num = this.num/10;
            count++;
        }
        System.out.println(count);
    }

}
