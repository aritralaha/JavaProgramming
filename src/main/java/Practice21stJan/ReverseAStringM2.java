package Practice21stJan;

public class ReverseAStringM2 {

    public static void main(String[] args) {

        String str = "SunShine";


        StringBuffer sb = new StringBuffer(str);
        StringBuffer rev =sb.reverse();

        System.out.println(rev);

    }
}
