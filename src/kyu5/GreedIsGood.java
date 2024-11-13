package kyu5;


import java.util.Arrays;

//https://www.codewars.com/kata/5270d0d18625160ada0000e4/train/java
public class GreedIsGood {
    public static void main(String[] args) {
        System.out.println(greedy(new int[]{2,4,4,5,4}));
    }

    public static int greedy(int[] dice) {
        Arrays.sort(dice);
        int summ = 0;
        for (int i = 0; i < dice.length - 2; i++) {
            if (dice[i] == dice[i + 1] && dice[i] == dice[i + 2]) {
                int a = dice[i];
                dice[i] = 0;
                dice[i + 1] = 0;
                dice[i + 2] = 0;
                if (a==1){
                  summ+=1000;
                }else {
                    summ+=a*100;
                }
            }
        }

        for (int die : dice) {
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

