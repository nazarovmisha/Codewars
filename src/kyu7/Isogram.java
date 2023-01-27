package kyu7;
//https://www.codewars.com/kata/54ba84be607a92aa900000f1/train/java
//An isogram is a word that has no repeating letters, consecutive or non-consecutive. Implement a function that determines whether a string that contains only letters is an isogram. Assume the empty string is an isogram. Ignore letter case.
//
//        Example: (Input --> Output)
//
//        "Dermatoglyphics" --> true "aba" --> false "moOse" --> false (ignore letter case)
//
//        isIsogram "Dermatoglyphics" = true
//        isIsogram "moose" = false
//        isIsogram "aba" = false
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

public class Isogram {
    public static void main(String[] args) {
        System.out.println(isIsogram(""));
    }
    public static boolean isIsogram(String str) {
       String[] myArray=str.split("");
        Set<String> stringSet = new HashSet<>(Arrays.asList( str.toLowerCase(Locale.ROOT).split("")));
        return myArray.length == stringSet.size();
    }
}

