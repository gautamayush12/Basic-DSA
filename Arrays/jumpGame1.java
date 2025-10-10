package Arrays;

public class jumpGame1{
    public static boolean jumpGameOne(int[] arr){
        int n = arr.length;
        int reachableIndex = 0;
        for(int i=0; i<n; i++){
            if(i > reachableIndex){
                return false;
            }
            reachableIndex = Math.max(reachableIndex, i+arr[i]);
            if(reachableIndex>=n-1){
                return true;
            }
        } return true;
    }
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}