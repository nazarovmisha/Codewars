package kyu8;
//https://www.codewars.com/kata/55edaba99da3a9c84000003b/train/java
//Complete the function which takes two arguments and returns all numbers which are divisible by the given divisor. First argument is an array of numbers and the second is the divisor.
//
//        Example(Input1, Input2 --> Output)
//        [1, 2, 3, 4, 5, 6], 2 --> [2, 4, 6]


import java.util.ArrayList;
import java.util.Arrays;


public class EvenNumbers {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(divisibleBy(new int[]{1, 2, 3, 4, 5, 6}, 2)));
    }

    public static int[] divisibleBy(int[] numbers, int divider) {
        ArrayList<Integer> list = new ArrayList();
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % divider == 0) {
                list.add(numbers[i]);
            }
        }
        int[] arr = list.stream().mapToInt(Integer::intValue).toArray();
        return arr;
    }
}
