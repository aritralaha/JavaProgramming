package NaveenPrograms.InterfaceSample;

public class YesBank implements InterfaceClassRBI{

    @Override
    public void username() {
        System.out.println("YesBank Username");
    }

    @Override
    public void password() {
        System.out.println("YesBank password");
    }

    @Override
    public void loginpage() {
        System.out.println("YesBank loginPage");
    }

    public void LoginUI(){
        System.out.println("YesBank loginUI");
    }
}
