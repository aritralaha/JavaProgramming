package NaveenPrograms.InterfaceSample;

public class TestBank {

    public static void main(String[] args) {
        YesBank yb = new YesBank();
        yb.username();
        yb.password();
        yb.loginpage();
        yb.LoginUI();
        System.out.println("*****************************");
        InterfaceClassRBI ib = new YesBank();
        ib.username();
        ib.password();
        ib.loginpage();


    }
}
