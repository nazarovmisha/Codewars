package kyu7;

import java.util.*;

public class Strings {
    public static void main(String[] args) {
        str(5, "RLF");
    }

    static void str(int num, String letter) {
        int[] start = new int[num];
        int[] finish = new int[num];
        Map<Integer,Integer> map=new HashMap<>();

        String c1 = "2 6";
        String c2 = "3 9";
        String c3 = "4 2";
        String c4 = "6 9";
        String c5 = "9 10";
        start[0] = Integer.parseInt(String.valueOf(c1.charAt(0)));
        start[1] = Integer.parseInt(String.valueOf(c2.charAt(0)));
        start[2] = Integer.parseInt(String.valueOf(c3.charAt(0)));
        start[3] = Integer.parseInt(String.valueOf(c4.charAt(0)));
        start[4] = Integer.parseInt(String.valueOf(c5.charAt(0)));
        finish[0] = Integer.parseInt(String.valueOf(c1.charAt(2)));
        finish[1] = Integer.parseInt(String.valueOf(c2.charAt(2)));
        finish[2] = Integer.parseInt(String.valueOf(c3.charAt(2)));
        finish[3] = Integer.parseInt(String.valueOf(c4.charAt(2)));
        finish[4] = 10;

        System.out.println(Arrays.toString(start));
        System.out.println(Arrays.toString(finish));
        for (int i = 0; i < num-1; i++) {
            for (int j = 0; j < num; j++) {

                if (start[i] < start[j] && finish[i] < finish[j]) {
                    System.out.println("i " + i + " " + "j " + j);
                }else {map.put(start[i],finish[i] );
                map.put(start[j],finish[j] );


                }
            }
        }
        System.out.println(Arrays.toString(start));
        System.out.println(Arrays.toString(finish));
        System.out.println(map);
        System.out.println(map.size());
    }
}





