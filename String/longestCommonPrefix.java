package String;

public class longestCommonPrefix {
    public static String leetcode14(String[] arr){
        if(arr.length == 0){
            return "";
        }
        String str = arr[0];
        for(int i=0; i<str.length(); i++){
            char c = str.charAt(i);
            for(int j=1; j<arr.length; j++){
                if(i>=arr[j].length() || arr[j].charAt(i)!=c){
                    return str.substring(0, i);
                }
            }
        }
        return str;
    }
    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        System.out.println(leetcode14(strs));
    }
}
