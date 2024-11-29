package kyu5;

//https://www.codewars.com/kata/57f14afa5f2f226d7d0000f4/train/java


import java.util.Arrays;

public class SimpleEncryption4Qwerty {
    static String[] arr1 = {"q", "w", "e", "r", "t", "y", "u", "i", "o", "p"};
    static String[] arr1Shift = {"Q", "W", "E", "R", "T", "Y", "U", "I", "O", "P"};
    static String[] arr2 = {"a", "s", "d", "f", "g", "h", "j", "k", "l"};
    static String[] arr2Shift = {"A", "S", "D", "F", "G", "H", "J", "K", "L"};
    static String[] arr3 = {"z", "x", "c", "v", "b", "n", "m", ",", "."};
    static String[] arr3Shift = {"Z", "X", "C", "V", "B", "N", "M", "<", ">"};


    public static void main(String[] args) {
        System.out.println(encrypt(">fdd", 134));
        System.out.println(decrypt(encrypt(">fdd", 134), 134));
    }

    public static String encrypt(String text, int key) {

        String answer = "";
        String[] keyString = (String.valueOf(key)).split("");
        answer += add(arr1, text, Integer.parseInt(keyString[0]));
        answer += add(arr1Shift, text, Integer.parseInt(keyString[0]));
        answer += add(arr2, text, Integer.parseInt(keyString[1]));
        answer += add(arr2Shift, text, Integer.parseInt(keyString[1]));
        answer += add(arr3, text, Integer.parseInt(keyString[2]));
        answer += add(arr3Shift, text, Integer.parseInt(keyString[2]));
        return answer;
    }


    public static String add(String[] arr, String text, int key) {
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if (text.contains(arr[i])) {
                int a = i - key;
                if (a < 0) {
                    a = arr.length + a;
                    answer.append(arr[a]);
                }
            }//else {
           //     answer.append(arr[i]);
          //  }
        }
        return answer.toString();
    }

    public static String decrypt(String encryptedText, int key) {

        return encryptedText;
    }
}

