package kyu7;

import java.util.Arrays;

public class ReduceMyFraction {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(myFraction(new int[]{60, 20})));
    }

    public static int[] myFraction(int[] fractions) {
        boolean alive = true;
        int[] answer = new int[2];
        while (alive) {
            for (int i = 2; i < 1000; i++) {
                if (fractions[0] % i == 0 && fractions[1] % i == 0) {
                    fractions[0] /= i;
                    fractions[1] /= i;
                    i=2;
                } else
                    answer[0] = fractions[0];
                answer[1] = fractions[1];
                alive = false;

            }
        }
        return answer;
    }

}
