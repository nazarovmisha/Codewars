package kyu5;

import java.math.BigInteger;

public class PerimeterOfSquaresInARectangle {
    public static void main(String[] args) {
        System.out.println(perimeter(BigInteger.valueOf(5)));
    }

    public static BigInteger perimeter(BigInteger n) {
        int count = 1;
        int summ = 1;
        int result=0;
        int firstValue = 0;
        int secondValue = 1;

        while (count < n.intValue()) {
            summ = firstValue + secondValue;
            result += summ;
            firstValue = secondValue;
            secondValue = result;
            count++;
            System.out.println(result);
        }
        BigInteger a = BigInteger.valueOf(result);
        return a;
    }
}

