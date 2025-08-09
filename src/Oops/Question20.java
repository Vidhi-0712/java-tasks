package Oops;

import java.util.Stack;
import java.util.Map;
import java.util.HashMap;


class Solution20 {
    public static void main(String[] args){
        String s = "()[]{}";
        Map<Character,Character> map = new HashMap<>();
        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');
        Stack<Character> stack = new Stack<>();

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(map.containsKey(ch)){
                if(stack.isEmpty() || stack.pop() != map.get(ch)){
                    System.out.println("Invalid");
                    return;
                }
            }else{
                stack.push(ch);
            }
        } if(stack.isEmpty()){
            System.out.println("Valid");
        }else{
            System.out.println("Invalid");
        }
    }
}


