package org.edu_leetcode.easy.Length_of_Last_Word;

class LengthOfLastWordSolution {
    public int lengthOfLastWord(String s) {

        return s.split(" ")[s.split(" ").length -1 ].length();
    }
}