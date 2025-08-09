public class checkSorted{
    public static boolean chkSort(int[] arr){
        int n = arr.length;
        for(int i=1; i<n; i++){
            if(arr[i]<arr[i-1]){
                return false;
            }
        } return true;
    }
    public static void main(String[] args) {
        int[] arr = {7, 2, 2, 4, 5};
        System.out.println("Is sorted? " + chkSort(arr));
    }
}