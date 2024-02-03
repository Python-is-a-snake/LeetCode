package org.edu_leetcode.easy.Longest_Common_Prefix;

import java.util.Arrays;

public class LongestCommonPrefixSolution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);

        int index = 0;
        for(; index < strs[0].length(); index++){
            if(strs[0].charAt(index) != strs[strs.length - 1].charAt(index)){
                break;
            }
        }

        return strs[0].substring(0, index);
    }

}
