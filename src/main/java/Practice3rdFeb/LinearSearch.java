package Practice3rdFeb;

public class LinearSearch {

    public static void main(String[] args){

        int a[]= {10,20,30,40,50};
        int num =20;
        boolean b =false;
        for(int i =0;i< a.length;i++){
            if(a[i]==num){
                b=true;
            }
        }
        if(b==false){
            System.out.println("Search not found");
        }
        else{
            System.out.println("Search found");
        }

    }
}
