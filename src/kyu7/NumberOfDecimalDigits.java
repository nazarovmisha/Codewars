package kyu7;

public class NumberOfDecimalDigits {
    public static void main(String[] args) {
        System.out.println(digits(10l));
    }
    public static int digits(long n) {
        int count=1;
        while (n>=10){
            n=n/10;
            count++;
        }
        return count;
    }
}
