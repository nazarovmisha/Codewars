package kyu4;

//https://www.codewars.com/kata/576986639772456f6f00030c/train/java

import java.util.Arrays;

public class PathFinder3TheAlpinist {
    public static void main(String[] args) {
        System.out.println(pathFinder("000000\n"+
                                      "000000\n"+
                                      "000000\n"+
                                      "000010\n"+
                                      "000109\n"+
                                      "001010"));
    }

    static int pathFinder(String maze) {
       String[][] arr = maze.split("");
        System.out.println(Arrays.toString(arr));
        return -1;
    }
}

