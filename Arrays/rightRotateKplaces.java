package Arrays;

public class rightRotateKplaces{
    public static void rightRotate(int[] arr, int k){
      //1 Normal Approach 
        // int n =arr.length;
        // //1 Store the last k elements in a temporary array
        // int[] temp = new int[k];
        // for(int i=0; i<k; i++){
        //     temp[i] = arr[n-k+i];
        // }
        // //2 Shift the remaining elements to the right
        // for(int i=n-1; i>=k; i--){
        //     arr[i] = arr[i-k];
        // }
        // //3 Copy the temporary array elements to the start of the original array
        // for(int i=0; i<k; i++){
        //     arr[i] = temp[i];
        // }

     //2 Optimized Approach using Reverse
        int n = arr.length;
        // Reversing the last k elements
        reverse(arr, n-k, n-1);    
        // Reversing the remaining elements
        reverse(arr, 0, n-k-1);
        // Reversing the entire array
        reverse(arr, 0, n-1);


    }
    public static void reverse(int[] arr, int low, int high){
        while(low<high){
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
    }
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}