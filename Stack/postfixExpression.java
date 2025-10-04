package Stack;

import java.util.Stack;

public class postfixExpression{
    public static int postExp(String exp){
                Stack<Integer> sk = new Stack<>();
        String[] str = exp.split(" ");
        for(int i=0; i<str.length; i++){
            if(!str[i].equals("+") && !str[i].equals("-") && !str[i].equals("*")){
                sk.push(Integer.parseInt(str[i]));
            }else{
                int a = sk.pop();
                int b = sk.pop();
                if(str[i].equals("+")){
                    sk.push(b+a);
                }else if(str[i].equals("-")){
                    sk.push(b-a);
                }else{
                    sk.push(b*a);        
                }
            }
        } return sk.peek();
    }
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}