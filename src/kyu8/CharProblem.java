package kyu8;

public class CharProblem {
    public static void main(String[] args) {
        System.out.println(howOld("9 years old"));
    }
    public static int howOld(final String herOld) {
        char ch = herOld.charAt(0);
        return Integer.parseInt(String.valueOf(ch));

    }
}
