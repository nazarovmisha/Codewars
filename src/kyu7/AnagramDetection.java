package kyu7;

import java.util.Arrays;

//https://www.codewars.com/kata/529eef7a9194e0cbc1000255/train/java
public class AnagramDetection {
    public static void main(String[] args) {
        System.out.println(isAnagram("Buckethead", "DeathCubeK"));
    }

    public static boolean isAnagram(String a, String b) {
        if (a.length() != b.length()) {
            return false;
        } else {
            boolean isTrue = true;
            a = a.toLowerCase();
            b = b.toLowerCase();
            String[] aString = a.split("");
            String[] bString = b.split("");
            Arrays.sort(aString);
            Arrays.sort(bString);
            for (int i = 0; i < aString.length; i++) {
                if (aString[i].equals(bString[i])) {
                } else {
                    isTrue = false;
                }
            }
            return isTrue;
        }
    }
}
