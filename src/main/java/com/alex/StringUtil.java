package com.alex;

public class StringUtil {
    private static final String SPACE = " ";
    private static final String EMPTY = "";

    public static String concat(String firstString, String secondString) {
        return firstString + secondString;
    }

    public static long countSpaces(String str) {
        return str.chars()
                .filter(ch -> toChar(SPACE) == ch)
                .count();
    }

    public static String removeSpaces(String str) {
        return str.replace(SPACE, EMPTY);
    }

    public static boolean isEmpty(String str) {
        return checkString(str);
    }

    public static boolean isNotEmpty(String str) {
        return !checkString(str);
    }

    private static char toChar(String str) {
        return str.charAt(0);
    }

    private static boolean checkString(String str) {
        return str == null || str.isEmpty();
    }
}
