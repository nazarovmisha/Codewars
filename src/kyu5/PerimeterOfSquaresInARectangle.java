package kyu5;

import java.math.BigInteger;

public class PerimeterOfSquaresInARectangle {
    public static void main(String[] args) {
        System.out.println(perimeter(BigInteger.valueOf(5)));
    }

    public static BigInteger perimeter(BigInteger n) {
        int count = 0;
        BigInteger result= new BigInteger("0");
        BigInteger firstValue = new BigInteger("0");
        BigInteger secondValue = new BigInteger("1");

        while (count < n.intValue()) {
            secondValue = secondValue.add(firstValue);
            firstValue = secondValue.subtract(firstValue);
            result=result.add(secondValue);
            count++;
        }
        return result.add(BigInteger.valueOf(1)).multiply(BigInteger.valueOf(4)) ;
    }
}

