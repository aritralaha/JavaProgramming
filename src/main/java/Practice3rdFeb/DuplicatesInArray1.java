package Practice3rdFeb;

public class DuplicatesInArray1 {

    public static void main(String[] args){

       int a[] = {90,10,20,30,30};
       for(int i =0;i<a.length;i++){
           for(int j=i+1;j<a.length;j++){
               if(a[i]==a[j]){
                   System.out.println("Duplicate element is "+a[i]);
               }

           }
       }

    }
}
