package kyu6;

public class TheLostBeginning {
    public static void main(String[] args) {
        System.out.println(beginning("99100"));
    }

    public static long beginning(String s) {
        int start = 1;
        int finish = 1;
        int count = 0;
        String one = "";
        String two = "";
        int result = 0;
        for (int i = 0; i < s.length() / 2-1; i++) {
            one = s.substring(0, start + count);
            two = s.substring(start + count, start + finish + count);
            if (Integer.parseInt(two) - Integer.parseInt(one) == 1) {
                result = Integer.parseInt(one);
            }
            count++;
            finish++;
            System.out.println("one - " + one);
            System.out.println("two - " + two);
        }
        if (result == 0) {
            for (int j = 0; j < (s.length() / 2) - 1; j++) {
                one = s.substring(0, start);
                two = s.substring(start + count, start + finish + count);
                System.out.println("one - " + one);
                System.out.println("two - " + two);
                if (Integer.parseInt(two) - Integer.parseInt(one) == 1) {
                    result = Integer.parseInt(one);
                }
                count++;

                System.out.println("one - " + one);
                System.out.println("two - " + two);
            }
        }

        if (result == 0) {
            return Integer.parseInt(s);
        } else {
            return result;
        }
    }
}