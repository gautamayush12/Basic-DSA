package Sorting;

public class mergeSort{
    //Conquer Technique
    public static void conquer(int[] arr, int si, int mid, int ei){
        //Create a New Merged array
        int[] merged = new int[ei-si+1];
        //Index for Merged Array
        int index = 0;
        //Index for 1st half
        int indx1 = si;
        //Index for 2nd half
        int indx2 = mid+1;
        while(indx1<=mid && indx2<=ei){
            if(arr[indx1]<arr[indx2]){
                merged[index] = arr[indx1];
                index++;
                indx1++;
            }else{
                merged[index] = arr[indx2];
                index++;
                indx2++;
            }
        }

        //Final Leftover Elements to be Added in New Merged Array
        while(indx1<=mid){
            merged[index] = arr[indx1];
            index++;
            indx1++;
        }
        while(indx2<=ei){
            merged[index] = arr[indx2];
            index++;
            indx2++;
        }
        //Copy Merged Array to Original Array
        for(int i=0; i<merged.length; i++){
            arr[si] = merged[i];
            si++;
        }
    } 

    //Divide Technique
    public static void divide(int[] arr, int si, int ei){
    //Base Case
    if(si>=ei){
        return;
    }
    int mid = si + (ei-si)/2;
    //Divide 1st Half
    divide(arr, si, mid);
    //Divide 2nd Half
    divide(arr, mid+1, ei);

    //Conquer
    conquer(arr, si, mid, ei);
}
    public static void main(String[] args) {
        int[] arr = {6, 3, 9, 5, 2, 8};
        int n = arr.length;
        divide(arr, 0 , n-1); 
        //Print Sorted Array
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}