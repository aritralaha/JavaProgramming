package Practice21stJan;

public class ReverseAStringM3 {

    public static void main(String[] args) {

        String str = "SunShine";
        String rev = "";

        char a[]= str.toCharArray();

        for(int i =a.length-1;i>=0;i--){
            rev= rev+a[i];
        }

        System.out.println(rev);

    }
}
