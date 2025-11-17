package Arrays;

import java.util.*;

public class threeSum{
    public static List<List<Integer>> threeSumSoln(int[] nums) {
        if(nums.length<3){
            return new ArrayList<>();
        }
        HashSet<List<Integer>> hs = new HashSet<>();
        Arrays.sort(nums);
        for(int i=0; i<nums.length-2; i++){
            int next = i+1;
            int end = nums.length-1;
            while(next<end){
                int sum = nums[i] + nums[next] + nums[end];
                List<Integer> ls = new ArrayList<>();
                if(sum == 0){
                    ls.add(nums[i]);
                    ls.add(nums[next]);
                    ls.add(nums[end]);
                    next++;
                    end--;
                    hs.add(ls);
                }else if(sum > 0){
                    end--;
                }else{
                    next++;
                }
            }
        }
        return new ArrayList<List<Integer>>(hs);
    }
    public static void main(String[] args) {
        int[] test = {-1, 0, 1, 2, -1, -4};
        System.out.println(threeSumSoln(test));
    }
}