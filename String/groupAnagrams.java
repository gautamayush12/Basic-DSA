package String;

//BruteForce

import java.util.ArrayList;
import java.util.List;

public class groupAnagrams{
    public List<List<String>> grpAnagrams(String[] strs){
        int n = strs.length;
        boolean[] visited = new boolean[n];
        List<List<String>> res = new ArrayList<>();

        for(int i=0; i<n; i++){
            if(visited[i] == true){
                continue;
            }
            List<String> group = new ArrayList<>();
            group.add(strs[i]);
            visited[i] = true;
            for(int j=i+1; j<n; j++){
                if(!visited[j] && isAnagram(strs[i], strs[j])){
                    group.add(strs[j]);
                    visited[j] = true;
                }
            }
            res.add(group);
        }
        return res;
    }
    public boolean isAnagram(String s, String t){
        int[] freqArr = new int[26];
        for(int i=0; i<s.length(); i++){
            freqArr[s.charAt(i)-'a']++;
        }

        for(int i=0; i<t.length(); i++){
            freqArr[t.charAt(i)-'a']--;
        }
        for(int i=0; i<freqArr.length; i++){
            if(freqArr[i]!=0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        groupAnagrams ga = new groupAnagrams();
        String[] test = {"eat", "tea", "ate", "tan", "ant", "bat"};
        System.out.println(ga.grpAnagrams(test));
    }
}