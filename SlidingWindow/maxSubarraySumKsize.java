package SlidingWindow;

public class maxSubarraySumKsize{
    public static int maxSumKSize(int[] arr, int k){
        int n = arr.length;
        int maxSum = 0;

        // //Brute Force
        // for(int i=0; i<n-k; i++){
        //     int sum = 0;
        //     for(int j=i; j<i+k; j++){
        //         sum+=arr[j];
        //     }
        //     maxSum = Math.max(maxSum, sum);
        // }

        //Fixed Size Sliding Window
        //Calculate First k size subarray using brute force
        int fixSum = 0;
        for(int i=0; i<k; i++){
            fixSum+=arr[i];
        }
        maxSum = fixSum;
        //Slide the Window
        int index=0;
        for(int j=k; j<n; j++){
            fixSum+=arr[j];
            fixSum-=arr[index];
            index++;
            maxSum = Math.max(maxSum, fixSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}