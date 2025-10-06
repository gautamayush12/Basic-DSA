package Arrays;

public class longestEvenOddSubarray{
    public static int myFunc(int[] arr){
        int n = arr.length;
        int res = 0;
        for(int i=0; i<n; i++){
            int curr = 1;
            for(int j=i+1; j<n; j++){
                if((arr[j]%2 == 0 && arr[j-1]%2 != 0) || (arr[j]%2 != 0 && arr[j-1]%2 == 0)){
                    curr++;
                    res = Math.max(res, curr);
                }else{
                    break;
                }

            } 
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}