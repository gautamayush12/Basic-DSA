package BinarySearch;

public class searchInRotatedSortedArr2{
    public static boolean leetcode81(int[] arr, int target){
        int left = 0;
        int right = arr.length-1;
        while(left<=right){
            int mid = left + (right - left) / 2;
            if(arr[mid] == target){
                return true;
            }
            if(arr[left] == arr[mid] && arr[mid] == arr[right]){
                left = left+1;
                right = right-1;
                continue;
            }
            //Identify Sorted Halves
            if(arr[left]<=arr[mid]){
                if(target>=arr[left] && target<arr[mid]){
                    right = mid-1;
                }else{
                    left = mid+1;
                }
            }else{
                if(target>=arr[mid] && target<=arr[right]){
                    left = mid+1;
                }else{
                    right = mid-1;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}