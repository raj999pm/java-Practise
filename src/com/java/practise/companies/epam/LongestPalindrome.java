package com.java.practise.companies.epam;

//Given a string s, return the longest palindromic substring in s.
//Input: s = "babad "Output: "bab" Explanation: "aba" is also a valid answer.
//Input: s = "cbbd" Output: "bb"

public class LongestPalindrome {

    static void main() {

        System.out.println(longestPalindrome("babad")); // bab
        System.out.println(longestPalindrome("cbbd"));  //
    }

    static String longestPalindrome(String s) {
        if (s == null || s.length() < 1) return "";
        int start = 0, end = 0;

        for (int i = 0; i < s.length(); i++) {
            int len1 = expand(s, i, i);       // odd length
            int len2 = expand(s, i, i + 1);   // even length
            int len = Math.max(len1, len2);

            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        return s.substring(start, end + 1);
    }

    static int expand(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }
}
