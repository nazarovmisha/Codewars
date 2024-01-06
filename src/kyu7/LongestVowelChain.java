package kyu7;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//https://www.codewars.com/kata/59c5f4e9d751df43cf000035
//The vowel substrings in the word codewarriors are o,e,a,io. The longest of these has a length of 2. Given a lowercase string that has alphabetic characters only (both vowels and consonants) and no spaces, return the length of the longest vowel substring. Vowels are any of aeiou.
//
//        Good luck!
//
//        If you like substring Katas, please try:
public class LongestVowelChain {
    public static void main(String[] args) {
        System.out.println(solve("mnopqriouaeiopqrstuvwxyuaeiouaeiou"));

    }

    public static int solve(String s) {
        String[] wordAr = s.split("(?i)[^aeiou]");
        System.out.println(Arrays.toString(wordAr));
        Arrays.sort(wordAr);

        for (int i = 0; i < wordAr.length; i++) {
            for (int j = i + 1; j < wordAr.length ; j++) {
                if (wordAr[i].length() > wordAr[j].length()) {
                    String word = wordAr[j];
                    wordAr[j] = wordAr[i];
                    wordAr[i] = word;
                }
            }
        }
        System.out.println(Arrays.toString(wordAr));
        return wordAr[wordAr.length-1].length();
    }
}