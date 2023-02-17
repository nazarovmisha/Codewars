package kyu6;

import java.util.Arrays;

//https://www.codewars.com/kata/52de553ebb55d1fca3000371/train/java
//An Arithmetic Progression is defined as one in which there is a constant difference between the consecutive terms
// of a given series of numbers. You are provided with consecutive elements of an Arithmetic Progression.
// There is however one hitch: exactly one term from the original series is missing from the set of numbers which have
// been given to you. The rest of the given series is the same as the original AP. Find the missing term.
//
//        You have to write a function that receives a list, list size will always be at least 3 numbers.
//        The missing term will never be the first or last one.
//
//        Example
//        findMissing([1, 3, 5, 9, 11]) == 7
//        PS: This is a sample question of the facebook engineer challenge on interviewstreet.
//        I found it quite fun to solve on paper using math, derive the algo that way. Have fun!
public class ArithmeticProgression {
    public static void main(String[] args) {
        System.out.println(findMissing(new int[]{47, 437, 632, 827, 1022, 1217, 1412, 1607, 1802, 1997, 2192, 2387, 2582, 2777, 2972, 3167, 3362, 3557, 3752}));
    }

    public static int findMissing(int[] numbers) {
        int result = 0;
        int count = 0;
        int finalResult = 0;

        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        for (int i = 0; i < numbers.length - 1; i++) {
            count = numbers[numbers.length - 1] - numbers[numbers.length - 2];
            result = numbers[1] - numbers[0];
            if (numbers[i]==numbers[i+1]) {
                finalResult=numbers[i];
            }
        }
        if (result < count) {
            finalResult = numbers[numbers.length - 1] - result;
        } else if (result > count) {
            finalResult = numbers[1] - count;
        } else if (result == count) {
            for (int i = numbers.length; i >1; i--) {
                if (result != numbers[i-1] - numbers[i - 2]) {
                    if(numbers[i-1]>0&&numbers[i-2]>0) {
                        finalResult = numbers[i - 1] - count;
                    }else {
                        finalResult=numbers[i-2]+result;
                    }
                }
            }
        }
        return finalResult;
    }
}





