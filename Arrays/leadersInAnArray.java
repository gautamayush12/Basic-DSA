package Arrays;

public class leadersInAnArray{
    public static void method(int[] arr){
        
         int n = arr.length;
         int max[] = new int[n];
         int index = 0;
         int maxFromLast = arr[n-1];
         max[index] = maxFromLast;
         index = index + 1;
        //  for(int i=0; i<n; i++){
        //     boolean isLeader = true;
        //     for(int j=i+1; j<n; j++){
        //         if(arr[i] < arr[j]){
        //             isLeader = false;
        //             break;
        //         }else{
        //             max[index] = arr[i];
        //             index = index+1;
        //         }
        //     }
        //  }
        for(int i=n-2; i>=0; i--){
            if(arr[i] >= maxFromLast){
                maxFromLast = arr[i];
                max[index] = maxFromLast;
                index = index + 1;
            }
        }
        


    }
    public static void main(String[] args) {
        System.out.println("Hello from sample.java!");
    }
}