package kyu8;

//https://www.codewars.com/kata/56b29582461215098d00000f/train/java

import java.util.Arrays;

public class LarioAndMuigiPipeProblem {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(pipeFix(new int[]{1,4,12})));
    }

    public static int[] pipeFix(int[] numbers) {
        int[] answer = new int[(numbers[numbers.length-1] - numbers[0])+1];
        int count=numbers[0];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = count;
            count++;
        }
        return answer;
    }
}