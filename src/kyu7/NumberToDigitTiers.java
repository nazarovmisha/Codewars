package kyu7;
//https://www.codewars.com/kata/586bca7fa44cfc833e00005c/train/java
import java.util.Arrays;

public class NumberToDigitTiers {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(createArrayOfTiers(80210)));
    }

    public static String[] createArrayOfTiers(int num) {
        String str = String.valueOf(num);
        char[] charArray = str.toCharArray();
        String[] result = new String[str.length()];
        String some = "";
        for (int i = 0; i < str.length(); i++) {
            some += charArray[i];
            result[i] = some;
        }
        return result;
    }
}

