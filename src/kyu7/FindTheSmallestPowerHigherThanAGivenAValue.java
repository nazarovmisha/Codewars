package kyu7;
//https://www.codewars.com/kata/56ba65c6a15703ac7e002075
public class FindTheSmallestPowerHigherThanAGivenAValue {
    public static void main(String[] args) {
        System.out.println(findNextPower(1245678, 5));
    }

    public static int findNextPower(int val, int pow_) {
        int number = 1;
        int result = 0;
        while (result <= val) {
            result = (int) Math.pow(number, pow_);
            number++;
        }
        return result;
    }
}


