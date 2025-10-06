package Arrays;

public class removeDups{
    public static void remDuplicates(int[] arr){
        int n = arr.length;
        int count = 1;
        for(int i = 1; i<n; i++){
            if(arr[i] != arr[count-1]){
                arr[count] = arr[i];
                count++;
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
    
}