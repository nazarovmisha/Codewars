package kyu8;

//https://www.codewars.com/kata/5265326f5fda8eb1160004c8/train/java
//We need a function that can transform a number (integer) into a string.
//
//        What ways of achieving this do you know?
//
//        Examples (input --> output):
//        123  --> "123"
//        999  --> "999"
//        -100 --> "-100"
public class ConvertANumberToAString {
    public static void main(String[] args) {
        System.out.println(numberToString(100));
    }
    public static String numberToString(int num) {
     return Integer.toString(num);
    }

}
