package NaveenPrograms;


import java.util.HashSet;

public class DuplicateElementInArray {

    public void duplicate1(){
        int a[] = {10, 20, 30, 10, 20, 40, 60};
        boolean b = false;
        for(int i =0;i<a.length;i++){
            for(int j = i+1;j<a.length;j++){
                if(a[i]==a[j]){
                    System.out.println("Repetitive element is "+a[i]);
                    b= true;
                }
            }
        }
        if(b==false){
            System.out.println("No repetitive element found");
        }

    }

    public void duplicate2(){
        int a[] = {10, 20, 30, 10, 20, 40, 60};
        boolean b = false;
        HashSet<Integer> hs = new HashSet();
        for(int i = 0;i<a.length;i++){
            if(hs.add(a[i])==false){
                System.out.println("repetitive element is "+a[i]);
                b=true;
            }
        }
        if(b==false){
            System.out.println("No repetitive element found");
        }

    }
    public static void main(String[] args) {
       DuplicateElementInArray dp = new DuplicateElementInArray();
       dp.duplicate1();
       dp.duplicate2();
    }
}
