package kyu5;

public class NumberOfTrailingZerosOfN {
    public static void main(String[] args) {
        System.out.println(zeros(807479219));
    }

    public static int zeros(int n) {
        boolean isAlive = true;
        int summ = 0;
        while (isAlive) {
            n /= 5;
            summ += n;
            if (n < 5) {
                isAlive = false;
            }
        }
        return summ;
    }
}

