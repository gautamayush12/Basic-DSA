public class maxDiffProblem {
    public static void bruteForce(int[] arr){
        int n = arr.length;
        int maxDiff = 0;
        int diff = 0;
        for(int i=0; i<n-1; i++){
            for(int j=i+1; j<n; j++){
                diff = arr[j] - arr[i];
                if(diff > maxDiff){
                    maxDiff = diff;
                }
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}