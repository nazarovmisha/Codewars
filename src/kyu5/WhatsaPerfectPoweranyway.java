package kyu5;

//https://www.codewars.com/kata/54d4c8b08776e4ad92000835

import java.util.Arrays;

public class WhatsaPerfectPoweranyway {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(isPerfectPower(31618129)));
    }

    public static int[] isPerfectPower(int n) {
        boolean isAlive = true;
        int count = 2;
        int degree = 2;
        int summ = 0;
        int[] result = new int[2];
        while (isAlive) {
            if(Math.sqrt(n)%2==0){
                result[0]= (int) Math.sqrt(n);
                result[1]=2;
            }
            summ = (int) Math.pow(count, degree);
            if (summ > n) {
                count = 2;
                degree++;
            }
            if (summ<n){
                count++;
            }
            if (summ == n) {
                result[0] = count;
                result[1] = degree;
                isAlive = false;
            }
            if ((Math.pow(2,degree))>n) {
                return null;
            }
        }
        return result;
    }
}




