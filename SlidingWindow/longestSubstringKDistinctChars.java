package SlidingWindow;

public class longestSubstringKDistinctChars{
    public static int longestSubstrKDistinctChars(String s, int k){
        //Brute Force
        int n = s.length();
        int maxLen = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                String substr = s.substring(i, j + 1);
                int[] freq = new int[26];
                int distinctCount = 0;
                for (int m = 0; m < substr.length(); m++) {
                    char ch = substr.charAt(m);
                    if (freq[ch - 'a'] == 0) {
                        distinctCount++;
                    }
                    freq[ch - 'a']++;
                }
                if (distinctCount <= k) {
                    maxLen = Math.max(maxLen, substr.length());
                }
            }
        }
        //Variable Size Sliding Window
        //HashSet has a loophole of not storing the frequency of characters:
        //Because in the window it doesn't maintain the order of characters + their duplicates.
        //So we use HashMap to store the frequency of characters.
        return maxLen;
    }
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}