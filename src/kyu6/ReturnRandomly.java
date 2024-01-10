package kyu6;

public class ReturnRandomly {
    public static void main(String[] args) {
        System.out.println(oneTwoThree());

    }
    public static int oneTwoThree() {
        int result1 = 0;
        int result2 = 0;
        int result3 = 0;
        while (true) {
            if (result1 == result2 && result2 == result3) {
                result1++;
                System.out.println(result1);
                return 1;
            } else if (result1 > result2 && result2 == result3) {
                result2++;
                return 2;
            }
            result3++;
            return 3;
        }
    }
}
