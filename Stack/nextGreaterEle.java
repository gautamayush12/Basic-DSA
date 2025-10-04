package Stack;

import java.util.*;

public class nextGreaterEle {
    public static void nge(int[] arr){
        int n = arr.length;
        int[] ans = new int[n];
        //Stack Approach
        Stack<Integer> sk = new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!sk.isEmpty() && sk.peek()<=arr[i]){
                sk.pop();
            }
            if(sk.isEmpty()){
                ans[i] = -1;
            }else{
                ans[i] = sk.peek();
            }
            sk.push(arr[i]);
        }
        System.out.println(Arrays.toString(ans));
        //Brute Force Approach
        for(int i=0; i<n; i++){
            ans[i] = -1;
            for(int j=i+1; j<n; j++){
                if(arr[j]>arr[i]){
                    ans[i] = arr[j];
                    break;
                }
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
