package NaveenPrograms;

public class ArmstrongNumber {
    public ArmstrongNumber(int x){
        int org_num =x;
        int num  =x;
        int cube = 0;
        while(num!=0){
            int r = num%10;
            cube = cube +(r*r*r);
            num= num/10;
        }
        if(cube==org_num){
            System.out.println("Number is Armstrong");
        }
        else{
            System.out.println("Number is not Armstrong");
        }
        }


        public static void main(String[] args){
        ArmstrongNumber am = new ArmstrongNumber(154);
        }
    }

