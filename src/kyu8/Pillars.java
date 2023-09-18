package kyu8;
//https://www.codewars.com/kata/5bb0c58f484fcd170700063d/train/java
//There are pillars near the road. The distance between the pillars is the same and the width of the pillars is the same. Your function accepts three arguments:
//
//        number of pillars (≥ 1);
//        distance between pillars (10 - 30 meters);
//        width of the pillar (10 - 50 centimeters).
//        Calculate the distance between the first and the last pillar in centimeters (without the width of the first and last pillar).


public class Pillars {
    public static void main(String[] args) {
        System.out.println(pillars(11, 15, 30));
    }

    public static int pillars(int numPill, int dist, int width) {
        if (numPill == 1) {
            return 0;
        } else if (numPill == 2) {
            return dist * 100;
        } else {
            return dist * 100 * (numPill-1) + (width * (numPill - 2));
        }
    }
}

