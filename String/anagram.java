package String;

import java.util.Arrays;

public class anagram{
    public static boolean anagramCheck(String s, String t){
        if(s.length() != t.length()){
            return false;
        }
        char[] c = s.toCharArray();
        char[] d = t.toCharArray();
        Arrays.sort(c);
        Arrays.sort(d);
        for(int i=0; i<c.length; i++){
            if(c[i] != d[i]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}