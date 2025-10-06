package Arrays;

public class largestEle{
    public static int largest(int[] arr){
        int n = arr.length;
        int k = arr[0];
        for(int i=0; i<n; i++){
            if(arr[i]>k){
                k = arr[i];
            }
        } return k;
    }
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}