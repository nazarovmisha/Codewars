package kyu7;

//https://www.codewars.com/kata/586f6741c66d18c22800010a/train/java
public class SumOfASequence {
    public static void main(String[] args) {
        System.out.println(sequenceSum(2, 6, 2));
    }

    public static int sequenceSum(int start, int end, int step) {
        int result = 0;
        for (int i = start; i <= end; i += step) {
            result += i;
        }
        return result;
    }
}

