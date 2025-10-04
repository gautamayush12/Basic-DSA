package Stack;

import java.util.Stack;

public class backspaceString{
        static boolean backspaceStringCompare(String S, String T) {
        // StringBuilder sb1 = new StringBuilder();
        // for(int i=0; i<S.length(); i++){
        //     char c = S.charAt(i);
        //     if(c == '#'){
        //         if(sb1.length() > 0){
        //             sb1.deleteCharAt(sb1.length() - 1);
        //         }
        //     }else{
        //         sb1.append(c);
        //     }
        // }

        // StringBuilder sb2 = new StringBuilder();
        // for(int i=0; i<T.length(); i++){
        //     char c = T.charAt(i);
        //     if(c == '#'){
        //         if(sb2.length() > 0){
        //             sb2.deleteCharAt(sb2.length() - 1);
        //         }
        //     }else{
        //         sb2.append(c);
        //     }
        // }
        // if(sb1.toString().equals(sb2.toString())){
        //     return true;
        // }return false;
        return helperFxn(S).equals(helperFxn(T));
    }
    public static String helperFxn(String s){
        Stack<Character> sk = new Stack<>();
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(c=='#'){
                if(!sk.isEmpty()){
                    sk.pop();
                }
            }else{
                sk.push(c);
            }
        }return String.valueOf(sk);
    }
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}