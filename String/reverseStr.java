package String;

public class reverseStr{
    public static void revStr(char[] str){
        int left = 0;
        int right = str.length-1;
        while(left<right){
            char temp = str[right];
            str[right] = str[left];
            str[left] = temp;
            left++;
            right--;
        }
    }
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}