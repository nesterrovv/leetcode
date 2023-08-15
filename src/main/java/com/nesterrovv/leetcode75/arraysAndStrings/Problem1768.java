package com.nesterrovv.leetcode75.arraysAndStrings;

public class Problem1768 {

    public static String mergeAlternately(String word1, String word2) {
        StringBuilder result = new StringBuilder();
        if (word1.length() > word2.length()) {
            for (int i = 0; i < word2.length() ; i++) {
                result.append(word1.charAt(i)).append(word2.charAt(i));
            }
            int remainder = word1.length() - word2.length();
            for (int i = word1.length() - remainder; i < word1.length(); i++) {
                result.append(word1.charAt(i));
            }
        } else {
            for (int i = 0; i < word1.length() ; i++) {
                result.append(word1.charAt(i)).append(word2.charAt(i));
            }
            int remainder = word2.length() - word1.length();
            for (int i = word2.length() - remainder; i < word2.length(); i++) {
                result.append(word2.charAt(i));
            }
        }
        return result.toString();
    }

}
