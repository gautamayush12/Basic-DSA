package Stack;

import java.util.*;

public class validParantheses{
    public static String paranValid(String s){
        //1 Create an empty Stack
        Stack<Character> mysc = new Stack<>();
        //2 Loop through each string character
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '(' || ch == '[' || ch == '{'){
                mysc.push(ch);
            } else{
                if(mysc.size() == 0){
                    return "false";
                } else if(ch == ')' && mysc.peek() != '('){
                    return "false";
                } else if(ch == ']' && mysc.peek() != '['){
                    return "false";
                } else if(ch == '}' && mysc.peek() != '{'){
                    return "false";
                }else{
                    mysc.pop();
                }
            }
        } if(mysc.size() > 0){
            return "false";
        } else{
            return "true";
        }
    }
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}