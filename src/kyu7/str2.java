package kyu7;

import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class str2 {
    private static boolean couldParse;

    public static void main(String[] args) throws IOException {


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(reader.readLine());
        int[] start = new int[num];
        int[] finish = new int[num];
        for (int i = 0; i < num; i++) {
            Pattern stringWith2Numbers = Pattern.compile(".*(\\d?).*(\\d?).*");
            Matcher matcher = stringWith2Numbers.matcher(reader.readLine());
            if (!matcher.matches()) {
                couldParse = false;
                start[i] = 0;
                finish[i] = 0;
            } else {
                final String firstNumberString = matcher.group(1);
                start[i] = Integer.valueOf(firstNumberString);
                final String secondNumberString = matcher.group(2);
                finish[i] = Integer.valueOf(secondNumberString);

                couldParse = true;
            }
        }

        Map<Integer, Integer> map = new HashMap<>();


        for (int i = 0; i < num - 1; i++) {
            for (int j = 0; j < num; j++) {

                if (start[i] < start[j] && finish[i] < finish[j]) {
                    System.out.println("i " + i + " " + "j " + j);
                } else {
                    map.put(start[i], finish[i]);
                    map.put(start[j], finish[j]);


                }
            }
        }
        int result = num - map.size();
        String stringResult = Integer.toString(result);
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        writer.write(stringResult);
    }
}





