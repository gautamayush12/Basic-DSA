public class containerWithMostWater{
    public static int mostWater(int[] arr){
        int n = arr.length;
        int max_area = 0;
        int left = 0;
        int right = n-1;
        while(left < right){
            int width = right - left;
            int ht = Math.min(arr[left], arr[right]);
            int area = width * ht;
            if(area > max_area){
                max_area = area;
            }
            if(arr[left] < arr[right]){
                left++;
            }else{
                right --;
            }

        }
        return max_area;
    }
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}