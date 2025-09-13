// package Arrays;

public class validMountainArray{
    public boolean valMouArr(int[] arr) {
        int n = arr.length;
        int peaks = 0;
        if(n<3){
            return false;
        }else{
            for(int i=1; i<n-1; i++){
                int prev = arr[i-1];
                int curr = arr[i];
                int next = arr[i+1];
                if(prev==curr || curr==next){
                    return false;
                }
                if(prev>curr && curr<next){
                    return false;
                }
                if(curr>next && curr>prev){
                    peaks++;
                    if(peaks>1){
                        return false;
                    }
                }
            }
        }
        return peaks == 1;
    }
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}