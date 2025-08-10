package String;

public class mostFreqOccurence{
    public static void method(String str){
        int maxFreq = 0;
        String maxChar = "";
        int n = str.length();
        for(int i=0; i<n; i++){
            char ch = str.charAt(i);
            int count = 0;
            for(int j=0; j<n; j++){
                if(str.charAt(j) == str.charAt(i)){
                    count++;
                }
            }
            if(count > maxFreq){
                maxFreq = count;
                maxChar = String.valueOf(ch);
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}