package org.edu_leetcode.easy.Valid_Parentheses;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParenthesesSolution {
    public boolean isValid(String s) {
        //correct string will always have string.length() % 2 = 0
        if (s.length() % 2 != 0) return false;

        Stack<Character> parentheses = new Stack<>();

        char[] chars = s.toCharArray();

        for(char c : chars){
            if(c == '(') {
                parentheses.push(')');
                continue;
            }
            if(c == '[') {
                parentheses.push(']');
                continue;
            }
            if(c == '{') {
                parentheses.push('}');
                continue;
            }

            if(parentheses.empty() || parentheses.pop() != c){
                return false;
            }
        }

        return parentheses.empty();
    }
}
