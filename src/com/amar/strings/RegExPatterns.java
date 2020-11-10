package com.amar.strings;

import java.util.regex.Pattern;

public class RegExPatterns {


    public static void main(String args[])
    {
        String str = "A man, is someone who stands for himself";
        System.out.println(Pattern.matches("\\d", "abc"));
        System.out.println(Pattern.matches("\\d*", "2222"));
        System.out.println(str.replaceAll("\\w", "2222"));
    }
}
