package String;

public class stringSubSequence{
    public boolean subSeqString(String s1, String s2){
        int i = 0;
        int j = 0;
        while(i < s1.length() && j < s2.length()){
            if(s2.charAt(j) == s1.charAt(i)){
                i++;
            }
            j++;
        }
        
        if(i == s1.length()){
            return true;
        } return false;
    }
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}