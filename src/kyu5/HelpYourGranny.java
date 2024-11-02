package kyu5;

import java.util.HashMap;
import java.util.Map;

//https://www.codewars.com/kata/5536a85b6ed4ee5a78000035/train/java

public class HelpYourGranny {
    public static void main(String[] args) {
        System.out.println(tour((new String[]{"A1","A2","A3","A4","A5"}),
                new String[][]{new String[]{"A1", "X1"},new String[]{"A2", "X2"}, new String[]{"A", "X3"}},
                new HashMap<String,Double>("X1" , 100, "X2",200,"X3")));

    }
    public static int tour(String[] arrFriends, String[][] ftwns, Map<String, Double> h) {
        // your code
        return 1;
    }
}

