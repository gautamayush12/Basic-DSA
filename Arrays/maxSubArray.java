public class maxSubArray{
    public static int myFunc(int[] arr){
        int n = arr.length;
        int max_sum = 0;
        for(int i=0; i<n; i++){
            int curr_sum = 0;
            for(int j=i; j<n; j++){
                curr_sum += arr[j];
                if(curr_sum > max_sum){
                    max_sum = curr_sum;
                }
            } 
        } 
        return max_sum;
    }
    public static void main(String[] args) {
        int x = myFunc(new int[]{1,2,3,4,5});
        System.out.println(x);
    }
}