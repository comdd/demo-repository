package com.example.algorithm;

/**
 * Description :
 *
 * @author : dd
 */
public class Palindrome {
    public static boolean isPalindrome(String s) {
        if (s == null || s.equals(""))
            return true;
        s = s.toLowerCase();
        char[] chars = s.toCharArray();
        int i = 0;
        int j = chars.length - 1;
        while (i < j) {
            while (!valid(chars[i]) && i < j) {
                i++;
            }
            while (!valid(chars[j]) && j > i) {
                j--;
            }
            if(i == j){
              return true;
            }
            if (chars[i] == chars[j]) {
                i++;
                j--;
            } else {
                return false;
            }
        }
        return true;
    }

    private static boolean valid(char aChar) {
        return Character.isLowerCase(aChar) || Character.isDigit(aChar);
    }

    public static void main(String[] args) {
        String s = "a.";
        System.out.println(isPalindrome(s));
    }
}
