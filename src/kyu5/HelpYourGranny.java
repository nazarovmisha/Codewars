package kyu5;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//https://www.codewars.com/kata/5536a85b6ed4ee5a78000035/train/java

public class HelpYourGranny {
    public static void main(String[] args) {
        System.out.println(tour((new String[]{"A1", "A2", "A3", "A4", "A5"}),
                new String[][]{new String[]{"A1", "X1"}, new String[]{"A2", "X2"},
                        new String[]{"A3", "X3"}, new String[]{"A4", "X4"}},
                new HashMap<String, Double>() {{
                    put("X1", 100.0);
                    put("X2", 200.0);
                    put("X3", 250.0);
                    put("X4", 300.0);
                }}));

    }

    public static int tour(String[] arrFriends, String[][] ftwns, Map<String, Double> h) {
        System.out.println(Arrays.deepToString(ftwns));
        String last="";
        double length = 0.0;
        for (int i = 0; i < arrFriends.length; i++) {
            for (int j = 0; j < ftwns.length; j++) {
                if (arrFriends[i].equals(ftwns[j][0])) {
                    if (i == 0) {
                        length += h.get(ftwns[j][1]);
                        System.out.println(length);
                    } else {
                        last=ftwns[j][1];
                        length += Math.sqrt(Math.pow(h.get(ftwns[j][1]), 2) - (Math.pow(h.get(ftwns[j - 1][1]), 2)));
                        System.out.println(length);
                    }
                }
            }
        }
        length+=h.get(last);
        return (int) length;
    }
}
