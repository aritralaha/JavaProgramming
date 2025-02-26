package Practice3rdFeb;

public class MaXMinElement {

    public static void main(String[] args){
        int a[] ={810,800,300,500,830};
        int max = a[0];

        for(int i =0;i<a.length;i++){
            if(a[i]>max){
                max = a[i];
            }
        }
        System.out.println(max);
    }
}
