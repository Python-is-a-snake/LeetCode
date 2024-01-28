package org.edu_leetcode.easy.Index_Of_First_Occur_In_String;

public class IndexOfFirstOccurInStringSolution {
    public int strStr(String haystack, String needle) {
        if(needle.length() > haystack.length()) return -1;

        for(int i = 0; i < haystack.length() - needle.length() + 1; i++){
            if(haystack.charAt(i) == needle.charAt(0)){
                if(haystack.startsWith(needle, i)){
                    return i;
                }
            }
        }

        return -1;
    }
}
