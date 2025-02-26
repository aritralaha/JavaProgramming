package NaveenPrograms.AbstractSample;

public class TestBank {

    public static void main(String[] args){
        YesBank yb = new YesBank();
        yb.username();
        yb.password();
        yb.loginpage();
        System.out.println("***********************");
        AbstractionClassRBI ab = new YesBank();
        ab.username();
        ab.password();
        ab.loginpage1();

    }




}
