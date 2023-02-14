package kyu6;

//https://www.codewars.com/kata/5262119038c0985a5b00029f/train/java
//Define a function that takes an integer argument and returns a logical value true or false depending on if the integer is a prime.
//
//        Per Wikipedia, a prime number ( or a prime ) is a natural number greater than 1 that has no positive divisors other than 1 and itself.
//
//        Requirements
//        You can assume you will be given an integer input.
//        You can not assume that the integer will be only positive. You may be given negative numbers as well ( or 0 ).
//        NOTE on performance: There are no fancy optimizations required, but still the most trivial solutions might time out. Numbers go up to 2^31 ( or similar, depending on language ). Looping all the way up to n, or n/2, will be too slow.
//        Example
//        is_prime(1)  /* false */
//        is_prime(2)  /* true  */
//        is_prime(-1) /* false */
public class Prime {
    public static void main(String[] args) {

        System.out.println(isPrime(1764382811  ));

    }
    public static boolean isPrime(int num) {
        if (num <= 1||(num>2&&num%2==0||num>4&&num%3==0)) {
            return false;
        }
        int[] arr = new int[2];
        boolean isTrue = true;
        int k = 0;
        try {
            for (int i = 1; i <= num; i+=2) {
                if (num % i == 0) {
                    System.out.println(i);
                    arr[k] = i;
                    k++;
                }
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            isTrue = false;
        }
        return isTrue;
    }
}


