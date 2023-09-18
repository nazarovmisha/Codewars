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
        char left = 0;
        int right = 1;

        char[] arr = text.toCharArray();
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                left = arr[i];
                right++;
                int count = (i+1);
            } else {
                break;
            }
        }



        return list;
    }
}

