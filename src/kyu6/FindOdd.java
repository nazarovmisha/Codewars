package kyu6;
//https://www.codewars.com/kata/54da5a58ea159efa38000836/train/java
//Given an array of integers, find the one that appears an odd number of times.
//
//        There will always be only one integer that appears an odd number of times.
//
//        Examples
//        [7] should return 7, because it occurs 1 time (which is odd).
//        [0] should return 0, because it occurs 1 time (which is odd).
//        [1,1,2] should return 2, because it occurs 1 time (which is odd).
//        [0,1,0,1,0] should return 0, because it occurs 3 times (which is odd).
//        [1,2,2,3,3,3,4,3,3,3,2,2,1] should return 4, because it appears 1 time (which is odd).

import java.util.Arrays;

public class FindOdd {
    public static void main(String[] args) {
        System.out.println("result " + findIt(new int[]{1, 2, 2, 3, 3, 4, 4, 5, 5, 10, 10}));
    }

    public static int findIt(int[] a) {
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        int result = 0;
        int length = a.length;

        if (a.length == 1) {
            result = a[0];
        }

        for (int i = a.length - 1; i > 0; i--) {
            if (a[i] > a[i - 1]) {
                if ((length - i) % 2 != 0) {
                    result = a[i];
                    break;
                } else {
                    length = length - (length - i);
                }
            } else result = a[0];
        }
        return result;
    }
}