package String;

public class leftMostRepeatingChar{
    public int leftRepChar(String str){
        //Brute Force Approach
        // for(int i=0; i<str.length(); i++){
        //     for(int j=0; j<str.length(); j++){
        //         if(i!=j && str.charAt(i) == str.charAt(j)){
        //             return i;
        //         }
        //     }
        // }

        //Effecient one
        int[] arr = new int[256];
        for(int i=0; i<str.length(); i++){
            arr[str.charAt(i)]++;
        }

        for(int i=0; i<str.length(); i++){
            if(arr[str.charAt(i)] > 1){
                return i;
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}