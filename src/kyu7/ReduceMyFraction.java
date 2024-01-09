package kyu7;
//https://www.codewars.com/kata/576400f2f716ca816d001614/train/java
import java.util.Arrays;

public class ReduceMyFraction {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(myFraction(new int[]{60, 20})));
    }

    public static int[] myFraction(int[] fractions) {
        int[] answer = new int[2];
        for (int i = 1; i < 20; i++) {
            if (fractions[0] % i == 0 && fractions[1] % i == 0) {
                fractions[0] /= i;
                fractions[1] /= i;
                answer[0] = fractions[0];
                answer[1] = fractions[1];
                i = 1;
            }
        }
        return answer;
    }
}