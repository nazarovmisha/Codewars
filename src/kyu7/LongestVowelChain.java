package kyu7;

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
        System.out.println(solve("ultrarevolutionariees"));

    }

    public static int solve(String s) {
        Pattern pattern = Pattern.compile("[aeiouy]");
        Matcher matcher = pattern.matcher(s);
        while (matcher.find()) {
            int start = matcher.start();
            int end = matcher.end();
            System.out.println("Found match\n" + s.substring(start, end) + "\nfrom " + start + " to " + (end - 1));
        }

        return 0;
    }
}