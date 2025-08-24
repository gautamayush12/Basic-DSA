package String;
//Leetcode 151
public class reverseWordInStr{
    public static String revStrWord(String str){
        String[] newStr = str.trim().split("\\s+");
        String[] newArr = new String[newStr.length];
        int index = 0;
        for(int i=newStr.length-1; i>=0; i--){
            newArr[index] = newStr[i];
            index++;
        }
        String result = String.join(" ", newArr);
        return result;
    }
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}