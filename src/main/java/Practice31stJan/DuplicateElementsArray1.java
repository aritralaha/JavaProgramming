package Practice31stJan;

public class DuplicateElementsArray1 {

    public static void main(String[] args){
        String a[] = {"Aritra","Laha","Kasturi","Dhoni","Aritra"};
        Boolean b = false;
        for(int i=0;i<a.length;i++){
            for(int j= i+1;j<a.length;j++){
                if(a[i].equals(a[j])){
                    System.out.println("Duplicate element is "+a[i]);
                    b= true;
                }
            }
        }
        if(b==false){
            System.out.println("No Duplicate element found");
        }
    }
}
