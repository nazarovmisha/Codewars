package kyu7;


//https://www.codewars.com/kata/5656b6906de340bd1b0000ac/train/java
//Take 2 strings s1 and s2 including only letters from a to z. Return a new sorted string, the longest possible,
// containing distinct letters - each taken only once - coming from s1 or s2.
//
//        Examples:
//        a = "xyaabbbccccdefww"
//        b = "xxxxyyyyabklmopq"
//        longest(a, b) -> "abcdefklmopqwxy"
//
//        a = "abcdefghijklmnopqrstuvwxyz"
//        longest(a, a) -> "abcdefghijklmnopqrstuvwxyz"
public class TwoToOne {
    public static void main(String[] args) {
        System.out.println(longest("xyaabbbccccdefww", "xxxxyyyyabklmopq"));
    }

    public static String longest(String s1, String s2) {
        String totalString = s1 + s2;
        String[] checkingArray = totalString.split("");
        StringBuilder result = new StringBuilder();
        String controlString = "abcdefghijklmnopqrstuvwxyz";
        String[] controlArray = controlString.split("");
        for (int i = 0; i < controlArray.length; i++) {
            for (String s : checkingArray) {
                if (controlArray[i].equals(s)) {
                    result.append(controlArray[i]);
                    controlArray[i] = "Null";
                }
            }
        }
        return result.toString();
    }
}
