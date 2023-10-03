package kyu7;

//https://www.codewars.com/kata/65126d52a5de2b11c94096d2/train/java

//Create a function that returns the sum of the digits formed from the first and last digits, all the way to the center of the number.
//
//        Worked Example
//        2520 ➞ 72
//
//        # The first and last digits are 2 and 0.
//        # 2 and 0 form 20.
//        # The second digit is 5 and the second to last digit is 2.
//        # 5 and 2 form 52.
//
//        # 20 + 52 = 72
//        Examples
//        121 ➞ 13
//        # 11 + 2
//
//        1039 ➞ 22
//        # 19 + 3
//
//        22225555 ➞ 100
//        # 25 + 25 + 25 + 25
//        Notes
//        If the number has an odd number of digits, simply add on the single-digit number in the center (see example #1).
//        Any number which is zero-padded counts as a single digit (see example #2).


import java.util.Arrays;

public class ClosingInSum {
    public static void main(String[] args) {
        System.out.println(closingInSum(1039l));
    }

    public static int closingInSum(long n) {
        String temp = Long.toString(n);
        String[] res = temp.split("");
        int middle = res.length/2;
        System.out.println("Middle "+middle);
        System.out.println(Arrays.toString(res));
        String[] out = new String[middle];
        for (int i = 0; i < res.length/2; i++) {
            out[i]= res[i]+res[middle+i];
           }
        System.out.println(Arrays.toString(out));
        return 0;
    }
}

