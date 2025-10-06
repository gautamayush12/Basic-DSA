package SlidingWindow;

import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacter{
    public static int lengthOfLongestSubstring(String s) {
        //Brute Force
        int n = s.length();
        int longestSubstringLength = 0;
        if(n == 0){
            return 0;
        }
        for(int i=0; i<n; i++){
            HashSet<Character> hs = new HashSet<>();
            for(int j=i; j<n; j++){
                if(hs.contains(s.charAt(j))){
                    break;
                }else{
                    hs.add(s.charAt(j));
                }
            }
            longestSubstringLength = Math.max(hs.size(), longestSubstringLength);
        }
        return longestSubstringLength;
    }
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}