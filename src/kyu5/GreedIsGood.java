package kyu5;


import java.util.Arrays;

//https://www.codewars.com/kata/5270d0d18625160ada0000e4/train/java
public class GreedIsGood {
    public static void main(String[] args) {
        System.out.println(greedy(new int[]{1, 1, 5, 5, 1}));
    }

    public static int greedy(int[] dice) {
        Arrays.sort(dice);
        int summ = 0;
        System.out.println(summ);
        int ratio = 0;
        for (int i = 0; i < dice.length - 2; i++) {
            if (dice[i] == dice[i + 1] && dice[i] == dice[i + 2]) {
                ratio = dice[i] + dice[i + 1] + dice[i + 2];
            }
            if (ratio == 3) {
                System.out.println(summ);
                summ += 1000;
                System.out.println(summ);
            }
            if (ratio == 18) {
                summ += 600;
            }
            if (ratio == 15) {
                summ += 500;
            }
            if (ratio == 12) {
                summ += 400;
            }
            if (ratio == 9) {
                summ += 300;
            }
            if (ratio == 3) {
                summ += 1000;
            }
            if (ratio == 3) {
                summ += 1000;
            }
            ratio = 0;
            dice[i] = 0;
            dice[i + 1] = 0;
            dice[i + 2] = 0;


        }
        System.out.println(Arrays.toString(dice));

        for (
                int die : dice) {
            if (die == 1) {
                summ += 100;
            }
            if (die == 5) {
                summ += 50;
            }
        }
        return summ;
    }
}

