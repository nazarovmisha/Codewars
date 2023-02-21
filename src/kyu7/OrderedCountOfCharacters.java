package kyu7;

import org.apache.commons.lang3.tuple.Pair;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class OrderedCountOfCharacters {
    public static void main(String[] args) {
        System.out.println(orderedCount("abracadabra"));
    }

    public static List<Pair<Character, Integer>> orderedCount(String text) {
        List<Pair<Character, Integer>> list = new ArrayList<>();
        char[] arr = text.toCharArray();
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            int k = 0;
            if (arr[i] == arr[i + 1]) {
                k++;
            //    list.add(k, arr[i]);
            }
        }
        return list;
    }
}

