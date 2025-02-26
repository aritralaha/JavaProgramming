package NaveenPrograms;

public class OverLoadingMainMethod {
    public static void main(String[] args){
        System.out.println("Main method 1");
        main("Aritra");
        main(10);
        main('a');
        LargestNumberInArray.main(args);
    }
    public static void main(String args){
        System.out.println("Main method 2");
    }

    public static void main(int args){
        System.out.println("Main method 3");
    }
    public static void main(char args){
        System.out.println("Main method 4");
    }
}
