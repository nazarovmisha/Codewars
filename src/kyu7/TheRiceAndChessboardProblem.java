package kyu7;

//https://www.codewars.com/kata/5b0d67c1cb35dfa10b0022c7/train/java
public class TheRiceAndChessboardProblem {
    public static void main(String[] args) {
        System.out.println(squaresNeeded(10000000000l));
    }

    public static int squaresNeeded(long grains) {
        int cellCapacity = 1;
        int maxCapacity = 1;
        int cells = 1;
        while (maxCapacity<grains){
            cells++;
            cellCapacity*=2;
            maxCapacity+=cellCapacity;

        }if (grains==0){
            return  0;
        }else {
            return cells;
        }
    }
}
