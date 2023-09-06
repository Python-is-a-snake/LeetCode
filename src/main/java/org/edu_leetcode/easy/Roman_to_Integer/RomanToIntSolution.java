package org.edu_leetcode.easy.Roman_to_Integer;

import java.util.HashMap;
import java.util.Map;

class RomanToIntSolution {
    public int romanToInt(String s) {
        Map<Character, Integer> romanNums = new HashMap<>();
        romanNums.put('I', 1);
        romanNums.put('V', 5);
        romanNums.put('X', 10);
        romanNums.put('L', 50);
        romanNums.put('C', 100);
        romanNums.put('D', 500);
        romanNums.put('M', 1000);

        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            if((i + 1 < s.length()) && romanNums.get(s.charAt(i)) < romanNums.get(s.charAt(i + 1))){
                result -= romanNums.get(s.charAt(i));
                continue;
            }
            result += romanNums.get(s.charAt(i));
        }

        return result;
    }
}