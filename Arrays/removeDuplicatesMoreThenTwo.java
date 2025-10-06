package Arrays;

public class removeDuplicatesMoreThenTwo{
    public static void remDupsTwice(int[] arr){
        int n = arr.length;
        int count = 1;
        int index = 1;
        for(int i=1; i<n; i++){
            if(arr[i] == arr[i-1]){
                count++;
            }else{
                count = 1;
            }
            
            if(count<=2){
                arr[index] = arr[i];
                index++;
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}