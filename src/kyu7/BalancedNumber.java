package kyu7;

//https://www.codewars.com/kata/5a4e3782880385ba68000018/train/java


public class BalancedNumber {
    public static void main(String[] args) {
        System.out.println(balancedNum(156504));

    }

    public static String balancedNum(long number) {
        int a = 0;
        int b = 0;
        String numberString = Long.toString(number);
        char[] charArray = numberString.toCharArray();

        int[] intArray = new int[charArray.length];
        for (int i = 0; i < charArray.length; i++) {
            intArray[i] = Character.getNumericValue(charArray[i]);
        }
        if (intArray.length <= 2) {
            return "Balanced";
        }
        if (intArray.length % 2 == 0) {
            int middle = intArray.length / 2 - 2;
            for (int i = 0; i <= middle; i++) {

                a += intArray[i];
                System.out.println("a" + a);
                b += intArray[intArray.length - 1 - i];
                System.out.println("b" + b);
                if (a == b) {
                    return "Balanced";
                } else {
                    return "Not balanced";
                }
            }

        } else {

        }
        return numberString;
    }
}


