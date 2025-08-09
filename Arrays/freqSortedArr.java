import java.util.HashMap;

public class freqSortedArr{
    public static void method(int[] arr){
        int n = arr.length;
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i=0; i<n; i++){
            int key = arr[i];
            if(hm.containsKey(key)){
                hm.put(key, hm.get(key) + 1);
            }else{
                hm.put(key, 1);
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}