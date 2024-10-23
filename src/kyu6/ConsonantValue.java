package kyu6;

import java.util.Arrays;

//https://www.codewars.com/kata/59c633e7dcc4053512000073/train/java
public class ConsonantValue {
    public static void main(String[] args) {
        System.out.println(solve("bc"));
    }

    public static int solve(final String s) {

        int max = 0;
        int summ = 0;
        String[] arr = s.split("");
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals("a") || arr[i].equals("e") || arr[i].equals("i") || arr[i].equals("o") || arr[i].equals("u")) {
                summ = 0;
            } else {
                int a = 1;
                String b = "2";
                String c = "3";
                summ += Integer.parseInt(arr[i]);
                System.out.println(summ);
            }
        }
        return 0;
    }
}

