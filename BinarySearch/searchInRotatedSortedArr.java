package BinarySearch;

public class searchInRotatedSortedArr{
    public static int leetcode33(int[] arr, int target){
        int left = 0;
        int right = arr.length-1;
        while(left<=right){
            int mid = left + (right-left)/2;
            if(arr[mid] == target){
                return mid;
            }
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
        return -1;
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}