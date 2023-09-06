package org.edu_leetcode.easy.Palindrome_Number;

class PalindromeNumberSolution {
    public boolean isPalindrome(int x) {
        String numAsStr = String.valueOf(x);

        for (int i = 0; i < numAsStr.length() - 1; i++) {
            if(numAsStr.charAt(i) != numAsStr.charAt(numAsStr.length()-1 - i)) return false;
        }
        return true;

    }
}