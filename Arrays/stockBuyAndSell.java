public class stockBuyAndSell{
    public static void stockProbOne(int[] arr){
        int n = arr.length;
        int max_profit = 0;
        int min_price = arr[0];
        // for(int i=0; i<n; i++){
        //     for(int j=i+1; j<n; j++){
        //         int curr_profit = arr[j] - arr[i];
        //         if(curr_profit > max_profit){
        //             max_profit = curr_profit;
        //         }
        //     }
        // }
        for(int i=0; i<n; i++){
            int profit = arr[i] - min_price;
            if(profit > max_profit){
                max_profit = profit;
            }
            if(arr[i] < min_price){
                min_price = arr[i];
            }
        } System.out.println(max_profit);
    }
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}