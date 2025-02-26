package NaveenPrograms;

public class removeJunkChars {

    public static void main(String[] args) {
        String str = "@##@#A@#r@#i@#t##$#r!!!!a";
        String reqStr = str.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println("Required string is "+reqStr);
    }
}
