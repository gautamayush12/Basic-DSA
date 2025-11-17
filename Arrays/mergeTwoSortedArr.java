package Arrays;

public class mergeTwoSortedArr{
    public static void mergeSortArr(int[] arr1, int[] arr2){
        int n1 = arr1.length;
        int n2 = arr2.length;
        int ptr1 = 0;
        int ptr2 = 0;
        int[] merged = new int[n1+n2];
        int index = 0;
        while(ptr1<arr1.length && ptr2<arr2.length){
            if(arr1[ptr1]<arr2[ptr2]){
                merged[index++] = arr1[ptr1];
                ptr1++;
            }else{
                merged[index++] = arr2[ptr2];
                ptr2++;
            }
        }
        //Merge Remaining Elements
        while(ptr1<arr1.length){
            merged[index++] = arr1[ptr1];
            ptr1++;
        }
        while(ptr2<arr2.length){
            merged[index++] = arr2[ptr2];
            ptr2++;
        }
    }
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}