package kyu6;

//https://www.codewars.com/kata/593e84f16e836ca9a9000054/train/java
public class ReturnRandomly {
    static int result1;
    static int result2;
    static int result3;


    public static void main(String[] args) {
        System.out.println(oneTwoThree());
        System.out.println(oneTwoThree());
        System.out.println(oneTwoThree());

    }
    public  static int oneTwoThree() {
        if  (result1 == result2 && result2 == result3) {
            result1++;
            return 1;
        } else if (result1 > result2 && result2 >= result3) {
            result2++;
            return 2;
        } else if (result3 < result2 && result2 <= result1) {
            result3++;
            return 3;
        }
        assert false;
        return 0;
    }
}

