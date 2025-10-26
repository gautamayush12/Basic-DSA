package BinarySearch;

public class firstAndLastIdxTarget{

    public static int[] leetcode34(int[] arr, int target){
        int n = arr.length;
        int left = 0;
        int right = n-1;
        int first = -1;
        int second = -1;
        
        //First Occurrence
        while(left<=right){
            int mid = left + (right-left)/2;
            if(arr[mid] == target){
                first = mid;
                right = mid-1; //Traverse pre mid elements
            }else if(arr[mid]<target){
                left = mid+1;
            }else{
                right = mid-1;
            }
        }
        left = 0;
        right = n-1;
        //Second Occurrence
        while(left<=right){
            int mid = left + (right-left)/2;
            if(arr[mid] == target){
                second = mid;
                left = mid+1; //Traverse post mid elements
            }else if(arr[mid]<target){
                left = mid+1;
            }else{
                right = mid-1;
            }
        }
        return new int[] {first,second};
    }    
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}