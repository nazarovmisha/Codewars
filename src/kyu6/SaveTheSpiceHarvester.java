package kyu6;

//https://www.codewars.com/kata/587d7544f1be39c48c000109/train/java



public class SaveTheSpiceHarvester {
    public static void main(String[] args) {
        System.out.println(harvesterRescue(new int[][]{{345, 600},
                {200, 100, 25},
                {350, 200, 32}}));
    }

    public static String harvesterRescue(final int[][] data) {
//        double wormTime1 = Math.pow((data[1][0] - data[0][0]),2);
//        double wormTime2 = Math.pow((data[1][1] - data[0][1]), 2);
//        double wormTime = (Math.sqrt((wormTime2 + wormTime1)) / data[1][2]);
//
//        double carryallTime1 = Math.pow((data[2][0] - data[0][0]), 2);
//        double carryallTime2 = Math.pow((data[2][1] - data[0][1]), 2);
//        double carryallTime = (Math.sqrt((carryallTime2 + carryallTime1)) / data[2][2]);
  double wormTime1 = Math.pow(Math.abs(data[1][0]) - Math.abs(data[0][0]), 2);
        double wormTime2 = Math.pow(Math.abs(data[1][1]) - Math.abs(data[0][1]), 2);
        double wormTime = (Math.sqrt((wormTime2 + wormTime1)) / data[1][2]);

        double carryallTime1 = Math.pow(Math.abs(data[2][0]) - Math.abs(data[0][0]), 2);
        double carryallTime2 = Math.pow(Math.abs(data[2][1]) - Math.abs(data[0][1]), 2);
        double carryallTime = (Math.sqrt((carryallTime2 + carryallTime1)) / data[2][2]);


        if ((carryallTime - wormTime) < 1) {
            return "The spice must flow! Rescue the harvester!";
        } else {
            return "Damn the spice! I'll rescue the miners!";
        }
    }
}


