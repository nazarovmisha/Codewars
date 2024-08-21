package kyu7;
//https://www.codewars.com/kata/5467e4d82edf8bbf40000155/train/java

import java.util.Arrays;
import java.util.Collections;

public class DescendingOrder {
    public static void main(String[] args) {
        System.out.println(sortDesc(256476));
    }

    public static int sortDesc(final int num) {

        String numberString = Integer.toString(num);
       char[]charArray = numberString.toCharArray();
       Integer [] intArray = new Integer[charArray.length];
        for (int i = 0; i < charArray.length; i++) {
            intArray[i]=Character.getNumericValue(charArray[i]);
        }
       Arrays.sort(intArray,Collections.reverseOrder());
        StringBuilder result = new StringBuilder();
        for (Integer integer : intArray) {
            result.append(integer);
        }

        return Integer.parseInt(result.toString());
        }

    }

