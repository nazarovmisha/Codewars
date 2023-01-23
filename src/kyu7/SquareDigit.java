package kyu7;
//https://www.codewars.com/kata/546e2562b03326a88e000020/train/java
//Welcome. In this kata, you are asked to square every digit of a number and concatenate them.
//
//        For example, if we run 9119 through the function, 811181 will come out, because 92 is 81 and 12 is 1. (81-1-1-81)
//
//        Example #2: An input of 765 will/should return 493625 because 72 is 49, 62 is 36, and 52 is 25. (49-36-35)
//
//        Note: The function accepts an integer and returns an integer.
//
//        Happy Coding!


public class SquareDigit {
    public static void main(String[] args) {
        System.out.println( squareDigits(9119));
    }

    public static int squareDigits(int n) {
        StringBuilder result = new StringBuilder();
        String temp = Integer.toString(n);
        int[] newGuess = new int[temp.length()];
        for (int i = 0; i < temp.length(); i++) {
            newGuess[i] = temp.charAt(i) - '0';
            newGuess[i] = newGuess[i] * newGuess[i];
            result.append(newGuess[i]);
        }
        return Integer.parseInt(result.toString());
    }
}

