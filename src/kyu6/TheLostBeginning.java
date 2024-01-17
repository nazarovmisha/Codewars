package kyu6;

//https://www.codewars.com/kata/659af96994b858db10e1675f/train/java
public class TheLostBeginning {

    public static void main(String[] args) {
        beginning("121314");
    }

    public static long beginning(String s) {
        int[] result = new int[s.length()];
        int answer = 0;
        int j = Integer.parseInt(s);
        if (s.length() % 2 == 0) {
            for (int i = 0; i < s.length(); i++) {
                result[j] =  Character.getNumericValue(s.charAt(i));
            }
        }
        return 0;
    }
}

