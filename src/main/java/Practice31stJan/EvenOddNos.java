package Practice31stJan;

public class EvenOddNos {
    public static void main(String[] args){
        int arr[] = {1,2,3,4,5,6};
        boolean b = true;

        System.out.println("Even elements are ");
        for(int i =0;i<arr.length;i++){
            if(arr[i]%2 ==0){
                System.out.println(arr[i]);
            }
        }


    }
}
