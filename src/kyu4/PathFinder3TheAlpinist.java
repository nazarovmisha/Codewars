package kyu4;

//https://www.codewars.com/kata/576986639772456f6f00030c/train/java

import java.util.Arrays;

public class PathFinder3TheAlpinist {
    public static void main(String[] args) {
        System.out.println(pathFinder("000000\n" +
                                      "000000\n" +
                                      "000000\n" +
                                      "000010\n" +
                                      "000109\n" +
                                      "001010"));
    }

    static int pathFinder(String maze) {
        String[] arr = maze.split("\n");
        String[][] matrix = new String[arr.length][];
        int n = 0;
        for (String s : arr) {
          //  matrix[n++] =Arrays.toString(s.split("");
        }
        int startPosition = Integer.parseInt(matrix[0][0]);
        int finishPosition=Integer.parseInt(matrix[0][0]);
        while (checkPosition(startPosition)){

        }
        return -1;
    }

    public static boolean checkPosition (int n){
return true;
    }
}

