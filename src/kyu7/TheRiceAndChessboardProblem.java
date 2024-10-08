package kyu7;

//https://www.codewars.com/kata/5b0d67c1cb35dfa10b0022c7/train/java
public class TheRiceAndChessboardProblem {
    public static void main(String[] args) {
        System.out.println(squaresNeeded(2));
    }

    public static int squaresNeeded(long grains) {
        int cells = 0;
        int count = 1;
        int summ = 1;
        while (summ < grains) {
            summ += count;
            System.out.println("summ = " + summ);
            count *= 2;
            cells++;
        }
        if (grains == 0) {
            return 0;
        } else return cells;
    }
}
