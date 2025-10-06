package Arrays;

public class mergeTwoSortedArr{
    public static void mergeSortArr(int[] arr1, int[] arr2){
        int n = arr1.length;
        int m = arr2.length;
        int i = 0;
        int j = 0;
        int[] newArr = new int[n+m];
        int index = 0;
        while(i<n && j<m){
            if(arr1[i] >= arr2[j]){
                newArr[index] = arr2[j];
                index++;
                j++;
            }else{
                newArr[index] = arr1[i];
                index++;
                i++;
            }
        }
        while(i<n){
            newArr[index] = arr1[i];
            index++;
            i++;
        }
        while(j<m){
            newArr[index] = arr2[j];
            index++;
            j++;           
        }
    }
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}