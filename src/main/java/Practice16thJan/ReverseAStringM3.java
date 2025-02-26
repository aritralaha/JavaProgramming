package Practice16thJan;

public class ReverseAStringM3 {

    public static void main(String[] args) {

        String str = "Tesco";
        StringBuffer sb = new StringBuffer(str);
        StringBuffer revStr = sb.reverse();
        System.out.println("Reversed string is "+revStr);

    }
}
