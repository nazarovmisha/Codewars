package kyu6;
//https://www.codewars.com/kata/523f5d21c841566fde000009/train/java
//Your goal in this kata is to implement a difference function, which subtracts one list from another and returns the result.
//
//        It should remove all values from list a, which are present in list b keeping their order.
//
//        Kata.arrayDiff(new int[] {1, 2}, new int[] {1}) => new int[] {2}
//        If a value is present in b, all of its occurrences must be removed from the other:
//
//        Kata.arrayDiff(new int[] {1, 2, 2, 2, 3}, new int[] {2}) => new int[] {1, 3}

import java.util.*;

public class ArrayDiff {
    public static void main(String[] args) {
        System.out.println(Arrays.toString((arrayDiff(new int[]{1, 2, 3, 1, 2, 3, 12, 3, 232, 3}, new int[]{1, 2}))));

    }

    public static int[] arrayDiff(int[] a, int[] b) {
        List<Integer> listA = Arrays.stream(a).boxed().toList();
        List<Integer> listC = new ArrayList<>(listA);
        for (int j : b) {
            listC.removeAll(Collections.singleton(j));
        }
        return listC.stream().mapToInt(i -> i).toArray();

    }
}



