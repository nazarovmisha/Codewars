package kyu8;
//https://www.codewars.com/kata/5601409514fc93442500010b/train/java
//There was a test in your class, and you passed it. Congratulations!
//        But you're an ambitious person. You want to know if you're better than the average student in your class.
//
//        You receive an array with your peers' test scores. Now calculate the average and compare your score!
//
//        Return True if you're better, else False!
//
//        Note:
//        Your points are not included in the array of your class's points. For calculating the average point you may add your point to the given array!


public class Kata {
    public static void main(String[] args) {
        System.out.println(betterThanAverage(new int[]{100, 40, 34, 57, 29, 72, 57, 88}, 75));
    }

    public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
        int summ = 0;
        double avr;
        for (int classPoint : classPoints) {
            summ += classPoint;
        }
        avr = (summ + yourPoints) / (classPoints.length + 1);
        return (avr < yourPoints);
    }
}

