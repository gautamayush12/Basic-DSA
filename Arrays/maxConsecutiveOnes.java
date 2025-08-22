public class maxConsecutiveOnes{
    public static int maxCountOnes(int[] arr){
        int n = arr.length;
        int res = 0;
        int oneCount = 0;
        for(int i=0; i<n; i++){
            if(arr[i] == 1){
                oneCount += 1;
                if (oneCount > res){
                    res = oneCount;
                }
            }else{
                oneCount = 0;
            }
        } return res;
    }
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}