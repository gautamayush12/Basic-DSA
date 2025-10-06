package Arrays;

public class moveZeroesEnd{
    public static void mvZerEnd(int[] arr){
        int n = arr.length;
        int idx = 0;
        for(int i=0; i<n; i++){
            if(arr[i]!=0){
                arr[idx] = arr[i];
                idx++;
            }
        }
        while(idx<n){
            arr[idx] = 0;
            idx++;
        }
    }
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}