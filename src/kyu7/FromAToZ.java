package kyu7;

//https://www.codewars.com/kata/6512b3775bf8500baea77663/train/java

//Given a string indicating a range of letters, return a string which includes all the letters in that range, including the last letter. Note that if the range is given in capital letters, return the string in capitals also!
//
//        Examples
//        gimmeTheLetters("a-z") ➞ "abcdefghijklmnopqrstuvwxyz"
//
//        gimmeTheLetters("h-o") ➞ "hijklmno"
//
//        gimmeTheLetters("Q-Z") ➞ "QRSTUVWXYZ"
//
//        gimmeTheLetters("J-J") ➞ "J"
//        Notes
//        A hyphen will separate the two letters in the string.
//        You don't need to worry about error handling in this one (i.e. both letters will be the same case and the second letter will always be after the first alphabetically).

public class FromAToZ {
    public static void main(String[] args) {
        System.out.println(gimmeTheLetters("h-o"));
    }

    public static String gimmeTheLetters(String s) {

        char[] charArray = s.toCharArray();
        System.out.println(charArray);
        String abc = "abcdefghijklmnopqrstuvwxyz";
        int upper = abc.indexOf(charArray[0]);
        if (upper < 0) {
            abc = abc.toUpperCase();
        }
        int first = abc.indexOf(charArray[0]);
        int last = abc.indexOf(charArray[2]);
        String result = abc.substring(first, last + 1);
        System.out.println(result);

        return result;
    }
}
