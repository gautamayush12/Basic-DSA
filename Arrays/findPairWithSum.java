package Arrays;

public class findPairWithSum{
    public static int[] findGivenPairSum(int[] arr, int sum){
        int n = arr.length;
        for(int i=0; i<n; i++){
            for(int j=1; j<n; j++){
                if(arr[i]+arr[j] == sum){
                    if(i > j){
                        return new int[] {i,j};
                    }else{
                        return new int[] {j,i};
                    }
                }
            }
        } return new int[0];
    }
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}