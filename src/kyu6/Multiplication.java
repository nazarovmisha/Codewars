package kyu6;

//https://www.codewars.com/kata/534d2f5b5371ecf8d2000a08/train/java

//Your task, is to create N×N multiplication table, of size provided in parameter.
//
//        For example, when given size is 3:
//
//        1 2 3
//        2 4 6
//        3 6 9

import java.util.Arrays;

public class Multiplication {
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(multiplicationTable(5)));
    }
    public static int [][] multiplicationTable(int n){

     int[][] array = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = (i + 1) * (j + 1);
            }
        }
        return array;
    }
}
