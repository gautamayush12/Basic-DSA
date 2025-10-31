package BinarySearch;

public class minInRotatedSortedArr{
    public static int leetcode153(int[] arr){
        int left = 0;
        int right = arr.length-1;
        while(left<right){
            int mid = left + (right-left)/2;
            if(arr[mid]>arr[right]){
                left = mid+1;
            }else{
                right = mid;
            }
        }
        return arr[left];
    }
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}