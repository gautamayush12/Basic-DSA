public class leftRotateKplaces{
    public static void leftRotate(int[] arr, int k){
        // int n = arr.length;
        // //1 Store the first k elements in a temporary array
        // int[] temp = new int[k];
        // for(int i=0; i<k; i++){
        //     temp[i] = arr[i]; 
        // }
        // //2 Shift the remaining elements to the left
        // for(int i=k; i<n; i++){
        //     arr[i-k] = arr[i];
        // }
        // //3 Copy the temporary array elements to the end of the original array
        // for(int i=0; i<k; i++){
        //     arr[n-k+i] = temp[i];
        // }

        //Optimized Approach using Reverse
        int n = arr.length;
        // Reversing the first k elements
        reverse(arr, 0, k-1);    
        // Reversing the last n-k elements
        reverse(arr, k, n-1);
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